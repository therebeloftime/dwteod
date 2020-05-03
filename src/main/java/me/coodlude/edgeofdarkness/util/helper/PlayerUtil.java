package me.coodlude.edgeofdarkness.util.helper;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class PlayerUtil {

    public static void sendStatusTranslationMessageRange(World world, BlockPos pos, String s, TextFormatting textFormatting,int range , int rangeY, boolean status) {
        for (EntityPlayerMP playerMP : world.getEntitiesWithinAABB(EntityPlayerMP.class, new AxisAlignedBB(pos.add(-range, -rangeY, -range), pos.add(range, rangeY, range)))) {
            playerMP.sendStatusMessage(new TextComponentString(textFormatting + new TextComponentTranslation(s).getFormattedText()), status);
        }
    }
}
