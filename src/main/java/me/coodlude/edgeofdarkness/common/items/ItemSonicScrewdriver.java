package me.coodlude.edgeofdarkness.common.items;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemSonicScrewdriver extends Item {

    public ItemSonicScrewdriver() {
        super();
        setMaxStackSize(1);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        IBlockState block = worldIn.getBlockState(pos);

        if (!worldIn.isRemote) {

            if (block.getBlock() == Blocks.TNT) {
                worldIn.setBlockToAir(pos);
                EntityTNTPrimed tntPrimed = new EntityTNTPrimed(worldIn, pos.getX(), pos.getY(), pos.getZ(), player);
                worldIn.playSound(null, pos, SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.tnt.primed")), SoundCategory.BLOCKS, 1, 1);
                worldIn.spawnEntity(tntPrimed);
            }
        }


        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}