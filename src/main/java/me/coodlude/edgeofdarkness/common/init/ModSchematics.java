package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.util.helper.schematics.Schematic;
import me.coodlude.edgeofdarkness.util.helper.schematics.SchematicUtil;
import net.minecraft.util.DamageSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ModSchematics {

    public static Schematic LEGACY_B_INT;
    public static Schematic PURPLE_OAK_INT;

    public static void init() {
        LEGACY_B_INT = getSchematic("legacy_b_int");
        PURPLE_OAK_INT = getSchematic("purple_oak_int");
    }


    public static Schematic getSchematic(String name) {
        try {
            InputStream stream = SchematicUtil.class.getResourceAsStream("/assets/edgeofdarkness/structures/" + name + ".json");
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            StringBuffer sb = new StringBuffer();
            String holder = "";

            try {
                while ((holder = br.readLine()) != null) {
                    sb.append(holder);
                }

                return EdgeOfDarkness.JSON.fromJson(sb.toString(), Schematic.class);
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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
