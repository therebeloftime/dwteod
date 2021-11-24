package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.common.init.ModBlocks;
import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import java.util.Random;

public class BlockInvertedRedstoneLamp extends Block implements IHaveItem
{
    private final boolean isOn;

    public BlockInvertedRedstoneLamp(boolean isOn) {
        super(Material.REDSTONE_LIGHT);
        this.isOn = isOn;

        if (!isOn) {
            this.setLightLevel(1.0F);
        }
    }

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            if (this.isOn && !worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.lit_inverted_redstone_lamp.getDefaultState(), 2);
            }
            else if (!this.isOn && worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.inverted_redstone_lamp.getDefaultState(), 2);
            }
        }
    }

    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (!worldIn.isRemote)
        {
            if (this.isOn && !worldIn.isBlockPowered(pos))
            {
                worldIn.scheduleUpdate(pos, this, 4);
            }
            else if (!this.isOn && worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.inverted_redstone_lamp.getDefaultState(), 2);
            }
        }
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if (this.isOn && !worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.lit_inverted_redstone_lamp.getDefaultState(), 2);
            }
        }
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(Blocks.REDSTONE_LAMP);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(Blocks.REDSTONE_LAMP);
    }

    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(Blocks.REDSTONE_LAMP);
    }
}
