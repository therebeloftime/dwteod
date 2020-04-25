package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {

    public static SoundEvent SHORT_REMAT,DEMAT, FLY, CLOISTER, DENIED_TAKEOFF;

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

}
