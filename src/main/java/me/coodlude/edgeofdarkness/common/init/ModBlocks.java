package me.coodlude.edgeofdarkness.common.init;


import me.coodlude.edgeofdarkness.common.blocks.*;
import me.coodlude.edgeofdarkness.common.tileentity.*;
import me.coodlude.edgeofdarkness.util.handlers.RegistryHandler;
import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ModBlocks {

    public static final List<Block> BLOCK_LIST = new ArrayList<>();

    public static Block tardis = registerBlock(new BlockTardis(TileEntityTardis::new), "tardis").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block tardis_door = registerBlock(new BlockDoor(TileEntityDoor::new), "tardis_door").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block tardis_monitor = registerBlock(new BlockMonitor(TileEntityMonitor::new), "tardis_monitor").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block tardis_handbrake = registerBlock(new BlockDematLever(TileEntityDematLever::new), "tardis_handbrake").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block tardis_circuit_selector = registerBlock(new BlockCircuitSelector(TileEntityCircuitSelector::new), "tardis_circuit_selector").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block tardis_flight_panel = registerBlock(new BlockFlightPanel(TileEntityFlightPanel::new), "tardis_flight_panel").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block oak_planks_purple_full_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "oak_planks_purple_full_roundel").setCreativeTab(ModTabs.edgeofroundels);
    public static Block oak_planks_purple_half_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "oak_planks_purple_half_roundel").setCreativeTab(ModTabs.edgeofroundels);
    public static Block oak_planks_purple_base_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "oak_planks_purple_base_roundel").setCreativeTab(ModTabs.edgeofroundels);
    public static Block oak_planks_purple_top_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "oak_planks_purple_top_roundel").setCreativeTab(ModTabs.edgeofroundels);
    public static Block oak_planks_purple_core_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "oak_planks_purple_core_roundel").setCreativeTab(ModTabs.edgeofroundels);
    public static Block spruce_log_brown_full_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "spruce_log_brown_full_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block spruce_log_brown_half_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "spruce_log_brown_half_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block spruce_log_brown_base_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "spruce_log_brown_base_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block spruce_log_brown_top_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "spruce_log_brown_top_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block spruce_log_brown_core_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "spruce_log_brown_core_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block dark_oak_planks_red_full_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "dark_oak_planks_red_full_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block dark_oak_planks_red_half_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "dark_oak_planks_red_half_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block dark_oak_planks_red_base_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "dark_oak_planks_red_base_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block dark_oak_planks_red_top_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "dark_oak_planks_red_top_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block dark_oak_planks_red_core_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "dark_oak_planks_red_core_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block acacia_planks_blue_full_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "acacia_planks_blue_full_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block acacia_planks_blue_half_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "acacia_planks_blue_half_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block acacia_planks_blue_base_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "acacia_planks_blue_base_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block acacia_planks_blue_top_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "acacia_planks_blue_top_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block acacia_planks_blue_core_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "acacia_planks_blue_core_roundel").setCreativeTab(ModTabs.edgeofroundels);
    public static Block tardis_door_toyota = registerBlock(new BlockDoorToyota(TileEntityDoorToyota::new), "tardis_door_toyota").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block tardis_door_eod = registerBlock(new BlockDoor(TileEntityDoorEOD::new), "tardis_door_eod").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block metal_wall = registerBlock(new BlockEOD(Material.WOOD, MapColor.WOOD), "metal_wall").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block metal_tiles = registerBlock(new BlockEOD(Material.WOOD, MapColor.WOOD), "metal_tiles").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block first_wall = registerBlock(new BlockEOD(Material.WOOD, MapColor.WOOD), "first_wall").setCreativeTab(ModTabs.edgeofdarkness);
    public static Block first_wall_blowup = registerBlock(new BlockEOD(Material.WOOD, MapColor.WOOD), "first_wall_blowup").setCreativeTab(ModTabs.edgeofdarkness);
	public static Block first_wall_white_full_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_white_full_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_white_half_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_white_half_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_white_base_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_white_base_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_white_top_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_white_top_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_white_core_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_white_core_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_blowup_white_full_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_blowup_white_full_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_blowup_white_half_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_blowup_white_half_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_blowup_white_base_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_blowup_white_base_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_blowup_white_top_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_blowup_white_top_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block first_wall_blowup_white_core_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "first_wall_blowup_white_core_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block black_concrete_white_concrete_full_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "black_concrete_white_concrete_full_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block black_concrete_white_concrete_half_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "black_concrete_white_concrete_half_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block black_concrete_white_concrete_base_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "black_concrete_white_concrete_base_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block black_concrete_white_concrete_top_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "black_concrete_white_concrete_top_roundel").setCreativeTab(ModTabs.edgeofroundels);
	public static Block black_concrete_white_concrete_core_roundel = registerBlock(new BlockGlowRoundel(Material.WOOD, MapColor.WOOD), "black_concrete_white_concrete_core_roundel").setCreativeTab(ModTabs.edgeofroundels);
    public static Block tardis_door_trash_can = registerBlock(new BlockDoorTrashCan(TileEntityDoorTrashCan::new), "tardis_door_trash_can").setCreativeTab(ModTabs.edgeofdarkness);
	public static Block tardis_door_capaldi = registerBlock(new BlockDoorCapaldi(TileEntityDoorCapaldi::new), "tardis_door_capaldi").setCreativeTab(ModTabs.edgeofdarkness);

    public static Block registerBlock(Block block, String name) {
        block.setRegistryName(name);
        block.setTranslationKey(name);
        ModBlocks.BLOCK_LIST.add(block);

        if (block instanceof BlockTileBase) {
            BlockTileBase tileBase = (BlockTileBase) block;
            RegistryHandler.registerTileEntity(tileBase.tileEntitySupplier.get().getClass(), tileBase.tileEntitySupplier.get().getClass().getSimpleName());
        }

        if (block instanceof IHaveItem) {
            ItemBlock itemBlock = (ItemBlock) new ItemBlock(block).setRegistryName(name);
            ModItems.ITEM_LIST.add(itemBlock);
        }
        return block;
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCK_LIST.toArray(new Block[0]));
    }
}
