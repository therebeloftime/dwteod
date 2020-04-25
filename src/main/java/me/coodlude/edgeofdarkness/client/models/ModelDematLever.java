package me.coodlude.edgeofdarkness.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Yellow Handbrake.tcn - TechneToTabulaImporter
 * Created using Tabula 7.0.0
 */
public class ModelDematLever extends ModelBase {
    public ModelRenderer Basis;
    public ModelRenderer Basis2;
    public ModelRenderer Basis3;
    public ModelRenderer BasisOverlay;
    public ModelRenderer BasisOverlay2;
    public ModelRenderer Mainblackplate;
    public ModelRenderer Side203;
    public ModelRenderer Side203Frontu;
    public ModelRenderer Side203back;
    public ModelRenderer Side203backside;
    public ModelRenderer Side203rigtben;
    public ModelRenderer Side;
    public ModelRenderer Side203rigtben10;
    public ModelRenderer Side20345;
    public ModelRenderer Blue2;
    public ModelRenderer Blue;
    public ModelRenderer lever;
    public ModelRenderer blok;
    public ModelRenderer lever_1;

    public ModelDematLever() {
        this.textureWidth = 112;
        this.textureHeight = 112;
        this.Blue2 = new ModelRenderer(this, 10, 67);
        this.Blue2.setRotationPoint(6.0F, 23.5F, 4.0F);
        this.Blue2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Blue = new ModelRenderer(this, 10, 67);
        this.Blue.setRotationPoint(5.0F, 23.5F, 6.0F);
        this.Blue.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.lever = new ModelRenderer(this, 0, 38);
        this.lever.mirror = true;
        this.lever.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.lever.addBox(5.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.BasisOverlay2 = new ModelRenderer(this, 87, 12);
        this.BasisOverlay2.setRotationPoint(-3.0F, 22.299999237060547F, 4.0F);
        this.BasisOverlay2.addBox(0.0F, 0.0F, 0.0F, 8, 2, 5, 0.0F);
        this.setRotateAngle(BasisOverlay2, 3.141592653589793F, 1.570796282091413F, 3.141592653589793F);
        this.blok = new ModelRenderer(this, 0, 20);
        this.blok.setRotationPoint(-2.0F, 21.299999237060547F, -2.0F);
        this.blok.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.Basis2 = new ModelRenderer(this, 0, 0);
        this.Basis2.setRotationPoint(-4.0F, 22.5F, -6.0F);
        this.Basis2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.Side203rigtben = new ModelRenderer(this, 0, 44);
        this.Side203rigtben.setRotationPoint(4.0F, 23.5F, -5.0F);
        this.Side203rigtben.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Side20345 = new ModelRenderer(this, 0, 44);
        this.Side20345.setRotationPoint(4.0F, 23.5F, 4.0F);
        this.Side20345.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Side203 = new ModelRenderer(this, 0, 44);
        this.Side203.setRotationPoint(-6.0F, 23.5F, 4.0F);
        this.Side203.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Side203back = new ModelRenderer(this, 0, 44);
        this.Side203back.setRotationPoint(-4.0F, 23.5F, -7.0F);
        this.Side203back.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.Side203Frontu = new ModelRenderer(this, 0, 44);
        this.Side203Frontu.setRotationPoint(-4.0F, 23.5F, 6.0F);
        this.Side203Frontu.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.Basis3 = new ModelRenderer(this, 0, 0);
        this.Basis3.setRotationPoint(-5.0F, 22.5F, -5.0F);
        this.Basis3.addBox(0.0F, 0.0F, 0.0F, 9, 2, 10, 0.0F);
        this.Side203backside = new ModelRenderer(this, 0, 44);
        this.Side203backside.setRotationPoint(-7.0F, 23.5F, 4.0F);
        this.Side203backside.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(Side203backside, 3.141592653589793F, 1.570796282091413F, 3.141592653589793F);
        this.Side203rigtben10 = new ModelRenderer(this, 0, 44);
        this.Side203rigtben10.setRotationPoint(-6.0F, 23.5F, -4.933333396911621F);
        this.Side203rigtben10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Basis = new ModelRenderer(this, 0, 0);
        this.Basis.setRotationPoint(-6.0F, 22.5F, -4.0F);
        this.Basis.addBox(0.0F, 0.0F, 0.0F, 11, 2, 8, 0.0F);
        this.Side = new ModelRenderer(this, 0, 44);
        this.Side.setRotationPoint(5.0F, 23.5F, 4.0F);
        this.Side.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(Side, 3.141592653589793F, 1.570796282091413F, 3.141592653589793F);
        this.lever_1 = new ModelRenderer(this, 0, 28);
        this.lever_1.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.lever_1.addBox(-1.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F);
        this.BasisOverlay = new ModelRenderer(this, 83, 0);
        this.BasisOverlay.setRotationPoint(-5.0F, 22.200000762939453F, -3.0F);
        this.BasisOverlay.addBox(0.0F, 0.0F, 0.0F, 9, 2, 6, 0.0F);
        this.Mainblackplate = new ModelRenderer(this, 0, 37);
        this.Mainblackplate.setRotationPoint(-5.0F, 23.5F, -6.0F);
        this.Mainblackplate.addBox(0.0F, 0.0F, 0.0F, 9, 1, 12, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Blue2.render(f5);
        this.Blue.render(f5);
        this.lever.render(f5);
        this.BasisOverlay2.render(f5);
        this.blok.render(f5);
        this.Basis2.render(f5);
        this.Side203rigtben.render(f5);
        this.Side20345.render(f5);
        this.Side203.render(f5);
        this.Side203back.render(f5);
        this.Side203Frontu.render(f5);
        this.Basis3.render(f5);
        this.Side203backside.render(f5);
        this.Side203rigtben10.render(f5);
        this.Basis.render(f5);
        this.Side.render(f5);
        this.lever_1.render(f5);
        this.BasisOverlay.render(f5);
        this.Mainblackplate.render(f5);
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
