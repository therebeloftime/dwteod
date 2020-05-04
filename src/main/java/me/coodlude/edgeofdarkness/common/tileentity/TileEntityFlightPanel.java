package me.coodlude.edgeofdarkness.common.tileentity;


import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;

public class TileEntityFlightPanel extends TileEntityBase implements ITickable {

    public boolean shown = false;
    public int tardisID = 0;
    public float translate = 0.52f;
    public TardisInfo info;

    @Override
    public void update() {
        if (!world.isRemote && world.provider instanceof WorldProviderTardis) {
            if (tardisID == 0 || (tardisID != 0 && world.getWorldTime() % 3600 == 0)) {
                tardisID = TardisHandler.getTardisIDFromPos(pos);
            }
        }

        if (world.isRemote) {
            if (translate != (shown ? 0 : 0.52f)) {
                translate = TileEntityCircuitSelector.interpolate(translate, (shown ? 0 : 0.52f), 0.01f);
            }
        } else {
            if (tardisID != 0 && TardisHandler.doesTardisExist(tardisID) && shown) {
                TardisInfo infos = TardisHandler.getTardis(tardisID);

                if (infos != null) {
                    this.info = infos;
                    sendUpdates();
                }
            }
        }
    }

    public void setShown(boolean shown) {
        this.shown = shown;
        sendUpdates();
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("tardisID", tardisID);
        compound.setBoolean("shown", shown);

        if(info != null)
        compound.setString("info", EdgeOfDarkness.JSON.toJson(info));

        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        tardisID = compound.getInteger("tardisID");
        shown = compound.getBoolean("shown");

        if(compound.hasKey("info"))
        info = EdgeOfDarkness.JSON.fromJson(compound.getString("info"), TardisInfo.class);
    }
}
