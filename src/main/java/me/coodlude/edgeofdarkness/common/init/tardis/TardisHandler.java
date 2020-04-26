package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.common.init.ModBlocks;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber
public class TardisHandler {

    public static HashMap<Integer, TardisInfo> tardises = new HashMap<>();


    public static int addTardis() {
        int id = tardises.size() + 1;
        TardisInfo info = new TardisInfo();
        info.tardisID = id;
        tardises.put(id, info);

        return id;
    }

    @SubscribeEvent
    public static void flightUpdate(TickEvent.ServerTickEvent event) {
        if (tardises.size() > 0) {

            for (Map.Entry<Integer, TardisInfo> infoEntry : tardises.entrySet()) {
                TardisInfo info = infoEntry.getValue();
                info.flightUpdate();
            }
        }
    }

    public static void travelTo(int tardisID, BlockPos pos, int dim) {
        if (DimensionManager.isDimensionRegistered(dim) && tardises.containsKey(tardisID)) {
            TardisInfo info = tardises.get(tardisID);

            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(info.exteriorDim);
            BlockPos exteriorPos = info.extereriorPos;

            if (world != null && world.getBlockState(exteriorPos).getBlock() == ModBlocks.tardis && !world.isRemote) {
                TileEntity te = world.getTileEntity(exteriorPos);


                if (te != null && te instanceof TileEntityTardis) {
                    ((TileEntityTardis) te).setDemat(true);
                }

                info.setDestinationDim(dim);
                info.setDestinationPos(pos);
                info.setTravelTime(150 + world.rand.nextInt(60));
                info.setInFlight(true);
            }
        }
    }

    public static boolean doesTardisExist(int id) {
        return tardises.containsKey(id);
    }

    public static TileEntityTardis getTardisTile(int id) {
        TileEntity tileEntity = null;

        if (doesTardisExist(id)) {
            TardisInfo info = getTardis(id);
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(info.exteriorDim);
            TileEntity te = world.getTileEntity(info.extereriorPos);
            if (te != null && te instanceof TileEntityTardis) {
                tileEntity = te;
            }
        }

        return (TileEntityTardis) tileEntity;
    }

    public static BlockPos getExitPosition(int id) {
        if (doesTardisExist(id)) {
            TardisInfo info = getTardis(id);

            Vec3d look = Vec3d.fromPitchYaw(45, (-getTardisTile(id).rotation));
            float distance = 0.5F;
            double x = info.getExtereriorPos().getX() + (look.x * distance);
            double y = (info.getExtereriorPos().getY() > 0) ? info.getExtereriorPos().getY() : 128;
            double z = info.getExtereriorPos().getZ() + (look.z * distance);
            return new BlockPos(x, y, z);
        }

        return BlockPos.ORIGIN;
    }

    public static TardisInfo getTardis(int id) {
        if (doesTardisExist(id)) {
            return tardises.get(id);
        }

        return null;
    }
}
