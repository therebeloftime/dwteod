package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class BlockTardis extends BlockTileBase implements IHaveItem {

    public BlockTardis(Material blockMaterialIn, Supplier<TileEntity> tileEntitySupplier) {
        super(blockMaterialIn, tileEntitySupplier);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public boolean hasItem() {
        return true;
    }
}