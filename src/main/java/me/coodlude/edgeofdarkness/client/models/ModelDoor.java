package me.coodlude.edgeofdarkness.client.models;
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports
import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelDoor extends ModelBase {
	private final ModelRenderer MainBody;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/main_tardis.png");

	public ModelDoor() {
		textureWidth = 256;
		textureHeight = 256;

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, 34.0F, 0.0F);
		MainBody.cubeList.add(new ModelBox(MainBody, 174, 38, -13.0F, -55.0F, -2.5F, 3, 55, 5, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 190, 38, 10.0F, -55.0F, -2.5F, 3, 55, 5, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 174, 98, -12.0F, -57.0F, -1.5F, 2, 2, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 184, 98, 10.0F, -57.0F, -1.5F, 2, 2, 3, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 82, 99, -13.0F, -53.0F, -3.5F, 26, 4, 7, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 82, 110, -14.0F, -53.0F, -2.5F, 28, 4, 5, 0.0F, false));

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(10.0F, 34.0F, 0.5F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 44, 161, -10.0F, -49.0F, -1.0F, 10, 49, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 12, 0, -2.0F, -32.0F, 0.0F, 1, 3, 1, 0.0F, false));

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(-10.0F, 34.0F, 0.5F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 66, 161, 0.0F, -49.0F, -1.0F, 10, 49, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 4, 22, 8.0F, -27.0F, 0.0F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 0, -0.5);
		GlStateManager.scale(0.65, 0.65, 0.65);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
		MainBody.render(f5);

		LeftDoor.render(f5);
		RightDoor.render(f5);
		GlStateManager.popMatrix();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}