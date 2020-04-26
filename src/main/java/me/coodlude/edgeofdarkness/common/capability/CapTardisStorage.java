package me.coodlude.edgeofdarkness.common.capability;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CapTardisStorage implements Capability.IStorage<ITardisCapability> {

    @CapabilityInject(ITardisCapability.class)
    public static Capability<CapabilityTardis> CAPABILITY = null;

    @Override
    public NBTBase writeNBT(Capability<ITardisCapability> capability, ITardisCapability instance, EnumFacing side) {
        return instance.serializeNBT();
    }

    @Override
    public void readNBT(Capability<ITardisCapability> capability, ITardisCapability instance, EnumFacing side, NBTBase nbt) {
        instance.deserializeNBT(nbt instanceof NBTTagCompound ? (NBTTagCompound) nbt : new NBTTagCompound());
    }

    public static class TardisCapProvider implements ICapabilitySerializable<NBTTagCompound> {

        CapabilityTardis cap;

        public TardisCapProvider(EntityPlayer player) {
            this.cap = new CapabilityTardis(player);
        }

        @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
            return capability == CAPABILITY;
        }

        @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
            return capability == CAPABILITY ? (T) cap : null;
        }

        @Override
        public NBTTagCompound serializeNBT() {
            return (NBTTagCompound) CapTardisStorage.CAPABILITY.getStorage().writeNBT(CapTardisStorage.CAPABILITY, cap, null);
        }

        @Override
        public void deserializeNBT(NBTTagCompound nbt) {
            CapTardisStorage.CAPABILITY.getStorage().readNBT(CapTardisStorage.CAPABILITY, cap, null, nbt);
        }
    }
}
