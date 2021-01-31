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

public class ModelDoorTrashCan extends ModelBase {
	private final ModelRenderer Door;
	private final ModelRenderer Can;
	private final ModelRenderer Lid;
	private ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/trash_can.png");

	public ModelDoorTrashCan() {
		textureWidth = 128;
		textureHeight = 128;

		Door = new ModelRenderer(this);
		Door.setRotationPoint(0.0F, 24.0F, 0.0F);
		Door.cubeList.add(new ModelBox(Door, 44, 0, -8.0F, -32.0F, -8.0F, 16, 32, 16, 0.0F, false));

		Can = new ModelRenderer(this);
		Can.setRotationPoint(0.0F, 0.0F, -8.0F);
		Door.addChild(Can);
		setRotationAngle(Can, 0.7854F, 0.0F, 0.0F);
		Can.cubeList.add(new ModelBox(Can, 0, 35, -4.5F, -14.0F, 0.5F, 9, 14, 9, 0.0F, false));

		Lid = new ModelRenderer(this);
		Lid.setRotationPoint(0.0F, -14.0F, 10.0F);
		Can.addChild(Lid);
		Lid.cubeList.add(new ModelBox(Lid, 0, 58, -5.5F, -1.0F, -10.5F, 11, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 0, 0);
		GlStateManager.scale(1, 1, 1);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
		Door.render(f5);

		Can.render(f5);
		Lid.render(f5);
		GlStateManager.popMatrix();
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}