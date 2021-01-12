package me.coodlude.edgeofdarkness.client.models;
// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelTardisEOD extends ModelTardisBase {
	private final ModelRenderer MainBox;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/eod_tardis.png");

	public ModelTardisEOD() {
		textureWidth = 256;
		textureHeight = 256;

		MainBox = new ModelRenderer(this);
		MainBox.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 0, -14.0F, -2.0F, -14.0F, 28, 2, 28, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 30, -13.0F, -57.0F, 10.0F, 3, 55, 3, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 12, 30, 10.0F, -57.0F, 10.0F, 3, 55, 3, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 24, 30, 10.0F, -57.0F, -13.0F, 3, 55, 3, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 36, 30, -13.0F, -57.0F, -13.0F, 3, 55, 3, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 88, -12.0F, -59.0F, 10.0F, 2, 2, 2, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 8, 88, 10.0F, -59.0F, 10.0F, 2, 2, 2, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 16, 88, 10.0F, -59.0F, -12.0F, 2, 2, 2, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 24, 88, -12.0F, -59.0F, -12.0F, 2, 2, 2, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 48, 30, -11.0F, -51.0F, -10.0F, 1, 49, 20, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 90, 30, -10.0F, -51.0F, 10.0F, 20, 49, 1, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 132, 30, 10.0F, -51.0F, -10.0F, 1, 49, 20, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 99, -14.0F, -55.0F, -13.0F, 28, 4, 26, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 129, -13.0F, -55.0F, -14.0F, 26, 4, 28, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 84, 0, -11.0F, -58.0F, -11.0F, 22, 3, 22, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 150, 0, -10.0F, -59.0F, -10.0F, 20, 1, 20, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 156, 21, -8.0F, -60.0F, -8.0F, 16, 1, 16, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 0, -2.0F, -62.0F, -2.0F, 4, 2, 4, 0.0F, false));
		MainBox.cubeList.add(new ModelBox(MainBox, 0, 6, -1.0F, -65.0F, -1.0F, 2, 3, 2, 0.0F, false));

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-10.0F, -2.0F, -10.0F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 0, 161, 0.0F, -49.0F, -1.0F, 10, 49, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 0, 0, 1.0F, -32.0F, -2.0F, 1, 3, 1, 0.0F, false));

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(10.5F, -2.0F, -10.5F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 22, 161, -10.5F, -49.0F, -0.5F, 10, 49, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 0, 22, -9.5F, -27.0F, -1.5F, 1, 5, 1, 0.0F, false));
	}

	@Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.pushMatrix();
        GlStateManager.translate(0, 0, 0);
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