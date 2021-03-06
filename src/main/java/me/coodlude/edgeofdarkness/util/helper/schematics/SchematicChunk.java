package me.coodlude.edgeofdarkness.util.helper.schematics;

import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class SchematicChunk {

    public List<SchematicBlockInfo> schematicBlocks = new ArrayList<>();
    public BlockPos pPos;
    public int dimID;
    public boolean done = false;
    public boolean ignoreAir = false;

    public void addBlock(SchematicBlockInfo blockInfo) {
        schematicBlocks.add(blockInfo);
    }

    public List<SchematicBlockInfo> getSchematicBlocks() {
        return schematicBlocks;
    }

    public void setQueuePos(BlockPos blockPos) {
        this.pPos = blockPos;
    }


    public void setDimID(int dimID) {
        this.dimID = dimID;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setIgnoreAir(boolean ignoreAir) {
        this.ignoreAir = ignoreAir;
    }

    public BlockPos getQueuePos() {
        return pPos;
    }
}
