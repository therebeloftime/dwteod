package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.client.models.ModelTardisBase;
import net.minecraft.client.model.ModelBase;

public class ExteriorCircuit {
    public String name = "";
    public ModelTardisBase basemodel;

    public void renderExterior() {
        if(basemodel != null) {
            basemodel.render(null, 0,0,0,0,0,0.0625f);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasemodel(ModelTardisBase basemodel) {
        this.basemodel = basemodel;
    }

}
