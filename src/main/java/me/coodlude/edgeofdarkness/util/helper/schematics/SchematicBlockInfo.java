package me.coodlude.edgeofdarkness.util.helper.schematics;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class SchematicBlockInfo {

    public int blockState;
    public BlockPos pos;
    public String nbtData;
    public transient NBTTagCompound compound;
    public boolean isTileEntity = false;
    public BlockPos reference;


    public SchematicBlockInfo(IBlockState state, TileEntity tileEntity, BlockPos referencePos, BlockPos ogPos) {
        this.blockState = Block.getStateId(state);
        this.reference = referencePos;
        this.pos = ogPos;

        if (tileEntity != null) {
            isTileEntity = true;
            NBTTagCompound tagCompound = tileEntity.serializeNBT();

            if (tagCompound != null) {
                nbtData = tagCompound.toString();
            }
        }
    }

    public IBlockState getBlockState() {
        return Block.getStateById(blockState);
    }

    public NBTTagCompound getTileTag() {
        return compound;
    }

    public boolean isTileEntity() {
        return isTileEntity;
    }

    public BlockPos getReference() {
        return reference;
    }
}

