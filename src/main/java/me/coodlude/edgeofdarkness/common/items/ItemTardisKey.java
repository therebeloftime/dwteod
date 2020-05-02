package me.coodlude.edgeofdarkness.common.items;

import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.tardis.ConsoleRoom;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ItemTardisKey extends Item {

    public ItemTardisKey() {
        setMaxStackSize(1);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if (!player.isSneaking()) {

            if (!(worldIn.provider instanceof WorldProviderTardis)) {//  worldIn.setBlockState(pos.up(), ModBlocks.tardis.getDefaultState());

                if (!worldIn.isRemote) {

                    ITardisCapability capability = player.getCapability(CapTardisStorage.CAPABILITY, null);
                    TardisInfo info = TardisHandler.getTardis(capability.getTardisID());

                    if(info != null) {
                        info.setExteriorRotation((-player.rotationYaw) - 180);
                        TardisHandler.summonTardisKey((EntityPlayerMP) player, capability.getTardisID(), pos.up(), player.dimension);
                        info.save();
                    }

                }
            }
        } else {
            if (!worldIn.isRemote) {
                TileEntity te = worldIn.getTileEntity(pos);

                if (te != null && te instanceof TileEntityTardis) {
                    TileEntityTardis tileEntityTardis = (TileEntityTardis) te;
                    TardisInfo info = TardisHandler.tardises.get(tileEntityTardis.tardisID);
                    info.setLocked(!info.isLocked());
                    player.sendStatusMessage(new TextComponentTranslation((info.isLocked() ? "msg.tardis.lock" : "msg.tardis.unlock")), true);
                }
            }
        }

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
