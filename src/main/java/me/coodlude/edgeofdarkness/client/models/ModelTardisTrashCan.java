package me.coodlude.edgeofdarkness.client.models;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelTardisTrashCan extends ModelTardisBase {
    private final ModelRenderer TrashCan;
    private final ModelRenderer can;
    private final ModelRenderer lid;
    private ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/trash_can.png");

	public ModelTardisTrashCan() {
		textureWidth = 128;
		textureHeight = 128;

        TrashCan = new ModelRenderer(this);
        TrashCan.setRotationPoint(0.0F, 24.0F, 0.0F);

        can = new ModelRenderer(this);
        can.setRotationPoint(0.0F, 0.0F, 0.0F);
        TrashCan.addChild(can);
        can.cubeList.add(new ModelBox(can, 0, 0, -5.0F, -3.25F, -4.5F, 9, 14, 9, 0.0F, false));

        lid = new ModelRenderer(this);
        lid.setRotationPoint(0.0F, -4.0F, 5.0F);
        TrashCan.addChild(lid);
        lid.cubeList.add(new ModelBox(lid, 0, 23, -5.75F, -0.25F, -10.5F, 11, 1, 11, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        GlStateManager.translate(0,0.80,0);
        GlStateManager.scale(1,1,1);
        GlStateManager.rotate(180, 1,0,0);
        can.render(f5);
        lid.render(f5);
        GlStateManager.popMatrix();
    }

    @Override
    public void render(float doorRotation) {
        lid.rotateAngleX = -doorRotation;
        render(null, 0, 0, 0, 0, 0, 0.0625f);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}