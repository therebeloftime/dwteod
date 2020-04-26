package me.coodlude.edgeofdarkness.common.tileentity;

import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.network.packets.PacketDemat;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;

import javax.annotation.Nullable;

public class TileEntityTardis extends TileEntity implements ITickable {

    public int tardisID = 0;
    public int circuitID = 0;
    public float alpha = 0;
    public boolean isRemat = false, isDemat = false;

    public TileEntityTardis() {

    }

    @Override
    public void update() {

        if (isRemat || isDemat) {

            if (isRemat && alpha < 1) {
                alpha += 0.016f;
            } else if (isRemat) {
                isRemat = false;
            }

            if (isDemat && alpha > 0) {
                alpha -= 0.016f;
            } else if (isDemat) {
                isDemat = false;

                if (!world.isRemote) world.setBlockToAir(pos);
            }

            if (isRemat && isDemat) isDemat = false;
        }


        if(world.provider instanceof WorldProviderTardis) {
            if(!world.isRemote) world.setBlockToAir(pos);
        }
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
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setBoolean("isRemat", isRemat);
        compound.setBoolean("isDemat", isDemat);
        compound.setFloat("alpha", alpha);
        compound.setInteger("tardisID", tardisID);
        compound.setInteger("circuitID", circuitID);

        return compound;
    }

    @Override
    @Nullable
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(this.pos, 4, this.getUpdateTag());
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity packet) {
        readFromNBT(packet.getNbtCompound());
    }

    public void sendUpdates() {
        world.markBlockRangeForRenderUpdate(pos, pos);
        world.notifyBlockUpdate(pos, world.getBlockState(pos), world.getBlockState(pos), 3);
        world.scheduleBlockUpdate(pos, getBlockType(), 0, 0);
        markDirty();
    }

    public void setTardisID(int tardisID) {
        this.tardisID = tardisID;
    }

    public void setCircuitID(int circuitID) {
        this.circuitID = circuitID;
    }
}
