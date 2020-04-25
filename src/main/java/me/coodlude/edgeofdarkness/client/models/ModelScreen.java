package me.coodlude.edgeofdarkness.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Screen.tcn - TechneToTabulaImporter
 * Created using Tabula 7.0.0
 */
public class ModelScreen extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer ArmLength;
    public ModelRenderer Armretention;
    public ModelRenderer Noddle;
    public ModelRenderer noddlebit;
    public ModelRenderer noddle3;
    public ModelRenderer Screen;
    public ModelRenderer sideleft;
    public ModelRenderer sidetop;
    public ModelRenderer sideright;
    public ModelRenderer sideunder;
    public ModelRenderer nod;
    public ModelRenderer nod1;
    public ModelRenderer nod2;
    public ModelRenderer nod3;

    public ModelScreen() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Noddle = new ModelRenderer(this, 0, 0);
        this.Noddle.setRotationPoint(-1.0F, 19.100000381469727F, 0.10000000149011612F);
        this.Noddle.addBox(0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Noddle, 0.45151355862617504F, -0.0F, -0.01745329238474369F);
        this.noddle3 = new ModelRenderer(this, 0, 0);
        this.noddle3.setRotationPoint(-1.0F, 17.0F, -2.0F);
        this.noddle3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(noddle3, -0.7397511005401612F, -0.0F, 0.06981316953897475F);
        this.sidetop = new ModelRenderer(this, 0, 0);
        this.sidetop.setRotationPoint(3.0F, 15.5F, -4.5F);
        this.sidetop.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(sidetop, 0.0F, -0.0F, 1.5707963705062866F);
        this.Screen = new ModelRenderer(this, 0, 22);
        this.Screen.setRotationPoint(-4.0F, 16.0F, -4.0F);
        this.Screen.addBox(0.0F, 0.0F, 0.0F, 7, 4, 1, 0.0F);
        this.sideunder = new ModelRenderer(this, 0, 0);
        this.sideunder.setRotationPoint(3.0F, 19.5F, -4.5F);
        this.sideunder.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(sideunder, 0.0F, -0.0F, 1.5707963705062866F);
        this.ArmLength = new ModelRenderer(this, 0, 0);
        this.ArmLength.setRotationPoint(-1.0F, 20.0F, 1.0F);
        this.ArmLength.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.nod = new ModelRenderer(this, 0, 0);
        this.nod.setRotationPoint(2.5F, 15.733333587646484F, -4.5F);
        this.nod.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.nod3 = new ModelRenderer(this, 0, 0);
        this.nod3.setRotationPoint(2.700000047683716F, 19.600000381469727F, -4.5F);
        this.nod3.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(nod3, 0.0F, -0.0F, 1.5707963705062866F);
        this.Armretention = new ModelRenderer(this, 0, 0);
        this.Armretention.setRotationPoint(-1.0F, 20.0F, 2.0F);
        this.Armretention.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Armretention, -2.1829009056091304F, -0.0F, -0.01745329238474369F);
        this.sideleft = new ModelRenderer(this, 0, 0);
        this.sideleft.setRotationPoint(2.5F, 16.0F, -4.5F);
        this.sideleft.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.sideright = new ModelRenderer(this, 0, 0);
        this.sideright.setRotationPoint(-4.5F, 16.0F, -4.5F);
        this.sideright.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.noddlebit = new ModelRenderer(this, 0, 0);
        this.noddlebit.setRotationPoint(-1.0F, 17.0F, -3.0F);
        this.noddlebit.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.nod2 = new ModelRenderer(this, 0, 0);
        this.nod2.setRotationPoint(2.299999952316284F, 19.5F, -4.5F);
        this.nod2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Base = new ModelRenderer(this, 0, 0);
        this.Base.setRotationPoint(-2.0F, 19.0F, 4.0F);
        this.Base.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.nod1 = new ModelRenderer(this, 0, 0);
        this.nod1.setRotationPoint(-4.5F, 15.733333587646484F, -4.5F);
        this.nod1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Noddle.render(f5);
        this.noddle3.render(f5);
        this.sidetop.render(f5);
        this.Screen.render(f5);
        this.sideunder.render(f5);
        this.ArmLength.render(f5);
        this.nod.render(f5);
        this.nod3.render(f5);
        this.Armretention.render(f5);
        this.sideleft.render(f5);
        this.sideright.render(f5);
        this.noddlebit.render(f5);
        this.nod2.render(f5);
        this.Base.render(f5);
        this.nod1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
