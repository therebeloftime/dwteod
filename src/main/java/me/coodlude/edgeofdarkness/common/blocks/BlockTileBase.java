package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.common.tileentity.TileEntityBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
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

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);

        if(!worldIn.isRemote) {
            TileEntity te = worldIn.getTileEntity(pos);

            if(te != null && te instanceof TileEntityBase) {
                ((TileEntityBase) te).rotation = (placer.rotationYaw) - 270;
                 ((TileEntityBase) te).sendUpdates();
            }
        }
    }
}
