package me.coodlude.edgeofdarkness.common.init;


import me.coodlude.edgeofdarkness.client.init.ModKeybinds;
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
