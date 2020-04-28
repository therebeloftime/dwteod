package me.coodlude.edgeofdarkness.util.helper;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Helper {
    public static float getAngleFromFacing(EnumFacing facing) {
        float angle = 0;

        if (facing.equals(EnumFacing.EAST))
            angle = 0;
        if (facing.equals(EnumFacing.SOUTH))
            angle = 90;
        if (facing.equals(EnumFacing.WEST))
            angle = 180;
        if (facing.equals(EnumFacing.NORTH))
            angle = 270;

        return angle;
    }

}
