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

public class ModelDoorCapaldi extends ModelBase {
	private final ModelRenderer MainBody;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/capaldi_tardis.png");

	public ModelDoorCapaldi() {
		textureWidth = 256;
		textureHeight = 256;

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBody.cubeList.add(new ModelBox(MainBody, 142, 241, -15.0F, -57.0F, -4.5F, 30, 6, 9, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 238, 193, 14.0F, -58.0F, -2.5F, 4, 58, 5, 0.0F, false));
		MainBody.cubeList.add(new ModelBox(MainBody, 220, 193, -18.0F, -58.0F, -2.5F, 4, 58, 5, 0.0F, false));

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-14.0F, 0.0F, 0.5F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 140, 154, 0.0F, -51.0F, -1.0F, 14, 51, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 140, 206, 2.0F, -37.0F, 0.0F, 10, 11, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 4, 5, 12.0F, -33.0F, -2.0F, 1, 2, 1, 0.0F, false));

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(14.0F, 0.0F, 0.5F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 170, 154, -14.0F, -51.0F, -1.0F, 14, 51, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 4, 0, -13.0F, -34.0F, -2.0F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 16, 0.5);
		GlStateManager.rotate(180, 0,1,0);
		GlStateManager.scale(0.65, 0.65, 0.65);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
		MainBody.render(f5);

		RightDoor.rotateAngleY = f;
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