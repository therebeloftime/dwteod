package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.client.models.ModelTardisBase;
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
        main = addCircuit("Main", new ModelTardisMain());
        toyota = addCircuit("Toyota", new ModelTardisToyota());
    }

    public static ExteriorCircuit addCircuit(String name, ModelTardisBase base) {
        ExteriorCircuit exteriorCircuit = new ExteriorCircuit();
        exteriorCircuit.setBasemodel(base);
        exteriorCircuit.setName(name);

        circuitList.add(exteriorCircuit);
        return exteriorCircuit;
    }
}
