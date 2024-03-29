package me.coodlude.edgeofdarkness.common.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabs {

    public static CreativeTabs edgeofdarkness = new CreativeTabs("edgeofdarkness_items") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.tardis_spawner);
        }
    };

    public static CreativeTabs edgeofroundels = new CreativeTabs("edgeofdarkness_roundels") {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.oak_planks_purple_full_roundel);
        }
    };

    public static CreativeTabs edgeoftools = new CreativeTabs("edgeofdarkness_tools") {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.emerald_sword);
        }
    };
}
