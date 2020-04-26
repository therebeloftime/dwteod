package me.coodlude.edgeofdarkness.common.capability;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;


public interface ITardisCapability extends INBTSerializable<NBTTagCompound> {

    void update();

    void sync();

    void setFlight(boolean flight);

    boolean isInFlight();

    void setTardisID(int id);

    int getTardisID();
}
