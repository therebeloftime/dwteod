package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.client.gui.GuiTardisCoords;
import me.coodlude.edgeofdarkness.client.gui.GuiTardisDim;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class ModGuiHandler implements IGuiHandler {

    public static final int GUI_MONITOR_COORD = 0x0;
    public static final int GUI_MONITOR_DIM = 0x1;


    public static Object openGui(int id, EntityPlayer player, World world, int x, int y, int z, String... args) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        switch (id) {
            case GUI_MONITOR_COORD:
                return new GuiTardisCoords(args);
            case GUI_MONITOR_DIM:
                return new GuiTardisDim(args);
            default:
                return null;
        }
    }


    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return openGui(ID, player, world, x, y, z);
    }
}
