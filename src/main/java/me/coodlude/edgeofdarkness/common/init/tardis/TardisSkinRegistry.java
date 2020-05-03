package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.client.models.ModelTardisBase;
import me.coodlude.edgeofdarkness.client.models.ModelTardisMain;
import me.coodlude.edgeofdarkness.client.models.ModelTardisToyota;
import me.coodlude.edgeofdarkness.common.init.ModSchematics;
import me.coodlude.edgeofdarkness.util.helper.schematics.Schematic;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class TardisSkinRegistry {
    public static List<ExteriorCircuit> circuitList = new ArrayList<>();

    public static ExteriorCircuit main;
    public static ExteriorCircuit toyota;

    public static void init() {
        main = addCircuit("Main", new ModelTardisMain(), ModSchematics.MAIN_TARDIS, new Vec3d(4, 6, 7),180);
        toyota = addCircuit("Toyota", new ModelTardisToyota(), ModSchematics.MAIN_TARDIS, new Vec3d(4, 6, 7), 180);
    }

    public static ExteriorCircuit addCircuit(String name, ModelTardisBase base, Schematic schematic, Vec3d offset, float rotation) {
        ExteriorCircuit exteriorCircuit = new ExteriorCircuit();
        exteriorCircuit.setBasemodel(base);
        exteriorCircuit.setName(name);
        exteriorCircuit.setSchematic(schematic);
        exteriorCircuit.setOffset(offset);
        exteriorCircuit.setRotation_int(rotation);

        circuitList.add(exteriorCircuit);
        return exteriorCircuit;
    }
}
