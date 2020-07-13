package me.cooldude.edgeofdarkness.common.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockGlowRoundel extends Block {

    public BlockGlowRoundel(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
        setLightLevel(1.0f);
    }

}