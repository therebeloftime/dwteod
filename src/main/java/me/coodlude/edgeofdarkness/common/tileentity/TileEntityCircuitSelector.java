package me.coodlude.edgeofdarkness.common.tileentity;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;

public class TileEntityCircuitSelector extends TileEntityBase implements ITickable {

    public int tardisID = 0;
    public int circuitID = 0;
    public int doorOpen = 0;
    public float alpha = 1;


    @Override
    public void update() {

        if (!world.isRemote && world.provider instanceof WorldProviderTardis) {
            if (tardisID == 0 || (tardisID != 0 && world.getWorldTime() % 3600 == 0)) {
                tardisID = TardisHandler.getTardisIDFromPos(pos);
            }


            if (tardisID != 0) {
                TardisInfo info = TardisHandler.getTardis(tardisID);


                if (info != null) {

                    if (circuitID != info.circuitID || doorOpen != (info.isOpen() ? 45 : 0) || alpha != (info.inFlight ? 0 : 1)) {
                        circuitID = info.circuitID;
                        doorOpen = (int) interpolate(doorOpen, (info.isOpen() ? 45 : 0), 1);
                        alpha = interpolate(alpha, (info.inFlight ? 0 : 1), 0.01f);
                        sendUpdates();
                    }
                }
            }
        }
    }

    public static float interpolate(float curr, float fi, float per) {
        float f = curr;

        if (curr < fi) {
            f = curr + per;

            if (f > fi) {
                f = fi;
            }

        } else if (curr != fi) {
            f = curr - per;

            if (f < fi) {
                f = fi;
            }
        }


        return f;
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("circuitID", circuitID);
        compound.setInteger("tardisID", tardisID);
        compound.setInteger("door", doorOpen);
        compound.setFloat("alpha", alpha);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        circuitID = compound.getInteger("circuitID");
        tardisID = compound.getInteger("tardisID");
        doorOpen = compound.getInteger("door");
        alpha = compound.getFloat("alpha");
    }
}