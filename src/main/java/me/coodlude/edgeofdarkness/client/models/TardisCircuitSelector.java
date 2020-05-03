package me.coodlude.edgeofdarkness.client.models;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import me.coodlude.edgeofdarkness.client.models.ModelTardisBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class TardisCircuitSelector extends ModelTardisBase {

	private final ModelRenderer base;
	private final ModelRenderer circle;
	private final ModelRenderer bone;
	private final ModelRenderer circle3;
	private final ModelRenderer circle4;
	private final ModelRenderer circle5;
	private final ModelRenderer circle6;
	private final ModelRenderer circle7;
	private final ModelRenderer circle8;
	private final ModelRenderer circle9;
	private final ModelRenderer circle2;
	private final ModelRenderer circle10;

	public TardisCircuitSelector() {
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);

		circle = new ModelRenderer(this);
		circle.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle, 0.0F, 2.7053F, 0.0F);
		base.addChild(circle);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, -3.0F);
		setRotationAngle(bone, 0.0F, -0.0873F, 0.0F);
		circle.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 6, 17, -0.4809F, -1.0F, 4.89F, 2, 1, 1, 0.0F, false));

		circle3 = new ModelRenderer(this);
		circle3.setRotationPoint(0.0F, 0.0F, -3.0F);
		setRotationAngle(circle3, 0.0F, -1.309F, 0.0F);
		circle.addChild(circle3);
		circle3.cubeList.add(new ModelBox(circle3, 0, 17, 2.1752F, -1.0F, 2.4325F, 2, 1, 1, 0.0F, false));

		circle4 = new ModelRenderer(this);
		circle4.setRotationPoint(-3.0F, 3.0F, 2.0F);
		setRotationAngle(circle4, 0.0F, 2.1817F, 0.0F);
		circle.addChild(circle4);
		circle4.cubeList.add(new ModelBox(circle4, 6, 14, -1.4806F, -4.0F, 5.2047F, 2, 1, 1, 0.0F, false));

		circle5 = new ModelRenderer(this);
		circle5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle5, 0.0F, -0.8727F, 0.0F);
		circle4.addChild(circle5);
		circle5.cubeList.add(new ModelBox(circle5, 0, 14, 1.8014F, -4.0F, 4.1225F, 2, 1, 1, 0.0F, false));

		circle6 = new ModelRenderer(this);
		circle6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle6, 0.0F, -1.3963F, 0.0F);
		circle4.addChild(circle6);
		circle6.cubeList.add(new ModelBox(circle6, 6, 12, 2.1213F, -4.0F, 2.5355F, 2, 1, 1, 0.0F, false));

		circle7 = new ModelRenderer(this);
		circle7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle7, 0.0F, -1.1345F, 0.0F);
		circle6.addChild(circle7);
		circle7.cubeList.add(new ModelBox(circle7, 0, 12, 1.1334F, -4.0F, -5.3805F, 2, 1, 1, 0.0F, false));

		circle8 = new ModelRenderer(this);
		circle8.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle8, 0.0F, -2.3562F, 0.0F);
		circle7.addChild(circle8);
		circle8.cubeList.add(new ModelBox(circle8, 8, 10, -4.6061F, -4.0F, 2.0032F, 2, 1, 1, 0.0F, false));

		circle9 = new ModelRenderer(this);
		circle9.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle9, 0.0F, -2.4435F, 0.0F);
		circle8.addChild(circle9);
		circle9.cubeList.add(new ModelBox(circle9, 6, 0, 1.9268F, -4.0F, -0.6254F, 2, 1, 1, 0.0F, false));

		circle2 = new ModelRenderer(this);
		circle2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle2, 0.0F, -2.0071F, 0.0F);
		circle9.addChild(circle2);
		circle2.cubeList.add(new ModelBox(circle2, 12, 0, 0.4315F, -4.0F, -1.6367F, 1, 1, 1, 0.0F, false));

		circle10 = new ModelRenderer(this);
		circle10.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(circle10, 0.0F, -2.7053F, 0.0F);
		circle2.addChild(circle10);
		circle10.cubeList.add(new ModelBox(circle10, 12, 12, -2.1685F, -4.0F, 0.1001F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		base.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}