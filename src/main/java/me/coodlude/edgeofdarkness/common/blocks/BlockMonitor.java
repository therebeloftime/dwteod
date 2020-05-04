package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.gui.GuiTardisCoords;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.ModGuiHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.network.packets.Packet_OpenGui;
import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.function.Supplier;

public class BlockMonitor extends BlockTileBase implements IHaveItem {


    public BlockMonitor(Supplier<TileEntity> tileEntitySupplier) {
        super(tileEntitySupplier);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if (!worldIn.isRemote && worldIn.provider instanceof WorldProviderTardis) {
            int id = TardisHandler.getTardisIDFromPos(pos);
            NetworkHandler.NETWORK.sendTo(new Packet_OpenGui(ModGuiHandler.GUI_MONITOR_COORD, pos, EdgeOfDarkness.JSON.toJson(TardisHandler.getTardis(id)), EdgeOfDarkness.JSON.toJson(getDimensions())), (EntityPlayerMP) playerIn);
        }

        return true;
    }

    public Integer[] getDimensions() {
        Integer[] dims = DimensionManager.getStaticDimensionIDs();
        ArrayList<Integer> dim_save = new ArrayList<>();

        for(int dim : dims) {
            if(dim != ModDimension.TARDISID) {
                dim_save.add(dim);
            }
        }

        return dim_save.toArray(new Integer[dim_save.size()]);
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
