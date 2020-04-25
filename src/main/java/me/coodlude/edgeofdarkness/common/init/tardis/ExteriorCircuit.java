package me.coodlude.edgeofdarkness.common.init.tardis;

import net.minecraft.client.model.ModelBase;

public class ExteriorCircuit {
    public String name = "";
    public ModelBase basemodel;

    public void renderExterior() {
        if(basemodel != null) {
            basemodel.render(null, 0,0,0,0,0,0.0625f);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasemodel(ModelBase basemodel) {
        this.basemodel = basemodel;
    }

}
