package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
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
import java.util.List;
import java.util.function.Supplier;

public class BlockTardis extends BlockTileBase {

    public static AxisAlignedBB tardis_bb = new AxisAlignedBB(0, 0, 0, 1, 2, 1);

    public BlockTardis(Supplier<TileEntity> tileEntitySupplier) {
        super(tileEntitySupplier);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {


        if (!worldIn.isRemote) {
            TileEntity te = worldIn.getTileEntity(pos);

            if (te != null && te instanceof TileEntityTardis) {
                TileEntityTardis tileEntityTardis = (TileEntityTardis) te;

                TardisInfo info = TardisHandler.tardises.get(tileEntityTardis.tardisID);

                if (!playerIn.isSneaking() && !info.isLocked()) {
                    info.setExtereriorPos(tileEntityTardis.getPos());
                    info.setExteriorDim(worldIn.provider.getDimension());
                    tileEntityTardis.setOpen(!tileEntityTardis.open);
                } else if (info.isLocked()) {
                    playerIn.sendStatusMessage(new TextComponentTranslation("msg.tardis.locked"), true);
                }
            }
        }

        return true;
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return tardis_bb;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return tardis_bb;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        TileEntityTardis tileEntityTardis = (TileEntityTardis) worldIn.getTileEntity(pos);

        if (tileEntityTardis == null || !TardisHandler.doesTardisExist(tileEntityTardis.tardisID) || (TardisHandler.doesTardisExist(tileEntityTardis.tardisID) && !tileEntityTardis.open)) {
            super.addCollisionBoxToList(state, worldIn, pos, entityBox, collidingBoxes, entityIn, isActualState);
        }
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos) {
        TileEntityTardis tardis = (TileEntityTardis) world.getTileEntity(pos);
        if (tardis != null && TardisHandler.doesTardisExist(tardis.tardisID)) {
            return new AxisAlignedBB(0, 0, 0, 0, 0, 0);
        }
        return super.getSelectedBoundingBox(state, world, pos);
    }

    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
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
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
