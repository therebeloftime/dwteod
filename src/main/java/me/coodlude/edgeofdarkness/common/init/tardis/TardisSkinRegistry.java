package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.client.models.ModelTardisMain;
import me.coodlude.edgeofdarkness.client.models.ModelTardisToyota;
import net.minecraft.client.model.ModelBase;

import java.util.ArrayList;
import java.util.List;

public class TardisSkinRegistry {
    public static List<ExteriorCircuit> circuitList = new ArrayList<>();

    public static ExteriorCircuit main;
    public static ExteriorCircuit toyota;


    public static void init() {
        addCircuit(main, "Main", new ModelTardisMain());
        addCircuit(toyota, "Toyota", new ModelTardisToyota());
    }

    public static void addCircuit(ExteriorCircuit circuit, String name, ModelBase base) {
        ExteriorCircuit exteriorCircuit = new ExteriorCircuit();
        exteriorCircuit.setBasemodel(base);
        exteriorCircuit.setName(name);
        circuit = exteriorCircuit;

        circuitList.add(circuit);
    }
}
