package me.coodlude.edgeofdarkness.client.models;
// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;

public class ModelTardisMain extends ModelTardisBase {
	private final ModelRenderer TARDIS;
	private final ModelRenderer Lamp;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/main_tardis.png");

	public ModelTardisMain() {
		textureWidth = 256;
		textureHeight = 256;

		TARDIS = new ModelRenderer(this);
		TARDIS.setRotationPoint(0.0F, 24.0F, 0.0F);
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 0, -14.5F, 30.0F, -14.5F, 29, 2, 29, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 31, -13.5F, -25.0F, 10.5F, 3, 55, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 31, 10.5F, -25.0F, 10.5F, 3, 55, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 31, 10.5F, -25.0F, -13.5F, 3, 55, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 31, -13.5F, -25.0F, -13.5F, 3, 55, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 0, -12.5F, -27.0F, 10.5F, 2, 2, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 0, 10.5F, -27.0F, 10.5F, 2, 2, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 0, 10.5F, -27.0F, -12.5F, 2, 2, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 0, -12.5F, -27.0F, -12.5F, 2, 2, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 12, 31, -11.5F, -19.0F, -10.5F, 1, 49, 21, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 12, 31, 10.5F, -19.0F, -10.5F, 1, 49, 21, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 56, 31, -10.5F, -19.0F, 10.5F, 21, 49, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 101, -13.5F, -22.0F, -10.5F, 27, 2, 21, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 124, -10.5F, -22.0F, -13.5F, 21, 2, 27, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 99, 0, -14.5F, -20.0F, -12.5F, 29, 1, 25, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 120, 26, -12.5F, -20.0F, -14.5F, 25, 1, 29, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 99, 0, -14.5F, -23.0F, -12.5F, 29, 1, 25, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 120, 26, -12.5F, -23.0F, -14.5F, 25, 1, 29, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 120, 56, -14.5F, -22.0F, -12.5F, 29, 2, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 120, 56, -14.5F, -22.0F, 9.5F, 29, 2, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 91, 61, 9.5F, -22.0F, -14.5F, 3, 2, 29, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 91, 61, -12.5F, -22.0F, -14.5F, 3, 2, 29, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 126, 61, -11.5F, -26.0F, -11.5F, 23, 3, 23, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 134, 87, -10.5F, -27.0F, -10.5F, 21, 1, 21, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 91, 109, -8.5F, -28.0F, -8.5F, 17, 1, 17, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 100, 31, -12.5F, -19.0F, -10.5F, 3, 49, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 108, 32, -12.5F, -19.0F, -1.5F, 3, 49, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 100, 31, -12.5F, -19.0F, 9.5F, 3, 49, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 207, 0, -13.5F, -19.0F, -0.5F, 5, 49, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 219, 0, -10.5F, -19.0F, 9.5F, 1, 49, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 227, 0, -1.5F, -19.0F, 9.5F, 3, 49, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 220, 0, 9.5F, -19.0F, 9.5F, 1, 49, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 239, 0, -0.5F, -19.0F, 8.5F, 1, 49, 5, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 100, 31, 9.5F, -19.0F, 9.5F, 3, 49, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 108, 32, 9.5F, -19.0F, -1.5F, 3, 49, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 100, 31, 9.5F, -19.0F, -10.5F, 3, 49, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 207, 0, 8.5F, -19.0F, -0.5F, 5, 49, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, -12.5F, 29.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, -12.5F, 17.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, -12.5F, 5.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, -12.5F, -7.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, -12.5F, -19.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 165, 109, -9.5F, 29.0F, 9.5F, 19, 1, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 165, 109, -9.5F, 17.0F, 9.5F, 19, 1, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 165, 109, -9.5F, 5.0F, 9.5F, 19, 1, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 165, 109, -9.5F, -7.0F, 9.5F, 19, 1, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 165, 109, -9.5F, -19.0F, 9.5F, 19, 1, 3, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, 9.5F, 29.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, 9.5F, 17.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, 9.5F, 5.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, 9.5F, -7.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 140, 109, 9.5F, -19.0F, -9.5F, 3, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, -12.0F, -18.0F, -7.25F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, -12.0F, -18.0F, -4.75F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, -12.0F, -18.0F, 3.75F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, -12.0F, -18.0F, 6.25F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 201, 56, -7.25F, -18.0F, 10.0F, 1, 11, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 201, 56, -4.75F, -18.0F, 10.0F, 1, 11, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 201, 56, 3.75F, -18.0F, 10.0F, 1, 11, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 201, 56, 6.25F, -18.0F, 10.0F, 1, 11, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, 10.0F, -18.0F, 6.25F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, 10.0F, -18.0F, 3.75F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, 10.0F, -18.0F, -4.75F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 195, 56, 10.0F, -18.0F, -7.25F, 2, 11, 1, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 214, 104, -12.0F, -13.0F, -9.5F, 2, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 214, 124, -9.5F, -13.0F, 10.0F, 19, 1, 2, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 214, 104, 10.0F, -13.0F, -9.5F, 2, 1, 19, 0.0F, false));
		TARDIS.cubeList.add(new ModelBox(TARDIS, 0, 7, -2.5F, -30.0F, -2.5F, 5, 2, 5, 0.0F, false));

		Lamp = new ModelRenderer(this);
		Lamp.setRotationPoint(0.0F, -6.0F, 0.0F);
		Lamp.cubeList.add(new ModelBox(Lamp, 8, 0, -1.5F, -3.0F, -1.0F, 3, 3, 2, 0.0F, false));
		Lamp.cubeList.add(new ModelBox(Lamp, 18, 0, -1.0F, -3.0F, -1.5F, 2, 3, 3, 0.0F, false));
		Lamp.cubeList.add(new ModelBox(Lamp, 0, 4, -1.0F, -3.5F, -1.0F, 2, 1, 2, 0.0F, false));

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-10.5F, 54.0F, -10.5F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 0, 153, 0.0F, -49.0F, -1.0F, 10, 49, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 219, 0, 10.0F, -49.0F, -1.0F, 1, 49, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 219, 0, 9.0F, -49.0F, -2.0F, 1, 49, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 219, 0, 0.0F, -49.0F, -2.0F, 1, 49, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 165, 113, 1.0F, -1.0F, -2.0F, 8, 1, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 165, 113, 1.0F, -13.0F, -2.0F, 8, 1, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 165, 113, 1.0F, -25.0F, -2.0F, 8, 1, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 165, 113, 1.0F, -37.0F, -2.0F, 8, 1, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 165, 113, 1.0F, -49.0F, -2.0F, 8, 1, 3, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 201, 56, 5.75F, -48.0F, -1.5F, 1, 11, 2, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 201, 56, 3.25F, -48.0F, -1.5F, 1, 11, 2, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 236, 127, 1.0F, -43.0F, -1.5F, 8, 1, 2, 0.0F, false));

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(9.5F, 54.0F, -10.5F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 22, 153, -10.0F, -49.0F, -1.0F, 11, 49, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 219, 0, 0.0F, -49.0F, -2.0F, 1, 49, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 228, 52, -9.0F, -49.0F, -2.0F, 1, 49, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 220, 0, -10.0F, -49.0F, -3.0F, 1, 49, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 165, 113, -8.0F, -1.0F, -2.0F, 8, 1, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 165, 113, -8.0F, -13.0F, -2.0F, 8, 1, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 165, 113, -8.0F, -25.0F, -2.0F, 8, 1, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 165, 113, -8.0F, -37.0F, -2.0F, 8, 1, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 165, 113, -8.0F, -49.0F, -2.0F, 8, 1, 3, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 201, 56, -3.25F, -48.0F, -1.5F, 1, 11, 2, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 201, 56, -5.75F, -48.0F, -1.5F, 1, 11, 2, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 236, 127, -8.0F, -43.0F, -1.5F, 8, 1, 2, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 0, 16, -9.0F, -27.5F, -3.0F, 1, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 0, 18, -9.0F, -27.0F, -3.5F, 1, 4, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 0, 16, -9.0F, -23.5F, -3.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.pushMatrix();
        GlStateManager.translate(0, -2.3F, 0);
        GlStateManager.scale(0.65, 0.65, 0.65);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        TARDIS.render(f5);
        Lamp.render(f5);

        LeftDoor.render(f5);
        RightDoor.render(f5);
        GlStateManager.popMatrix();
    }

    public void render(float doorRotation) {
        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.pushMatrix();
        GlStateManager.translate(0, -2.3F, 0);
        GlStateManager.scale(0.65, 0.65, 0.65);

		Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        TARDIS.render(0.0625f);
        Lamp.render(0.0625f);

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