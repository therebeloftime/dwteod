package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.init.ModBlocks;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.FMLInjectionData;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Mod.EventBusSubscriber
public class TardisHandler {

    public static HashMap<Integer, TardisInfo> tardises = new HashMap<>();
    public static int INTERIOR_SIZE = 128;


    public static int addTardis() {
        int id = tardises.size() + 1;
        TardisInfo info = new TardisInfo();
        info.tardisID = id;
        tardises.put(id, info);
        saveTardis(id);

        return id;
    }

    public static WorldServer getTardisWorld() {
        return FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(ModDimension.TARDISID);
    }

    public static BlockPos getCenteredTardisPos(int id) {
        return new BlockPos(id * TardisHandler.INTERIOR_SIZE + (TardisHandler.INTERIOR_SIZE / 2), 128, id * TardisHandler.INTERIOR_SIZE + (TardisHandler.INTERIOR_SIZE / 2));
    }

    @SubscribeEvent
    public static void flightUpdate(TickEvent.ServerTickEvent event) {
        World world = getTardisWorld();
        if (tardises.size() > 0) {
            for (Map.Entry<Integer, TardisInfo> infoEntry : tardises.entrySet()) {
                TardisInfo info = infoEntry.getValue();
                info.flightUpdate(world);
            }
        }
    }

    public static void handleLandDemat(EntityPlayer player, int tardisID) {
        if (doesTardisExist(tardisID)) {
            TardisInfo info = getTardis(tardisID);

            if (info != null) {

                if (info.isInFlight()) {
                    info.directLanding();
                } else {
                    startFlight((EntityPlayerMP) player, tardisID, info.destinationPos, info.destinationDim);
                }
            }
        }
    }

    public static void calculateLandingPosition(TardisInfo info, BlockPos pos, int dim) {
        if (info != null) {
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(dim);

            if (world != null && pos != null) {
                IBlockState blockState = world.getBlockState(pos);
                boolean b = false;  //pos.getY() >= 60;

                if (blockState.getBlock() != Blocks.AIR || world.isOutsideBuildHeight(pos) || world.getBlockState(pos.add(0, -1, 0)).getBlock() == Blocks.AIR) {

                    if (blockState.getBlock() == ModBlocks.tardis) {
                        TileEntityTardis tileEntityTardis = (TileEntityTardis) world.getTileEntity(pos);
                        tileEntityTardis.setRemat(true);
                        return;
                    }

                    if (b) {
                        for (int y = 256; y > 0; y--) {
                            if (safeToLand(world, pos, info, y)) {
                                break;
                            }
                        }
                    } else {
                        for (int y = 0; y < 256; y++) {
                            if (safeToLand(world, pos, info, y)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean safeToLand(World world, BlockPos position, TardisInfo info, int y) {
        BlockPos pos = new BlockPos(position.getX(), y, position.getZ());
        IBlockState state = world.getBlockState(pos);

        if (state.getBlock() == Blocks.AIR) {
            IBlockState up = world.getBlockState(pos.add(0, 1, 0));
            IBlockState down = world.getBlockState(pos.add(0, -1, 0));

            if (down.getBlock() != Blocks.AIR && up.getBlock() == Blocks.AIR) {
                info.setDestinationPos(pos);
                return true;
            }
        }

        return false;
    }

    public static void startFlight(EntityPlayerMP player, int tardisID, BlockPos pos, int dim) {
        if (doesTardisExist(tardisID)) {
            getTardis(tardisID).playSoundPlayersInside(ModSounds.DEMAT);
            player.sendStatusMessage(new TextComponentString(TextFormatting.GREEN + new TextComponentTranslation("msg.tardis.dematting").getFormattedText()), true);
            startFlight(tardisID, pos, dim);
        }
    }

    public static void summonTardisKey(EntityPlayerMP player, int tardisID, BlockPos pos, int dim) {
        if (doesTardisExist(tardisID) && !getTardis(tardisID).inFlight) {
            startFlight(tardisID, pos, dim);
        }
    }

    public static void startFlight(int tardisID, BlockPos pos, int dim) {
        if (DimensionManager.isDimensionRegistered(dim) && tardises.containsKey(tardisID)) {
            TardisInfo info = tardises.get(tardisID);

            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(info.exteriorDim);
            BlockPos exteriorPos = info.extereriorPos;

            if (world != null && world.getBlockState(exteriorPos).getBlock() == ModBlocks.tardis && !world.isRemote) {
                TileEntity te = world.getTileEntity(exteriorPos);


                if (te != null && te instanceof TileEntityTardis) {
                    ((TileEntityTardis) te).setDemat(true);
                }
            }

            if (!info.inFlight) {
                info.setDestinationDim(dim);
                info.setDestinationPos(pos);
                info.setTravelTime(calculateTravelTime(info));
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

    public static void immediateLanding(int tardisID, BlockPos pos, int dim) {
        if (doesTardisExist(tardisID)) {
            TardisInfo info = getTardis(tardisID);

            TileEntityTardis tet = getTardisTile(tardisID);
            if (tet != null) {
                tet.setDemat(true);
            }

            if (info != null && DimensionManager.isDimensionRegistered(dim)) {
                World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(dim);

                if (world != null) {
                    world.setBlockState(pos, ModBlocks.tardis.getDefaultState());
                    TileEntity te = world.getTileEntity(pos);

                    if (te != null && te instanceof TileEntityTardis) {
                        TileEntityTardis tileEntityTardis = (TileEntityTardis) te;

                        tileEntityTardis.setTardisID(tardisID);
                        tileEntityTardis.setRemat(true);
                        calculateLandingPosition(info, pos, dim);
                        info.setExtereriorPos(pos);
                        info.setExteriorDim(dim);
                        info.travelTime = 0;
                        info.inFlight = false;
                    }
                }
            }
        }
    }

    public static BlockPos getExitPosition(int id) {
        if (doesTardisExist(id)) {
            TardisInfo info = getTardis(id);

            Vec3d look = Vec3d.fromPitchYaw(45, info.exteriorRotation);
            float distance = 2.5F;
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

    public static int getTardisIDFromPos(BlockPos pos) {
        int passed = 1;
        int x = pos.getX();
        int z = pos.getZ();
        long begin = System.currentTimeMillis();

        while (true) {
            if (x > passed * INTERIOR_SIZE && x < (passed * INTERIOR_SIZE) + INTERIOR_SIZE && z > passed * INTERIOR_SIZE && z < (passed * INTERIOR_SIZE) + INTERIOR_SIZE) {
                return passed;
            }
            passed++;

            if ((System.currentTimeMillis() - begin) > 15000 || passed > TardisHandler.tardises.size()) {
                return 0;
            }
        }
    }

    public static int calculateTravelTime(TardisInfo info) {
        int minimum = 45;
        int bps = 2000;

        if (info != null) {
            int f = 0;
            BlockPos dest = info.getDestinationPos();

            f = (int) Math.abs(info.getExtereriorPos().getDistance(dest.getX(), dest.getY(), dest.getZ()) / bps);

            return (minimum + f);
        }

        return (minimum) * 20;
    }

    public static int getIDFromCoords(BlockPos pos) {
        int x = pos.getX();
        return Math.abs(x / INTERIOR_SIZE);
    }

    public static void saveTardis(int tardisID) {
        if (doesTardisExist(tardisID)) {
            TardisInfo info = getTardis(tardisID);
            String file = ((File) (FMLInjectionData.data()[6])).getAbsolutePath() + "/saves/" + FMLCommonHandler.instance().getMinecraftServerInstance().getFolderName() + "/tardis/";
            String fileName = "tardis_" + tardisID + ".json";
            File dir = new File(file);

            if (!dir.exists()) {
                dir.mkdirs();
            }

            String json = EdgeOfDarkness.JSON.toJson(info);

            try {
                FileWriter fw = new FileWriter(dir + "/" + fileName);
                fw.write(json);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void loadTardisses() {
        tardises.clear();
        String file = ((File) (FMLInjectionData.data()[6])).getAbsolutePath() + "/saves/" + FMLCommonHandler.instance().getMinecraftServerInstance().getFolderName() + "/tardis/";
        File dir = new File(file);

        if (!dir.exists()) {
            dir.mkdirs();
        }

        File[] tardis_files = dir.listFiles();

        for (int x = 0; x < tardis_files.length; x++) {

            File file1 = tardis_files[x];

            if (file1.getName().startsWith("tardis") && file1.getName().endsWith(".json")) {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(file1.getName());
                String i = "";
                while (m.find()) {
                    i = m.group();
                }
                String fileName = "tardis_" + i + ".json";
                try {
                    FileReader reader = new FileReader(file + "/" + fileName);
                    BufferedReader br = new BufferedReader(reader);

                    try {
                        tardises.put(Integer.valueOf(i), EdgeOfDarkness.JSON.fromJson(br, TardisInfo.class));
                    } finally {
                        br.close();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
