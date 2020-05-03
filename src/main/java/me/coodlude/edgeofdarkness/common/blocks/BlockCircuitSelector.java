package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
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

public class BlockCircuitSelector extends BlockTileBase implements IHaveItem {


    public BlockCircuitSelector(Supplier<TileEntity> tileEntitySupplier) {
        super(tileEntitySupplier);
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if (!worldIn.isRemote && worldIn.provider instanceof WorldProviderTardis) {
            TardisInfo info = TardisHandler.getTardis(TardisHandler.getTardisIDFromPos(pos));


            if(info != null) {
                if(info.circuitID + 1 <= (TardisSkinRegistry.circuitList.size() - 1)) {
                    info.setCircuitID(info.circuitID + 1);
                }else{
                    info.setCircuitID(0);
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
