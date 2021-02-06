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

public class ModelTardisFourteenth extends ModelTardisBase {
	private final ModelRenderer MainBody;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/fourteenth_tardis.png");

	public ModelTardisFourteenth() {
		textureWidth = 256;
		textureHeight = 256;

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBody.cubeList.add(new ModelBox(MainBody, 210, 24, 11.0F, -48.0F, -11.0F, 1, 45, 22, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 0, -15.0F, -3.0F, -15.0F, 30, 3, 30, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 33, -14.0F, -53.0F, 11.0F, 3, 50, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 12, 33, 11.0F, -53.0F, 11.0F, 3, 50, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 24, 33, 11.0F, -53.0F, -14.0F, 3, 50, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 36, 33, -14.0F, -53.0F, -14.0F, 3, 50, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 117, -13.0F, -53.0F, -15.0F, 26, 5, 30, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 86, -15.0F, -53.0F, -13.0F, 30, 5, 26, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 152, -13.0F, -54.0F, -13.0F, 26, 1, 26, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 179, -11.0F, -55.0F, -11.0F, 22, 1, 22, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 202, -7.0F, -56.0F, -7.0F, 14, 1, 14, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 217, -4.0F, -57.0F, -3.0F, 7, 1, 7, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 0, -3.0F, -62.0F, -2.0F, 5, 5, 5, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 0, 225, -3.5F, -63.0F, -2.5F, 6, 1, 6, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 120, 0, -12.0F, -48.0F, -11.0F, 1, 45, 22, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 166, 0, -11.0F, -48.0F, 11.0F, 22, 45, 1, 0.0F, false));

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-11.0F, -3.0F, -12.0F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 120, 67, 0.0F, -45.0F, 0.0F, 11, 45, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 0, 0, 8.0F, -29.0F, -1.0F, 1, 3, 1, 0.0F, false));

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(11.0F, -3.0F, -12.0F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 144, 67, -11.0F, -45.0F, 0.0F, 11, 45, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 0, 10, -10.0F, -30.0F, -1.0F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.rotate(180, 1, 0, 0);
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 32, 0);
		GlStateManager.scale(0.65, 0.65, 0.65);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
		MainBody.render(f5);

		LeftDoor.render(f5);
		RightDoor.render(f5);
		GlStateManager.popMatrix();
	}

	public void render(float doorRotation) {
		GlStateManager.rotate(180, 1, 0, 0);
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 0, 0);
		GlStateManager.scale(0.65, 0.65, 0.65);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
		MainBody.render(0.0625f);

		LeftDoor.render(0.0625f);
		RightDoor.rotateAngleY = doorRotation;
		RightDoor.render(0.0625f);
		GlStateManager.popMatrix();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}