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
	public static ExteriorCircuit eod;
    public static ExteriorCircuit toyota;
    public static ExteriorCircuit trashCan;
	public static ExteriorCircuit capaldi;
    public static ExteriorCircuit fourteenth;
	public static ExteriorCircuit dt_thirteen;

    public static void init() {
        main = addCircuit("Main", new ModelTardisMain(), ModSchematics.MAIN_INT, new Vec3d(3, 10, 15),180, fade);
		eod = addCircuit("EOD", new ModelTardisEOD(), ModSchematics.MAIN_INT, new Vec3d(3, 10, 15),180, fade);
        toyota = addCircuit("Toyota", new ModelTardisToyota(), ModSchematics.MAIN_INT, new Vec3d(3, 10, 15), 180, fade);
        trashCan = addCircuit("Trash Can", new ModelTardisTrashCan(), ModSchematics.MAIN_INT, new Vec3d(3, 10, 15), 180, fade);
		capaldi = addCircuit("Capaldi", new ModelTardisCapaldi(), ModSchematics.MAIN_INT, new Vec3d(3, 10, 15),180, fade);
        fourteenth = addCircuit("Fourteenth", new ModelTardisFourteenth(), ModSchematics.MAIN_INT, new Vec3d(3, 10, 15),180, fade);
		dt_thirteen = addCircuit("DT Thirteen", new ModelTardisDTThirteen(), ModSchematics.MAIN_INT, new Vec3d(3, 10, 15),180, fade);
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
