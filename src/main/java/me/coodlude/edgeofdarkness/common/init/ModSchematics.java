package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.util.helper.schematics.Schematic;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ModSchematics {

    public static Schematic MAIN_TARDIS;


    public static void init() {
        MAIN_TARDIS = getSchematic("main_interior");
    }


    public static Schematic getSchematic(String name) {
        ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "structures/" + name + ".json");
        try {
            InputStream stream = Minecraft.getMinecraft().getResourceManager().getResource(location).getInputStream();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder builder = new StringBuilder();
                int content;

                while ((content = reader.read()) != -1) {
                    builder.append((char) content);
                }

                return EdgeOfDarkness.JSON.fromJson(builder.toString(), Schematic.class);
            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
