package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {

    public static SoundEvent SHORT_REMAT, DEMAT, FLY, CLOISTER, DENIED_TAKEOFF;

    public static void registerSounds() {
        SHORT_REMAT = registerSound("basiclanding");
        DEMAT = registerSound("demat");
        FLY = registerSound("fly");
        CLOISTER = registerSound("cloister");
        DENIED_TAKEOFF = registerSound("denied");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }

    public static void playSoundRange(World world, BlockPos pos, SoundEvent soundEvent, int range , int rangeY, float volume, float pitch) {
        for (EntityPlayerMP playerMP : world.getEntitiesWithinAABB(EntityPlayerMP.class, new AxisAlignedBB(pos.add(-range, -rangeY, -range), pos.add(range, rangeY, range)))) {
            playerMP.connection.sendPacket(new SPacketSoundEffect(soundEvent, SoundCategory.BLOCKS, playerMP.posX, playerMP.posY, playerMP.posZ, volume, pitch));
        }
     }

}
