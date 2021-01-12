package me.coodlude.edgeofdarkness.client.models;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TardisCircuitSelector extends ModelBase {
	private final ModelRenderer base;

	public TardisCircuitSelector() {
		textureWidth = 32;
		textureHeight = 32;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.cubeList.add(new ModelBox(base, 0, 0, 4.0F, -1.0F, -5.0F, 1, 1, 10, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 11, -5.0F, -1.0F, -5.0F, 1, 1, 10, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 14, 2, -4.0F, -1.0F, 4.0F, 8, 1, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 14, 0, -4.0F, -1.0F, -5.0F, 8, 1, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 24, -4.0F, 0.0F, -4.0F, 8, 0, 8, 0.0F, false));
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