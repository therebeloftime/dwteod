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

public class ModelTardisCapaldi extends ModelTardisBase {
	private final ModelRenderer MainBox;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/capaldi_tardis.png");

	public ModelTardisCapaldi() {
		textureWidth = 256;
		textureHeight = 256;

		MainBox = new ModelRenderer(this);
		MainBox.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBox.cubeList.add(new ModelBox(MainBox, 16, 16, -4.5F, -74.0F, -0.5F, 9, 5, 1, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 0, -19.0F, -4.0F, -19.0F, 38, 4, 38, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 42, -18.0F, -62.0F, 14.0F, 4, 58, 4, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 16, 42, 14.0F, -62.0F, 14.0F, 4, 58, 4, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 32, 42, 14.0F, -62.0F, -18.0F, 4, 58, 4, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 48, 42, -18.0F, -62.0F, -18.0F, 4, 58, 4, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 64, 42, -16.0F, -55.0F, -14.0F, 1, 51, 28, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 104, -14.0F, -55.0F, 15.0F, 28, 51, 1, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 122, 42, 15.0F, -55.0F, -14.0F, 1, 51, 28, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 156, -15.0F, -61.0F, -20.0F, 30, 6, 40, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 202, -20.0F, -61.0F, -15.0F, 40, 6, 30, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 114, 0, -16.0F, -64.0F, -16.0F, 32, 3, 32, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 100, 121, -15.0F, -67.0F, -15.0F, 30, 3, 30, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 0, -4.0F, -68.0F, -4.0F, 8, 1, 8, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 9, -3.0F, -69.0F, -3.0F, 6, 1, 6, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 16, -2.0F, -76.0F, -2.0F, 4, 7, 4, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 27, -2.5F, -73.0F, -2.5F, 5, 3, 5, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 94, 42, -4.0F, -75.0F, -4.0F, 8, 1, 8, 0.0F, false));

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-14.0F, -4.0F, -16.0F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 180, 35, 0.0F, -51.0F, 0.0F, 14, 51, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 180, 87, 2.0F, -37.0F, 1.0F, 10, 11, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 0, 5, 12.0F, -33.0F, -1.0F, 1, 2, 1, 0.0F, false));

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(14.0F, -4.0F, -16.0F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 210, 35, -14.0F, -51.0F, 0.0F, 14, 51, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 0, 0, -13.0F, -34.0F, -1.0F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.rotate(180, 1, 0, 0);
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 32, 0);
		GlStateManager.scale(0.65, 0.65, 0.65);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
		MainBox.render(f5);

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
		MainBox.render(0.0625f);

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