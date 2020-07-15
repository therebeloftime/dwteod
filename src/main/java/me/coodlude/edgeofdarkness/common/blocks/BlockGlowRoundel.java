package me.coodlude.edgeofdarkness.common.blocks;

import me.coodlude.edgeofdarkness.util.helper.IHaveItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;

public class BlockGlowRoundel extends Block implements IHaveItem {

    public BlockGlowRoundel(Material material, MapColor mapColor) {
        super(material);
        setLightLevel(1.0f);
    }

}