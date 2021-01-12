package me.coodlude.edgeofdarkness.common.tileentity;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.util.helper.TeleportUtils;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class TileEntityDoor extends TileEntityBase implements ITickable {

    public boolean open;
    public float rotation_door;

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        compound.setBoolean("open", open);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.open = compound.getBoolean("open");
    }

    @Override
    public void update() {
        if(world == null) return;



        if(world.isRemote) {

            if(open) {
                if(rotation_door < 1.5) {
                    rotation_door += 0.05f;
                }else{
                    rotation_door = 1.5f;
                }
            }else{
                if(rotation_door > 0) {
                    rotation_door -= 0.05f;
                }else{
                    rotation_door = 0;
                }
            }
        }else{
            List<EntityPlayer> entityList = world.getEntitiesWithinAABB(EntityPlayer.class, Block.FULL_BLOCK_AABB.offset(pos).contract(0.5,0,0.5));

            if(entityList.size() > 0) {
                int id = TardisHandler.getIDFromCoords(pos);
                if (TardisHandler.doesTardisExist(id)) {
                    TardisInfo info = TardisHandler.tardises.get(id);
                    TileEntityTardis tileEntityTardis = TardisHandler.getTardisTile(id);

                    if (!info.isInFlight() && tileEntityTardis != null) {
                        BlockPos leavePos = TardisHandler.getExitPosition(id);
                        TeleportUtils.teleportToDimension(entityList.get(0), info.getExteriorDim(), leavePos.getX(), leavePos.getY(), leavePos.getZ(), 0, tileEntityTardis.rotation);
                        open = false;
                        sendUpdates();
                    }
                }
            }
        }
    }


}
