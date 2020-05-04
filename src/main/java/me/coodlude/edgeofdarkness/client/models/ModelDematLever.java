package me.coodlude.edgeofdarkness.client.models;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDematLever extends ModelBase {
	private final ModelRenderer levercomp;
	private final ModelRenderer lever;
	private final ModelRenderer lever_1;
	private final ModelRenderer All;
	private final ModelRenderer blok;
	private final ModelRenderer Blue;
	private final ModelRenderer Blue2;
	private final ModelRenderer Side20345;
	private final ModelRenderer Side203rigtben10;
	private final ModelRenderer Side;
	private final ModelRenderer Side203rigtben;
	private final ModelRenderer Side203backside;
	private final ModelRenderer Side203back;
	private final ModelRenderer Side203Frontu;
	private final ModelRenderer Side203;
	private final ModelRenderer Mainblackplate;
	private final ModelRenderer BasisOverlay2;
	private final ModelRenderer BasisOverlay;
	private final ModelRenderer Basis3;
	private final ModelRenderer Basis2;
	private final ModelRenderer Basis;

	public ModelDematLever() {
		textureWidth = 112;
		textureHeight = 112;

		levercomp = new ModelRenderer(this);
		levercomp.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(levercomp, 0.0F, 1.5708F, 0.0F);

		lever = new ModelRenderer(this);
		lever.setRotationPoint(0.0F, -3.0F, 0.0F);
		levercomp.addChild(lever);
		lever.cubeList.add(new ModelBox(lever, 0, 38, 5.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, true));

		lever_1 = new ModelRenderer(this);
		lever_1.setRotationPoint(0.0F, -3.0F, 0.0F);
		levercomp.addChild(lever_1);
		lever_1.cubeList.add(new ModelBox(lever_1, 0, 28, -1.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

		All = new ModelRenderer(this);
		All.setRotationPoint(0.0F, 24.0F, 0.0F);

		blok = new ModelRenderer(this);
		blok.setRotationPoint(-2.0F, -2.7F, -2.0F);
		All.addChild(blok);
		blok.cubeList.add(new ModelBox(blok, 0, 20, 0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		Blue = new ModelRenderer(this);
		Blue.setRotationPoint(5.0F, -0.5F, 6.0F);
		All.addChild(Blue);
		Blue.cubeList.add(new ModelBox(Blue, 10, 67, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Blue2 = new ModelRenderer(this);
		Blue2.setRotationPoint(6.0F, -0.5F, 4.0F);
		All.addChild(Blue2);
		Blue2.cubeList.add(new ModelBox(Blue2, 10, 67, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Side20345 = new ModelRenderer(this);
		Side20345.setRotationPoint(4.0F, -0.5F, 4.0F);
		All.addChild(Side20345);
		Side20345.cubeList.add(new ModelBox(Side20345, 0, 44, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Side203rigtben10 = new ModelRenderer(this);
		Side203rigtben10.setRotationPoint(-6.0F, -0.5F, -4.9333F);
		All.addChild(Side203rigtben10);
		Side203rigtben10.cubeList.add(new ModelBox(Side203rigtben10, 0, 44, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Side = new ModelRenderer(this);
		Side.setRotationPoint(5.0F, -0.5F, 4.0F);
		setRotationAngle(Side, 3.1416F, 1.5708F, 3.1416F);
		All.addChild(Side);
		Side.cubeList.add(new ModelBox(Side, 0, 44, 0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, false));

		Side203rigtben = new ModelRenderer(this);
		Side203rigtben.setRotationPoint(4.0F, -0.5F, -5.0F);
		All.addChild(Side203rigtben);
		Side203rigtben.cubeList.add(new ModelBox(Side203rigtben, 0, 44, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Side203backside = new ModelRenderer(this);
		Side203backside.setRotationPoint(-7.0F, -0.5F, 4.0F);
		setRotationAngle(Side203backside, 3.1416F, 1.5708F, 3.1416F);
		All.addChild(Side203backside);
		Side203backside.cubeList.add(new ModelBox(Side203backside, 0, 44, 0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, false));

		Side203back = new ModelRenderer(this);
		Side203back.setRotationPoint(-4.0F, -0.5F, -7.0F);
		All.addChild(Side203back);
		Side203back.cubeList.add(new ModelBox(Side203back, 0, 44, 0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, false));

		Side203Frontu = new ModelRenderer(this);
		Side203Frontu.setRotationPoint(-4.0F, -0.5F, 6.0F);
		All.addChild(Side203Frontu);
		Side203Frontu.cubeList.add(new ModelBox(Side203Frontu, 0, 44, 0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, false));

		Side203 = new ModelRenderer(this);
		Side203.setRotationPoint(-6.0F, -0.5F, 4.0F);
		All.addChild(Side203);
		Side203.cubeList.add(new ModelBox(Side203, 0, 44, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Mainblackplate = new ModelRenderer(this);
		Mainblackplate.setRotationPoint(-5.0F, -0.5F, -6.0F);
		All.addChild(Mainblackplate);
		Mainblackplate.cubeList.add(new ModelBox(Mainblackplate, 0, 37, 0.0F, 0.0F, 0.0F, 9, 1, 12, 0.0F, false));

		BasisOverlay2 = new ModelRenderer(this);
		BasisOverlay2.setRotationPoint(-3.0F, -1.7F, 4.0F);
		setRotationAngle(BasisOverlay2, 3.1416F, 1.5708F, 3.1416F);
		All.addChild(BasisOverlay2);
		BasisOverlay2.cubeList.add(new ModelBox(BasisOverlay2, 87, 12, 0.0F, 0.0F, 0.0F, 8, 2, 5, 0.0F, false));

		BasisOverlay = new ModelRenderer(this);
		BasisOverlay.setRotationPoint(-5.0F, -1.8F, -3.0F);
		All.addChild(BasisOverlay);
		BasisOverlay.cubeList.add(new ModelBox(BasisOverlay, 83, 0, 0.0F, 0.0F, 0.0F, 9, 2, 6, 0.0F, false));

		Basis3 = new ModelRenderer(this);
		Basis3.setRotationPoint(-5.0F, -1.5F, -5.0F);
		All.addChild(Basis3);
		Basis3.cubeList.add(new ModelBox(Basis3, 0, 0, 0.0F, 0.0F, 0.0F, 9, 2, 10, 0.0F, false));

		Basis2 = new ModelRenderer(this);
		Basis2.setRotationPoint(-4.0F, -1.5F, -6.0F);
		All.addChild(Basis2);
		Basis2.cubeList.add(new ModelBox(Basis2, 0, 0, 0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F, false));

		Basis = new ModelRenderer(this);
		Basis.setRotationPoint(-6.0F, -1.5F, -4.0F);
		All.addChild(Basis);
		Basis.cubeList.add(new ModelBox(Basis, 0, 0, 0.0F, 0.0F, 0.0F, 11, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		levercomp.render(f5);
		All.render(f5);
	}

	public void render(float rotation) {
		levercomp.render(0.0625f);
		levercomp.rotateAngleY = rotation;
		All.render(0.0625f);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}