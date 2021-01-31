package me.coodlude.edgeofdarkness.util.helper;

import net.minecraft.util.EnumFacing;

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
