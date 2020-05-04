package me.coodlude.edgeofdarkness.common.tileentity;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;

public class TileEntityDematLever extends TileEntityBase implements ITickable {

    public float rotationlever = 0;
    public int tardisID = 0;

    @Override
    public void update() {
        if (!world.isRemote && world.provider instanceof WorldProviderTardis) {
            if (tardisID == 0 || (tardisID != 0 && world.getWorldTime() % 3600 == 0)) {
                tardisID = TardisHandler.getTardisIDFromPos(pos);
            }


            if (tardisID != 0) {
                TardisInfo info = TardisHandler.getTardis(tardisID);

                if(rotationlever != (info.isInFlight() ? 1.58 : 0)) {
                    rotationlever = TileEntityCircuitSelector.interpolate(rotationlever, (info.isInFlight() ? 1.58f : 0), (info.isInFlight() ? 0.1f : 0.05f));
                    sendUpdates();
                }
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        compound.setFloat("rotation_lever", rotationlever);
        compound.setInteger("tardis_id", tardisID);

        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        rotationlever = compound.getFloat("rotation_lever");
        tardisID = compound.getInteger("tardis_id");
    }
}
