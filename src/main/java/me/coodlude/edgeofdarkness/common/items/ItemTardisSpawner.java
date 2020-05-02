package me.coodlude.edgeofdarkness.common.items;

import me.coodlude.edgeofdarkness.common.init.ModBlocks;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemTardisSpawner extends Item {

    public ItemTardisSpawner() {
        super();
        setMaxStackSize(1);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        worldIn.setBlockState(pos.up(), ModBlocks.tardis.getDefaultState());

        if (!worldIn.isRemote) {

            World world = worldIn.getMinecraftServer().getWorld(ModDimension.TARDISID);
            TileEntityTardis tileEntityTardis = (TileEntityTardis) worldIn.getTileEntity(pos.up());

            if (tileEntityTardis != null) {
                int id = TardisHandler.addTardis();
                tileEntityTardis.tardisID = id;
                tileEntityTardis.rotation = (-player.rotationYaw) - 180;
                TardisInfo info = TardisHandler.getTardis(id);
                BlockPos centered = TardisHandler.getCenteredTardisPos(id);
                TardisSkinRegistry.main.generateInterior(world, centered);
                info.setInteriorSpawnRotation(TardisSkinRegistry.main.rotation_int);
                Vec3d offset = TardisSkinRegistry.main.offset;
                info.setInteriorPos(centered.add(offset.x, offset.y, offset.z));
                info.setExterior(pos.up(), player.dimension);
                info.setDestination(pos.up(), player.dimension);
                tileEntityTardis.sendUpdates();
                info.save();
                player.getHeldItem(hand).setCount(0);
            }

            tileEntityTardis.setRemat(true);
        }

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
