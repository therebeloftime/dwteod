package me.coodlude.edgeofdarkness.client.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.network.packets.PacketTardisSnap;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class ModKeybinds {

    public static KeyBinding snap;

    public static void init() {
        snap = new KeyBinding("Snap your fingers to open your TARDIS!", Keyboard.KEY_B, EdgeOfDarkness.NAME);
        ClientRegistry.registerKeyBinding(snap);
    }
}
