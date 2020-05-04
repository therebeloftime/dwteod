package me.coodlude.edgeofdarkness.common.tileentity;

import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.network.packets.PacketDemat;
import me.coodlude.edgeofdarkness.util.helper.TeleportUtils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class TileEntityTardis extends TileEntityBase implements ITickable {

    public int tardisID = 0;
    public int circuitID = 0;
    public float alpha = 0;
    public boolean isRemat = false, isDemat = false;
    public boolean open = false;
    public int door_rotation = 0;

    public TileEntityTardis() {

    }

    @Override
    public void update() {


        if (isRemat || isDemat) {

            if (open) {
                setOpen(false);
            }

            if (isRemat && alpha < 1) {
                alpha += 0.01f;
            } else if (isRemat) {
                isRemat = false;
            }

            if (isDemat && alpha > 0) {
                alpha -= 0.005f;
            } else if (isDemat) {
                isDemat = false;

                if (!world.isRemote) world.setBlockToAir(pos);
            }

            if (isRemat && isDemat) isDemat = false;
        }


        if (!world.isRemote) {
            TardisInfo info = getTardisInfo();


            if (info != null) {
                if (open) {
                    if (door_rotation < 45) {
                        door_rotation += 2;
                        sendUpdates();
                    }
                } else {
                    if (door_rotation > 0) {
                        door_rotation -= 3;
                        sendUpdates();
                    }
                }
            }
        }

        if (!world.isRemote) {
            if (world.provider instanceof WorldProviderTardis) {
                //  world.setBlockToAir(pos);
            }

            TardisInfo info = getTardisInfo();

            if (world.getWorldTime() % 200 == 0) {
                if (!TardisHandler.doesTardisExist(tardisID) || (info != null && info.getExtereriorPos().toLong() != pos.toLong())) {
                    world.setBlockToAir(pos);
                }
            }

            if (info != null) {

                if (open && info.isLocked()) {
                    setOpen(false);
                }

                if (circuitID != info.circuitID) {
                    circuitID = info.circuitID;
                    sendUpdates();
                }

                if (open != info.isOpen()) {
                    setOpen(info.isOpen());
                }

                if (open || (isRemat && info.travelTime < 50 && info.travelTime > 0)) {
                    AxisAlignedBB bb = new AxisAlignedBB(getPos()).contract(0.5, 0, 0.5);
                    List<EntityLivingBase> entityList = world.getEntitiesWithinAABB(EntityLivingBase.class, bb);

                    if (entityList.size() > 0) {
                        EntityLivingBase base = entityList.get(0);

                        if (base instanceof EntityPlayer) {
                            EntityPlayer playerIn = (EntityPlayer) base;
                            ITardisCapability capability = playerIn.getCapability(CapTardisStorage.CAPABILITY, null);
                            capability.setTardisID(tardisID);
                            capability.sync();

                            setOpen(false);
                            BlockPos ip = info.getInteriorPos();
                            TeleportUtils.teleportToDimension(playerIn, ModDimension.TARDISID, ip.getX(), ip.getY(), ip.getZ(), 0, info.interiorSpawnRotation);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onChunkUnload() {
        super.onChunkUnload();

        if (isDemat && !world.isRemote) {
            world.setBlockToAir(pos);
        }
    }

    @Override
    public void onLoad() {
        super.onLoad();

        if (world.isRemote) reset();
    }

    public void setRemat(boolean remat) {
        isRemat = remat;

        if (remat) {
            setDemat(false);
            world.playSound(null, pos, ModSounds.SHORT_REMAT, SoundCategory.BLOCKS, 1, 1);
            sendDemat(false);
        }
    }

    public void setDemat(boolean demat) {
        isDemat = demat;

        if (demat) {
            setRemat(false);
            world.playSound(null, pos, ModSounds.DEMAT, SoundCategory.BLOCKS, 1, 1);
            sendDemat(true);
        }
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public void setAlphalevel(float alphaLevel) {
        this.alpha = alphaLevel;
    }

    public void switchDematState() {
        if (isRemat || isDemat) {
            if (isRemat) setDemat(true);
            else if (isDemat) setRemat(true);
        }
    }

    public void reset() {
        isRemat = false;
        isDemat = false;
        alpha = 1;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
        sendUpdates();


        if (getTardisInfo() != null) getTardisInfo().setOpen(open);
    }

    public void sendDemat(boolean isDemat) {
        if (!world.isRemote) {
            NetworkHandler.NETWORK.sendToAll(new PacketDemat(pos, isDemat));
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        isRemat = compound.getBoolean("isRemat");
        isDemat = compound.getBoolean("isDemat");
        alpha = compound.getFloat("alpha");
        tardisID = compound.getInteger("tardisID");
        circuitID = compound.getInteger("circuitID");
        open = compound.getBoolean("open");
        door_rotation = compound.getInteger("door_rotation");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setBoolean("isRemat", isRemat);
        compound.setBoolean("isDemat", isDemat);
        compound.setFloat("alpha", alpha);
        compound.setInteger("tardisID", tardisID);
        compound.setInteger("circuitID", circuitID);
        compound.setBoolean("open", open);
        compound.setInteger("door_rotation", door_rotation);

        return compound;
    }

    public TardisInfo getTardisInfo() {
        return TardisHandler.getTardis(tardisID);
    }

    public void setTardisID(int tardisID) {
        this.tardisID = tardisID;
    }

    public void setCircuitID(int circuitID) {
        this.circuitID = circuitID;
    }
}
