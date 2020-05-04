package me.coodlude.edgeofdarkness.client.models;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelFlightPanel extends ModelTardisBase {
    private final ModelRenderer all;
    private final ModelRenderer base;
    private final ModelRenderer bone;
    private final ModelRenderer buton2;
    private final ModelRenderer button1_3;
    private final ModelRenderer buton3;
    private final ModelRenderer button1_4;
    private final ModelRenderer buton4;
    private final ModelRenderer button1_2;

    public ModelFlightPanel() {
        textureWidth = 64;
        textureHeight = 64;

        all = new ModelRenderer(this);
        all.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotationAngle(all, 0.0F, -1.5708F, 0.0F);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(5.0F, -3.0F, 0.0F);
        setRotationAngle(bone, 0.0F, 0.0F, -1.5708F);
        all.addChild(bone);
        bone.cubeList.add(new ModelBox(bone, 0, 37, -2.0F, -4.7841F, -6.0F, 8, 3, 12, 0.0F, false));

        base = new ModelRenderer(this);
        base.setRotationPoint(0.0F, 0.0F, 0.0F);
        all.addChild(base);
        base.cubeList.add(new ModelBox(base, 0, 0, -8.0F, -1.0F, -8.0F, 16, 2, 16, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 28, 17, -1.0F, -1.2F, 6.0F, 5, 1, 1, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 28, 28, -1.0F, -1.2F, -7.0F, 5, 1, 1, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 14, 18, 3.0F, -1.2F, -6.0F, 1, 1, 12, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 17, -1.0F, -1.2F, -6.0F, 1, 1, 12, 0.0F, false));

        buton2 = new ModelRenderer(this);
        buton2.setRotationPoint(-7.5F, -1.0F, 0.5F);
        setRotationAngle(buton2, 0.0F, 0.0F, 1.5708F);
        all.addChild(buton2);
        buton2.cubeList.add(new ModelBox(buton2, 3, 1, -0.2F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

        button1_3 = new ModelRenderer(this);
        button1_3.setRotationPoint(6.5F, 2.0F, -4.5F);
        setRotationAngle(button1_3, 0.0F, 0.0F, -0.6981F);
        buton2.addChild(button1_3);
        button1_3.cubeList.add(new ModelBox(button1_3, 3, 3, -3.1167F, -7.345F, 4.0F, 1, 1, 1, 0.0F, false));

        buton3 = new ModelRenderer(this);
        buton3.setRotationPoint(-7.5F, -1.0F, 0.5F);
        setRotationAngle(buton3, 0.0F, 0.0F, 1.5708F);
        all.addChild(buton3);
        buton3.cubeList.add(new ModelBox(buton3, 0, 2, -0.2F, -1.5F, -6.5F, 1, 1, 1, 0.0F, false));

        button1_4 = new ModelRenderer(this);
        button1_4.setRotationPoint(6.5F, 2.0F, -4.5F);
        setRotationAngle(button1_4, 0.0F, 0.0F, -0.6981F);
        buton3.addChild(button1_4);
        button1_4.cubeList.add(new ModelBox(button1_4, 0, 0, -3.1167F, -7.345F, -2.0F, 1, 1, 1, 0.0F, false));

        buton4 = new ModelRenderer(this);
        buton4.setRotationPoint(-7.5F, -1.0F, 0.5F);
        setRotationAngle(buton4, 0.0F, 0.0F, 1.5708F);
        all.addChild(buton4);
        buton4.cubeList.add(new ModelBox(buton4, 3, 1, -0.2F, -1.5F, 4.5F, 1, 1, 1, 0.0F, false));

        button1_2 = new ModelRenderer(this);
        button1_2.setRotationPoint(6.5F, 2.0F, -4.5F);
        setRotationAngle(button1_2, 0.0F, 0.0F, -0.6981F);
        buton4.addChild(button1_2);
        button1_2.cubeList.add(new ModelBox(button1_2, 3, 3, -3.1167F, -7.345F, 9.0F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        base.render(f5);
        buton2.render(f5);
        buton3.render(f5);
        buton4.render(f5);
        GlStateManager.translate(0, f, 0);
        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}