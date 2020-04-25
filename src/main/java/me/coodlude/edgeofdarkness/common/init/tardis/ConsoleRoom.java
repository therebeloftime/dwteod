package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import java.util.ArrayList;
import java.util.List;

public class ConsoleRoom {

    public static List<ConsoleRoom> ROOM_LIST = new ArrayList<ConsoleRoom>();

    private ResourceLocation room_location;
    private BlockPos console = BlockPos.ORIGIN;

    public ConsoleRoom(ResourceLocation src, BlockPos pos) {
        this.room_location = src;
        this.console = pos;
    }

    public void generate(WorldServer world, BlockPos pos) {
        Template template = world.getStructureTemplateManager().get(world.getMinecraftServer(), room_location);
        PlacementSettings placementSettings = new PlacementSettings();
        template.addBlocksToWorld(world, pos.subtract(console), placementSettings);
    }

    public static void registerConsoleRoom(String interiorName, BlockPos pos) {
        ROOM_LIST.add(new ConsoleRoom(new ResourceLocation(EdgeOfDarkness.MODID, interiorName), pos));
    }

    public static void init() {
        ConsoleRoom.registerConsoleRoom( "stone_platform", new BlockPos(16, 1, 16));
        ConsoleRoom.registerConsoleRoom("tardis_int", new BlockPos(10,5,4));
    }
}
