package me.coodlude.edgeofdarkness.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class BlockTileBase extends Block {

   public Supplier<TileEntity> tileEntitySupplier;

    public BlockTileBase(Supplier<TileEntity> tileEntitySupplier) {
        super(Material.BARRIER);
        this.tileEntitySupplier = tileEntitySupplier;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return tileEntitySupplier.get() != null;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return tileEntitySupplier.get();
    }
}
