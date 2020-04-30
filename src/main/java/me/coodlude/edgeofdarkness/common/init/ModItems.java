package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.items.*;
import me.coodlude.edgeofdarkness.common.items.tools.ItemAxe;
import me.coodlude.edgeofdarkness.common.items.tools.ItemPickAxe;
import me.coodlude.edgeofdarkness.common.items.tools.ItemShovel;
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

   // Doctor Who
    public static Item tardis_key;
    public static Item sonic_screwdriver;
    public static Item doomsdaydevicepiece;
    public static Item metebelis_crystal;

    // Food
    public static Item jammy_dodgers;

    // Tools
    public static Item emerald_sword;
    public static Item emerald_pickaxe;
    public static Item emerald_axe;
    public static Item lapis_sword;
    public static Item lapis_pickaxe;
    public static Item lapis_axe;
    public static Item lapis_shovel;
    public static Item emerald_shovel;
    public static Item doomsday_weapon;


    public static void init() {
        tardis_key = registerItem(new ItemTardisKey(), "tardis_key").setCreativeTab(ModTabs.edgeofdarkness);
        jammy_dodgers = registerItem(new ItemFood(1, 0.5f, false), "jammy_dodgers").setCreativeTab(ModTabs.edgeofdarkness);
        sonic_screwdriver = registerItem(new ItemSonicScrewdriver(), "sonic_screwdriver").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_sword = registerItem(new ItemSword(Item.ToolMaterial.DIAMOND),  "emerald_sword").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_pickaxe = registerItem(new ItemPickAxe(Item.ToolMaterial.DIAMOND),  "emerald_pickaxe").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_axe = registerItem(new ItemAxe(Item.ToolMaterial.DIAMOND), "emerald_axe").setCreativeTab(ModTabs.edgeofdarkness);
        doomsdaydevicepiece = registerItem(new ItemPiece(), "doomsdaydevicepiece").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_shovel = registerItem(new ItemShovel(Item.ToolMaterial.DIAMOND), "emerald_shovel").setCreativeTab(ModTabs.edgeofdarkness);
        metebelis_crystal = registerItem(new ItemCrystal(),"metebelis_crystal").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_sword = registerItem(new ItemSword(Item.ToolMaterial.DIAMOND), "lapis_sword").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_pickaxe = registerItem(new ItemPickAxe(Item.ToolMaterial.DIAMOND), "lapis_pickaxe").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_axe = registerItem(new ItemAxe(Item.ToolMaterial.DIAMOND), "lapis_axe").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_shovel = registerItem(new ItemShovel(Item.ToolMaterial.DIAMOND), "lapis_shovel").setCreativeTab(ModTabs.edgeofdarkness);
        doomsday_weapon = registerItem(new ItemDoomsday(),"doomsday_weapon").setCreativeTab(ModTabs.edgeofdarkness);
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
