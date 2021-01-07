package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.client.models.ModelTardisBase;
import me.coodlude.edgeofdarkness.util.helper.schematics.Schematic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ExteriorCircuit {
    public String name = "";
    public ModelTardisBase basemodel;
    public Schematic schematic;
    public Vec3d offset;
    public float rotation_int;

    public IFlightAnimation animation;

    public void renderExterior() {
        if (basemodel != null) {
            basemodel.render(null, 0, 0, 0, 0, 0, 0.0625f);
        }
    }

    public void renderExterior(float i) {
        if (basemodel != null) {

            if(i < 0) {
                i = 0;
            }else if(i > 1){
                i = 1;
            }

            basemodel.render(i);
        }
    }

    public void generateInterior(World world, BlockPos pos) {
        if (schematic != null) {
            schematic.generate(world, pos, true);
        }
    }

    public String getName() {
        return name;
    }

    public void setSchematic(Schematic schematic) {
        this.schematic = schematic;
    }

    public void setRotation_int(float rotation_int) {
        this.rotation_int = rotation_int;
    }

    public Schematic getSchematic() {
        return schematic;
    }

    public void setOffset(Vec3d offset) {
        this.offset = offset;
    }

    public Vec3d getOffset() {
        return offset;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasemodel(ModelTardisBase basemodel) {
        this.basemodel = basemodel;
    }

}
