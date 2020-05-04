package me.coodlude.edgeofdarkness.client.models;// Made with Blockbench 3.5.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelTest extends ModelBase {
    private ModelRenderer bone3;
    private ModelRenderer bone2;
    private ModelRenderer bone;

    public ModelTest() {
        textureWidth = 256;
        textureHeight = 256;

        bone3 = new ModelRenderer(this,0,0);
        bone3.setRotationPoint(-1.0F, 15.5F, -1.5F);
        bone3.addBox(-29.0F, -2.5F, -28.5F, 58, 5, 59, 0);

        bone2 = new ModelRenderer(this,0, 64);
        bone2.setRotationPoint(-1.0F, 15.5F, -0.5F);
        bone2.addBox(-23.0F, 2.5F, -23.5F, 45, 5, 45, 0);

        bone = new ModelRenderer(this, 0,114);
        this.bone.addBox(-17.0F, 7.5F, -16.5F, 34, 4, 0);
        bone.setRotationPoint(-1.0F, 15.5F, -0.5F);
        setRotationAngle(bone, 0.0F, 3.1416F, 0.0F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone3.render(scale);
        bone2.render(scale);
        bone.render(scale);
    }

    public void render(float x, float y, float z, float scale) {
        GlStateManager.pushMatrix();
        GlStateManager.rotate(x, 0,1,0);
        bone3.render(scale);
        GlStateManager.rotate(-x, 0,1,0);
        GlStateManager.rotate(y, 0,1,0);
        bone2.render(scale);
        GlStateManager.rotate(-y, 0,1,0);
        GlStateManager.rotate(z, 0,1,0);
        bone.render(scale);
        GlStateManager.rotate(-z, 0,1,0);
        GlStateManager.popMatrix();
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}