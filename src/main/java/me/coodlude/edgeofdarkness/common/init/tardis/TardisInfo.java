package me.coodlude.edgeofdarkness.common.init.tardis;

import net.minecraft.util.math.BlockPos;

public class TardisInfo {

    public int tardisID;

    public BlockPos extereriorPos = BlockPos.ORIGIN;
    public int exteriorDim = 0;

    public BlockPos interiorPos = BlockPos.ORIGIN;
    public float interiorSpawnRotation = 0;


    public void setTardisID(int tardisID) {
        this.tardisID = tardisID;
    }

    public int getTardisID() {
        return tardisID;
    }

    public void setExtereriorPos(BlockPos extereriorPos) {
        this.extereriorPos = extereriorPos;
    }

    public BlockPos getExtereriorPos() {
        return extereriorPos;
    }

    public void setExteriorDim(int exteriorDim) {
        this.exteriorDim = exteriorDim;
    }

    public int getExteriorDim() {
        return exteriorDim;
    }

    public void setInteriorPos(BlockPos interiorPos) {
        this.interiorPos = interiorPos;
    }

    public BlockPos getInteriorPos() {
        return interiorPos;
    }

    public void setInteriorSpawnRotation(float interiorSpawnRotation) {
        this.interiorSpawnRotation = interiorSpawnRotation;
    }

    public float getInteriorSpawnRotation() {
        return interiorSpawnRotation;
    }
}
