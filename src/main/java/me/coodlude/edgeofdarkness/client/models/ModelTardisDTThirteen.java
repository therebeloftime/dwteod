package me.coodlude.edgeofdarkness.client.models;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelTardisDTThirteen extends ModelTardisBase {
	private final ModelRenderer MainBody;
	private final ModelRenderer Door;
	private final ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/dt_thirteen_tardis.png");

	public ModelTardisDTThirteen() {
		textureWidth = 512;
		textureHeight = 512;

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 144, -25.0F, -59.5F, -24.0F, 50, 7, 48, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 0, -24.0F, 0.0F, -24.0F, 48, 0, 48, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 128, 0, -24.0F, -32.0F, -24.0F, 16, 32, 48, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 16, 64, 8.0F, -32.0F, -24.0F, 16, 32, 48, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 288, 64, -8.0F, -32.0F, 8.0F, 16, 32, 16, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 336, 0, -24.0F, -48.0F, -8.0F, 48, 16, 16, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 256, 0, -8.0F, -48.0F, -24.0F, 16, 16, 48, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 144, 80, -24.0F, -64.0F, -24.0F, 48, 16, 48, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 64, -8.0F, -81.0F, -8.0F, 16, 17, 16, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 385, 32, -16.0F, -48.0F, -16.0F, 32, 16, 32, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 199, -24.0F, -59.5F, -25.0F, 48, 7, 50, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 0, -24.0F, -27.5F, -25.0F, 16, 7, 1, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 96, 80, -7.0F, -1.0F, -7.0F, 14, 1, 14, 0.0F, false));

		Door = new ModelRenderer(this);
		Door.setRotationPoint(6.5F, 0.0F, -22.5F);
		Door.cubeList.add(new ModelBox(Door, 0, 8, -14.5F, -32.0F, -1.5F, 16, 32, 3, 0.0F, false));
	}

	@Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        GlStateManager.translate(0,0,0);
        GlStateManager.scale(1,1,1);
        GlStateManager.rotate(180, 1,0,0);
        MainBody.render(f5);
        Door.render(f5);
        GlStateManager.popMatrix();
    }

    @Override
    public void render(float doorRotation) {
        Door.rotateAngleY = +(4 * doorRotation);
        render(null, 0, 0, 0, 0, 0, 0.0625f);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}