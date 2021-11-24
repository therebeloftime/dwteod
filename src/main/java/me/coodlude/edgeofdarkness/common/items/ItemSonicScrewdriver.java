package me.coodlude.edgeofdarkness.common.items;

import me.coodlude.edgeofdarkness.common.init.ModSounds;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
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

        boolean actionPerformed = false;

        if (!worldIn.isRemote) {

            if (block.getBlock() == Blocks.TNT) {
                worldIn.setBlockToAir(pos);
                EntityTNTPrimed tntPrimed = new EntityTNTPrimed(worldIn, pos.getX() + 0.5d, pos.getY(), pos.getZ() + 0.5d, player);
                worldIn.playSound(null, pos, SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
                worldIn.playSound(null, pos, ModSounds.SONIC_SCREWDRIVER_IGNITE, SoundCategory.BLOCKS, 1, 1);
                worldIn.spawnEntity(tntPrimed);
                actionPerformed = true;
            }

            if (block.getBlock() == Blocks.REDSTONE_LAMP) {
                worldIn.setBlockState(pos, Blocks.LIT_REDSTONE_LAMP.getDefaultState());
                actionPerformed = true;
            }


            if (block.getBlock() instanceof BlockDoor) {

                boolean open = block.getValue(BlockDoor.OPEN);

                BlockDoor door = (BlockDoor) block.getBlock();


                if (worldIn.getBlockState(pos.add(0, -1, 0)).getBlock() == Blocks.IRON_DOOR) {
                    open = worldIn.getBlockState(pos.add(0, -1, 0)).getValue(BlockDoor.OPEN);
                    door.toggleDoor(worldIn, pos.add(0, -1, 0), !open);
                    worldIn.playSound(null, pos, ModSounds.SONIC_SCREWDRIVER_DOOR, SoundCategory.BLOCKS, 1, 1);
                    worldIn.setBlockState(pos, block.withProperty(BlockDoor.OPEN, !open), 2);
                    worldIn.markBlockRangeForRenderUpdate(pos.add(0, -1, 0), pos.add(0, -1, 0));
                    worldIn.notifyBlockUpdate(pos.add(0, -1, 0), worldIn.getBlockState(pos), worldIn.getBlockState(pos), 3);
                    actionPerformed = true;
                } else {
                    door.toggleDoor(worldIn, pos, !open);
                }
                worldIn.markBlockRangeForRenderUpdate(pos, pos);
            }

            if (!actionPerformed) {
                worldIn.playSound(null, pos, ModSounds.SONIC_SCREWDRIVER_IDLE, SoundCategory.BLOCKS, 1, 1);
            }
        }


        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}