package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.init.tardis.events.EventLeaveTardis;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import me.coodlude.edgeofdarkness.util.helper.TeleportUtils;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import java.util.function.Supplier;

public class BlockDoor extends BlockTileBase implements IHaveItem {


    public BlockDoor(Supplier<TileEntity> tileEntitySupplier) {
        super(tileEntitySupplier);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {


        if (!worldIn.isRemote) {
            ITardisCapability capability = playerIn.getCapability(CapTardisStorage.CAPABILITY, null);


            if (TardisHandler.doesTardisExist(capability.getTardisID())) {
                TardisInfo info = TardisHandler.tardises.get(capability.getTardisID());
                TileEntityTardis tileEntityTardis = TardisHandler.getTardisTile(capability.getTardisID());

                if (!info.isInFlight() && tileEntityTardis != null) {
                    BlockPos leavePos = TardisHandler.getExitPosition(capability.getTardisID());
                    MinecraftForge.EVENT_BUS.post(new EventLeaveTardis(playerIn, capability.getTardisID()));
                    TeleportUtils.teleportToDimension(playerIn, info.getExteriorDim(), leavePos.getX(), leavePos.getY(), leavePos.getZ(), 0, tileEntityTardis.rotation);
                } else {
                    playerIn.sendStatusMessage(new TextComponentTranslation("msg.tardis.inflight"), true);
                }
            }
        }

        return true;
    }

    @Override
    public boolean canBeConnectedTo(IBlockAccess world, BlockPos pos, EnumFacing facing) {
        return false;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.INVISIBLE;
    }

    @Override
    public boolean isNormalCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
