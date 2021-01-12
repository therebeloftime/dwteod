package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.common.tileentity.TileEntityFlightPanel;
import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class BlockFlightPanel extends BlockTileBase implements IHaveItem {


    public BlockFlightPanel(Supplier<TileEntity> tileEntitySupplier) {
        super(tileEntitySupplier);
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if (!worldIn.isRemote) {
            TileEntityFlightPanel tileEntityFlightPanel = (TileEntityFlightPanel) worldIn.getTileEntity(pos);

            if(tileEntityFlightPanel != null) {
                tileEntityFlightPanel.setShown(!tileEntityFlightPanel.shown);
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
