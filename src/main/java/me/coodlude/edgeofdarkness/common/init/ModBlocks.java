package me.coodlude.edgeofdarkness.common.init;


import me.coodlude.edgeofdarkness.common.blocks.BlockDoor;
import me.coodlude.edgeofdarkness.common.blocks.BlockTardis;
import me.coodlude.edgeofdarkness.common.blocks.BlockTest;
import me.coodlude.edgeofdarkness.common.blocks.BlockTileBase;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityDoor;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
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
    public static Block door = registerBlock(new BlockDoor(TileEntityDoor::new), "tardis_door").setCreativeTab(ModTabs.edgeofdarkness);

    public static Block temp = registerBlock(new BlockTest(Material.BARRIER, MapColor.DIAMOND), "test");

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
            //ModItems.registerRender(itemBlock);
            ModItems.ITEM_LIST.add(itemBlock);
        }
        return block;
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCK_LIST.toArray(new Block[0]));
    }
}
