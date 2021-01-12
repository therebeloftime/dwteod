package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityDoor;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class BlockDoor extends BlockTileBase implements IHaveItem {


    public BlockDoor(Supplier<TileEntity> tileEntitySupplier) {
        super(tileEntitySupplier);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        int id = TardisHandler.getIDFromCoords(pos);

        if (!worldIn.isRemote && worldIn.provider instanceof WorldProviderTardis) {


           if (TardisHandler.doesTardisExist(id)) {
                TardisInfo info = TardisHandler.tardises.get(id);
                TileEntityTardis tileEntityTardis = TardisHandler.getTardisTile(id);
               TileEntityDoor door = (TileEntityDoor) worldIn.getTileEntity(pos);

                if (!info.isInFlight() && tileEntityTardis != null) {
                    door.open = !door.open;
                    door.sendUpdates();
                } else {
                    playerIn.sendStatusMessage(new TextComponentTranslation("msg.tardis.inflight"), true);
                }
            }
        }

        if (!worldIn.isRemote) {
            TileEntityTardis tileEntityTardis = TardisHandler.getTardisTile(id);
            if (tileEntityTardis != null) {
                tileEntityTardis.reset();
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
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return super.getBoundingBox(state, source, pos);
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {

        if(worldIn.getTileEntity(pos) != null && worldIn.getTileEntity(pos) instanceof TileEntityDoor) {
            if(((TileEntityDoor) worldIn.getTileEntity(pos)).open) {
                return Block.NULL_AABB;
            }
        }

        return super.getCollisionBoundingBox(blockState, worldIn, pos);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
