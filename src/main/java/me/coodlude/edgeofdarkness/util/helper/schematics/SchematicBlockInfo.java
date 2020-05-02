package me.coodlude.edgeofdarkness.util.helper.schematics;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class SchematicBlockInfo {

    public IBlockState blockState;
    public BlockPos pos;
    public NBTTagCompound tileTag = new NBTTagCompound();
    public boolean isTileEntity = false;
    public BlockPos reference;


    public SchematicBlockInfo(IBlockState state, TileEntity tileEntity, BlockPos referencePos, BlockPos ogPos) {
        this.blockState = state;
        this.reference = referencePos;
        this.pos = ogPos;

        if (tileEntity != null) {
            isTileEntity = true;
            NBTTagCompound tagCompound = tileEntity.serializeNBT();

            if (tagCompound != null) {
                tileTag = tagCompound;
            }
        }
    }

    public IBlockState getBlockState() {
        return blockState;
    }

    public NBTTagCompound getTileTag() {
        return tileTag;
    }

    public boolean isTileEntity() {
        return isTileEntity;
    }

    public BlockPos getReference() {
        return reference;
    }
}

