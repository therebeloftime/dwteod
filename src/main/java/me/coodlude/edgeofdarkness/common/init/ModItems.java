package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.items.ItemSonicScrewdriver;
import me.coodlude.edgeofdarkness.common.items.ItemTardisKey;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ModItems {

    public static final List<Item> ITEM_LIST = new ArrayList<>();


    public static Item tardis_key;
    public static Item jammy_dodgers;
    public static Item sonic_screwdriver;
    public static Item emerald_sword;
    public static Item emerald_pickaxe;
    public static Item emerald_axe;

    public static void init() {
        tardis_key = registerItem(new ItemTardisKey(), "tardis_key").setCreativeTab(ModTabs.edgeofdarkness);
        jammy_dodgers = registerItem(new ItemFood(1, 0.5f, false), "jammy_dodgers").setCreativeTab(ModTabs.edgeofdarkness);
        sonic_screwdriver = registerItem(new ItemSonicScrewdriver(), "sonic_screwdriver").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_sword = registerItem(new ItemSword(Item.ToolMaterial.DIAMOND),  "emerald_sword").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_pickaxe = registerItem(new ItemPickaxe(Item.ToolMaterial.DIAMOND),  "emerald_pickaxe").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_axe = registerItem(new ItemAxe(Item.ToolMaterial.DIAMOND), "emerald_axe").setCreativeTab(ModTabs.edgeofdarkness);

    }

    public static Item registerItem(Item item, String name) {
        item.setRegistryName(name);
        item.setTranslationKey(name);
        ITEM_LIST.add(item);
        return item;
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void registerRenderMeta(Item item, int meta, String name) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(EdgeOfDarkness.MODID, name), "inventory"));
    }

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEM_LIST.toArray(new Item[0]));
    }
}
