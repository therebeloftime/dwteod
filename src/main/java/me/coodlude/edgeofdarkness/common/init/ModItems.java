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
    public static Item key_mcgann;
    public static Item sonicscrewdriver_eod;
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
    public static Item redstone_sword;
    public static Item redstone_pickaxe;
    public static Item redstone_axe;
    public static Item redstone_shovel;
    public static Item redstone_hoe;
    public static Item doomsday_weapon;
    public static Item tardis_spawner;

    //Records
    public static Item record_sixteenth_theme;
    public static Item record_fifteenth_theme;
    public static Item record_fourteenth_theme;
    public static Item record_sixteenth_parallel_theme;
    public static Item record_edgeofdarkness_theme;
    public static Item record_a_good_man;
    public static Item record_sja;
    public static Item record_megalovania;
    public static Item record_megalovania_jazz;
    public static Item record_pigstep;

    public static void init() {
        key_mcgann = registerItem(new ItemTardisKey(), "key_mcgann").setCreativeTab(ModTabs.edgeofdarkness);
        jammy_dodgers = registerItem(new ItemFood(1, 0.5f, false), "jammy_dodgers").setCreativeTab(ModTabs.edgeofdarkness);
        sonicscrewdriver_eod = registerItem(new ItemSonicScrewdriver(), "sonicscrewdriver_eod").setCreativeTab(ModTabs.edgeofdarkness);
        emerald_sword = registerItem(new ItemSword(Item.ToolMaterial.DIAMOND),  "emerald_sword").setCreativeTab(ModTabs.edgeoftools);
        emerald_pickaxe = registerItem(new ItemPickAxe(Item.ToolMaterial.DIAMOND),  "emerald_pickaxe").setCreativeTab(ModTabs.edgeoftools);
        emerald_axe = registerItem(new ItemHatchet(Item.ToolMaterial.DIAMOND), "emerald_axe").setCreativeTab(ModTabs.edgeoftools);
        emerald_shovel = registerItem(new ItemSpade(Item.ToolMaterial.DIAMOND), "emerald_shovel").setCreativeTab(ModTabs.edgeoftools);
        emerald_hoe = registerItem(new ItemHoe(Item.ToolMaterial.DIAMOND), "emerald_hoe").setCreativeTab(ModTabs.edgeoftools);
        doomsdaydevicepiece = registerItem(new ItemPiece(), "doomsdaydevicepiece").setCreativeTab(ModTabs.edgeofdarkness);
        metebelis_crystal = registerItem(new ItemCrystal(),"metebelis_crystal").setCreativeTab(ModTabs.edgeofdarkness);
        lapis_sword = registerItem(new ItemSword(Item.ToolMaterial.IRON), "lapis_sword").setCreativeTab(ModTabs.edgeoftools);
        lapis_pickaxe = registerItem(new ItemPickAxe(Item.ToolMaterial.IRON), "lapis_pickaxe").setCreativeTab(ModTabs.edgeoftools);
        lapis_axe = registerItem(new ItemHatchet(Item.ToolMaterial.IRON), "lapis_axe").setCreativeTab(ModTabs.edgeoftools);
        lapis_shovel = registerItem(new ItemSpade(Item.ToolMaterial.IRON), "lapis_shovel").setCreativeTab(ModTabs.edgeoftools);
        lapis_hoe = registerItem(new ItemHoe(Item.ToolMaterial.IRON), "lapis_hoe").setCreativeTab(ModTabs.edgeoftools);
        redstone_sword = registerItem(new ItemSword(Item.ToolMaterial.IRON), "redstone_sword").setCreativeTab(ModTabs.edgeoftools);
        redstone_pickaxe = registerItem(new ItemPickAxe(Item.ToolMaterial.IRON), "redstone_pickaxe").setCreativeTab(ModTabs.edgeoftools);
        redstone_axe = registerItem(new ItemHatchet(Item.ToolMaterial.IRON), "redstone_axe").setCreativeTab(ModTabs.edgeoftools);
        redstone_shovel = registerItem(new ItemSpade(Item.ToolMaterial.IRON), "redstone_shovel").setCreativeTab(ModTabs.edgeoftools);
        redstone_hoe = registerItem(new ItemHoe(Item.ToolMaterial.IRON), "redstone_hoe").setCreativeTab(ModTabs.edgeoftools);
        doomsday_weapon = registerItem(new ItemDoomsday(),"doomsday_weapon").setCreativeTab(ModTabs.edgeoftools);
        tardis_spawner = registerItem(new ItemTardisSpawner(), "tardis_spawner").setCreativeTab(ModTabs.edgeofdarkness);
        record_sixteenth_theme = registerItem(new ItemEODRecord("record_sixteenth_theme",ModSounds.SIXTEENTH_THEME),"record_sixteenth_theme").setCreativeTab(CreativeTabs.MISC);
        record_fifteenth_theme = registerItem(new ItemEODRecord("record_fifteenth_theme",ModSounds.FIFTEENTH_THEME),"record_fifteenth_theme").setCreativeTab(CreativeTabs.MISC);
        record_fourteenth_theme = registerItem(new ItemEODRecord("record_fourteenth_theme",ModSounds.FOURTEENTH_THEME),"record_fourteenth_theme").setCreativeTab(CreativeTabs.MISC);
        record_edgeofdarkness_theme = registerItem(new ItemEODRecord("record_edgeofdarkness_theme",ModSounds.EDGEOFDARKNESS_THEME),"record_edgeofdarkness_theme").setCreativeTab(CreativeTabs.MISC);
        record_sixteenth_parallel_theme = registerItem(new ItemEODRecord("record_sixteenth_parallel_theme",ModSounds.SIXTEENTH_PARALLEL_THEME),"record_sixteenth_parallel_theme").setCreativeTab(CreativeTabs.MISC);
        record_a_good_man = registerItem(new ItemEODRecord("record_a_good_man",ModSounds.A_GOOD_MAN),"record_a_good_man").setCreativeTab(CreativeTabs.MISC);
        record_sja = registerItem(new ItemEODRecord("record_sja",ModSounds.SJA),"record_sja").setCreativeTab(CreativeTabs.MISC);
        record_megalovania = registerItem(new ItemEODRecord("record_megalovania",ModSounds.MEGALOVANIA),"record_megalovania").setCreativeTab(CreativeTabs.MISC);
        record_megalovania_jazz = registerItem(new ItemEODRecord("record_megalovania_jazz",ModSounds.MEGALOVANIA_JAZZ),"record_megalovania_jazz").setCreativeTab(CreativeTabs.MISC);
        record_pigstep = registerItem(new ItemEODRecord("record_pigstep",ModSounds.PIGSTEP),"record_pigstep").setCreativeTab(CreativeTabs.MISC);
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
