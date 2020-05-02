package me.coodlude.edgeofdarkness.common.items;

import me.coodlude.edgeofdarkness.common.init.ModBlocks;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.tardis.ConsoleRoom;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import static me.coodlude.edgeofdarkness.common.init.tardis.ConsoleRoom.*;

public class ItemTardisSpawner extends Item {


    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        worldIn.setBlockState(pos.up(), ModBlocks.tardis.getDefaultState());

        if (!worldIn.isRemote) {

            World world = worldIn.getMinecraftServer().getWorld(ModDimension.TARDISID);
            TileEntityTardis tileEntityTardis = (TileEntityTardis) worldIn.getTileEntity(pos.up());

            if (tileEntityTardis != null) {
                tileEntityTardis.tardisID = TardisHandler.addTardis();
                tileEntityTardis.rotation = (-player.rotationYaw) - 180;
                tileEntityTardis.sendUpdates();
                ConsoleRoom.ROOM_LIST.get(1).generate((WorldServer) world, new BlockPos(0, 50, 0));
            }

            tileEntityTardis.setRemat(true);
        }

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}