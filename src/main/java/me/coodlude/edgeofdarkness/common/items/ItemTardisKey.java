package me.coodlude.edgeofdarkness.common.items;

import me.coodlude.edgeofdarkness.common.init.ModBlocks;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.tardis.ConsoleRoom;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ItemTardisKey extends Item {

    public ItemTardisKey() {
        setMaxStackSize(1);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if (!player.isSneaking()) {


            worldIn.setBlockState(pos.up(), ModBlocks.tardis.getDefaultState());

            if (!worldIn.isRemote) {

                World world = worldIn.getMinecraftServer().getWorld(ModDimension.TARDISID);
                TileEntityTardis tileEntityTardis = (TileEntityTardis) worldIn.getTileEntity(pos.up());

                if (tileEntityTardis != null) {
                    ConsoleRoom.ROOM_LIST.get(0).generate((WorldServer) world, new BlockPos(0, 1, 0));
                }


                tileEntityTardis.setRemat(true);
            }

        }

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
