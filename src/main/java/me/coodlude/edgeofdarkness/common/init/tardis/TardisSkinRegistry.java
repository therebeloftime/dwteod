package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.client.models.*;
import me.coodlude.edgeofdarkness.common.init.ModSchematics;
import me.coodlude.edgeofdarkness.util.helper.schematics.Schematic;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class TardisSkinRegistry {
    public static List<ExteriorCircuit> circuitList = new ArrayList<>();

    public static IFlightAnimation fade = new IFlightAnimation() {
        @Override
        public void tickAnimationRemat(int timer, TardisInfo info, ModelTardisBase base) {
            
        }

        @Override
        public void tickAnimationDemat(int timer, TardisInfo info, ModelTardisBase base) {

        }
    };

    public static ExteriorCircuit main;
    public static ExteriorCircuit toyota;
    public static ExteriorCircuit trashCan;
    public static ExteriorCircuit eod;

    public static void init() {
        main = addCircuit("Main", new ModelTardisMain(), ModSchematics.PURPLE_OAK_INT, new Vec3d(4, 6, 11),180, fade);
        toyota = addCircuit("Toyota", new ModelTardisToyota(), ModSchematics.PURPLE_OAK_INT, new Vec3d(4, 6, 11), 180, fade);
        trashCan = addCircuit("Trash Can", new ModelTardisTrashCan(), ModSchematics.PURPLE_OAK_INT, new Vec3d(4, 6, 11), 180, fade);
        eod = addCircuit("EOD", new ModelTardisEOD(), ModSchematics.PURPLE_OAK_INT, new Vec3d(4, 6, 11),180, fade);
    }




    public static ExteriorCircuit addCircuit(String name, ModelTardisBase base, Schematic schematic, Vec3d offset, float rotation, IFlightAnimation animation) {
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
