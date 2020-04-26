package me.coodlude.edgeofdarkness.common.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabs {

    public static CreativeTabs edgeofdarkness = new CreativeTabs("edgeofdarkness_items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.sonic_screwdriver);
        }
    };
}
