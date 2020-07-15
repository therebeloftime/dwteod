package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.items.*;
import me.coodlude.edgeofdarkness.common.items.tools.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
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
    public static Item emerald_shovel;
    public static Item emerald_hoe;
    public static Item lapis_sword;
    public static Item lapis_pickaxe;
    public static Item lapis_axe;
    public static Item lapis_shovel;
    public static Item lapis_hoe;
    public static Item doomsday_weapon;
    public static Item tardis_spawner;

    //Records
    public static Item record_maintheme;
    public static Item record_secondarytheme;
    public static Item record_tertiarytheme;
    public static Item record_a_good_man;
    public static Item record_sja;

    public static void init() {
        tardis_key = registerItem(new ItemTardisKey(), "tardis_key").setCreativeTab(ModTabs.edgeofdarkness);
        jammy_dodgers = registerItem(new ItemFood(1, 0.5f, false), "jammy_dodgers").setCreativeTab(ModTabs.edgeofdarkness);
        sonic_screwdriver = registerItem(new ItemSonicScrewdriver(), "sonic_screwdriver").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_sword = registerItem(new ItemSword(Item.ToolMaterial.DIAMOND),  "emerald_sword").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_pickaxe = registerItem(new ItemPickAxe(Item.ToolMaterial.DIAMOND),  "emerald_pickaxe").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_axe = registerItem(new ItemHatchet(Item.ToolMaterial.DIAMOND), "emerald_axe").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_shovel = registerItem(new ItemSpade(Item.ToolMaterial.DIAMOND), "emerald_shovel").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_hoe = registerItem(new ItemHoe(Item.ToolMaterial.DIAMOND), "emerald_hoe").setCreativeTab(ModTabs.edgeofdarkness);
        doomsdaydevicepiece = registerItem(new ItemPiece(), "doomsdaydevicepiece").setCreativeTab(ModTabs.edgeofdarkness);
        metebelis_crystal = registerItem(new ItemCrystal(),"metebelis_crystal").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_sword = registerItem(new ItemSword(Item.ToolMaterial.DIAMOND), "lapis_sword").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_pickaxe = registerItem(new ItemPickAxe(Item.ToolMaterial.DIAMOND), "lapis_pickaxe").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_axe = registerItem(new ItemHatchet(Item.ToolMaterial.DIAMOND), "lapis_axe").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_shovel = registerItem(new ItemSpade(Item.ToolMaterial.DIAMOND), "lapis_shovel").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_hoe = registerItem(new ItemHoe(Item.ToolMaterial.DIAMOND), "lapis_hoe").setCreativeTab(ModTabs.edgeofdarkness);
        doomsday_weapon = registerItem(new ItemDoomsday(),"doomsday_weapon").setCreativeTab(ModTabs.edgeofdarkness);
        tardis_spawner = registerItem(new ItemTardisSpawner(), "tardis_spawner").setCreativeTab(ModTabs.edgeofdarkness);
        record_maintheme = registerItem(new ItemEODRecord("record_maintheme",ModSounds.MAINTHEME),"record_maintheme").setCreativeTab(CreativeTabs.MISC);
        record_secondarytheme = registerItem(new ItemEODRecord("record_secondarytheme",ModSounds.SECONDARYTHEME),"record_secondarytheme").setCreativeTab(CreativeTabs.MISC);
        record_tertiarytheme = registerItem(new ItemEODRecord("record_tertiarytheme",ModSounds.TERTIARYTHEME),"record_tertiarytheme").setCreativeTab(CreativeTabs.MISC);
        record_a_good_man = registerItem(new ItemEODRecord("record_a_good_man",ModSounds.A_GOOD_MAN),"record_a_good_man").setCreativeTab(CreativeTabs.MISC);
        record_sja = registerItem(new ItemEODRecord("record_sja",ModSounds.SJA),"record_sja").setCreativeTab(CreativeTabs.MISC);
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
