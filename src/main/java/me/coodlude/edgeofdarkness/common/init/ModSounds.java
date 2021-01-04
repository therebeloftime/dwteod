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

    public static SoundEvent SHORT_REMAT, DEMAT, FLY, CLOISTER, DENIED_TAKEOFF, SIXTEENTH_THEME, FIFTEENTH_THEME, FOURTEENTH_THEME, EDGEOFDARKNESS_THEME, A_GOOD_MAN, SJA, MEGALOVANIA, MEGALOVANIA_JAZZ, PIGSTEP;

    public static void registerSounds() {
        SHORT_REMAT = registerSound("basiclanding");
        DEMAT = registerSound("demat");
        FLY = registerSound("fly");
        CLOISTER = registerSound("cloister");
        DENIED_TAKEOFF = registerSound("denied");

        //Music
        SIXTEENTH_THEME = registerSound("sixteenth_theme");
        FIFTEENTH_THEME = registerSound("fifteenth_theme");
        FOURTEENTH_THEME = registerSound("fourteenth_theme");
        EDGEOFDARKNESS_THEME = registerSound("edgeofdarkness_theme");
        A_GOOD_MAN = registerSound("a_good_man");
        SJA = registerSound("sja");
        MEGALOVANIA = registerSound("megalovania");
        MEGALOVANIA_JAZZ = registerSound("megalovania_jazz");
        PIGSTEP = registerSound("pigstep");
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
