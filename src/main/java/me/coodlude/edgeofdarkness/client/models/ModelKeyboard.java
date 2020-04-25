package me.coodlude.edgeofdarkness.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Keyboard.tcn - TechneToTabulaImporter
 * Created using Tabula 7.0.0
 */
public class ModelKeyboard extends ModelBase {
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape2_1;
    public ModelRenderer Shape2_2;
    public ModelRenderer Shape2_3;
    public ModelRenderer Shape2_4;
    public ModelRenderer Shape2_5;
    public ModelRenderer Shape2_6;
    public ModelRenderer Shape2_7;
    public ModelRenderer Shape2_8;
    public ModelRenderer Shape3;
    public ModelRenderer Shape3_1;
    public ModelRenderer Shape3_2;
    public ModelRenderer Shape3_3;

    public ModelKeyboard() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape2_5 = new ModelRenderer(this, 27, 25);
        this.Shape2_5.setRotationPoint(3.0F, 6.0F, 3.0F);
        this.Shape2_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_5, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape2_8 = new ModelRenderer(this, 27, 18);
        this.Shape2_8.setRotationPoint(1.5F, 5.699999809265137F, 4.5F);
        this.Shape2_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_8, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape2_2 = new ModelRenderer(this, 27, 14);
        this.Shape2_2.setRotationPoint(0.0F, 6.300000190734863F, 1.5F);
        this.Shape2_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_2, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 27, 25);
        this.Shape2.setRotationPoint(3.0F, 6.300000190734863F, 1.5F);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 2, 14);
        this.Shape3.setRotationPoint(-2.0F, 6.199999809265137F, 0.5F);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Shape3, 0.15707963705062866F, -0.0F, 0.0F);
        this.Shape3_2 = new ModelRenderer(this, 2, 14);
        this.Shape3_2.setRotationPoint(0.0F, 6.199999809265137F, 0.0F);
        this.Shape3_2.addBox(-6.0F, 0.0F, 0.5F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Shape3_2, 0.15707963705062866F, -0.0F, 0.0F);
        this.Shape2_3 = new ModelRenderer(this, 27, 14);
        this.Shape2_3.setRotationPoint(0.0F, 6.0F, 3.0F);
        this.Shape2_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_3, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape2_1 = new ModelRenderer(this, 27, 18);
        this.Shape2_1.setRotationPoint(1.5F, 6.300000190734863F, 1.5F);
        this.Shape2_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_1, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape2_7 = new ModelRenderer(this, 27, 14);
        this.Shape2_7.setRotationPoint(0.0F, 5.699999809265137F, 4.5F);
        this.Shape2_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_7, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape3_1 = new ModelRenderer(this, 2, 14);
        this.Shape3_1.setRotationPoint(-6.0F, 6.199999809265137F, 1.5F);
        this.Shape3_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(Shape3_1, 3.141592653589793F, 1.570796282091413F, 3.141592653589793F);
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.setRotationPoint(-7.0F, 7.0F, 0.0F);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 12, 1, 6, 0.0F);
        this.setRotateAngle(Shape1, 0.2094395160675048F, -0.0F, 0.0F);
        this.Shape2_4 = new ModelRenderer(this, 27, 18);
        this.Shape2_4.setRotationPoint(1.5F, 6.0F, 3.0F);
        this.Shape2_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_4, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape2_6 = new ModelRenderer(this, 27, 25);
        this.Shape2_6.setRotationPoint(3.0F, 5.699999809265137F, 4.5F);
        this.Shape2_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape2_6, -1.326450228691101F, -0.0F, 0.0F);
        this.Shape3_3 = new ModelRenderer(this, 2, 14);
        this.Shape3_3.setRotationPoint(-6.0F, 5.699999809265137F, 5.5F);
        this.Shape3_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(Shape3_3, -1.5533433930843565F, 1.4486232782390378F, -1.5707966827955973F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Shape2_5.render(f5);
        this.Shape2_8.render(f5);
        this.Shape2_2.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape3_2.render(f5);
        this.Shape2_3.render(f5);
        this.Shape2_1.render(f5);
        this.Shape2_7.render(f5);
        this.Shape3_1.render(f5);
        this.Shape1.render(f5);
        this.Shape2_4.render(f5);
        this.Shape2_6.render(f5);
        this.Shape3_3.render(f5);
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
