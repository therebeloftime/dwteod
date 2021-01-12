package me.coodlude.edgeofdarkness.client.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class ModKeybinds {

    public static KeyBinding snap;

    public static void init() {
        snap = new KeyBinding("Snap your fingers to open your TARDIS!", Keyboard.KEY_B, EdgeOfDarkness.NAME);
        ClientRegistry.registerKeyBinding(snap);
    }
}
