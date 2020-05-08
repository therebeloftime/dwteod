// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class custom_model extends ModelBase {
	private final ModelRenderer Rotor;
	private final ModelRenderer GlowSticks;
	private final ModelRenderer BottomPole;
	private final ModelRenderer TopPole;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		Rotor = new ModelRenderer(this);
		Rotor.setRotationPoint(0.0F, 24.0F, 0.0F);
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 24, -8.0F, -8.0F, -8.0F, 16, 8, 16, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, -8.0F, -48.0F, -8.0F, 16, 8, 16, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 48, -7.0F, -9.0F, -8.0F, 14, 1, 16, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 65, -8.0F, -9.0F, -7.0F, 16, 1, 14, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 48, -7.0F, -40.0F, -8.0F, 14, 1, 16, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 65, -8.0F, -40.0F, -7.0F, 16, 1, 14, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, -6.0F, -12.0F, -1.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, -6.5F, -12.0F, -0.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, -3.0F, -12.0F, 4.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, -3.5F, -12.0F, 4.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, 2.0F, -12.0F, 4.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, 1.5F, -12.0F, 4.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, 5.0F, -12.0F, -1.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, 4.5F, -12.0F, -0.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, 2.0F, -12.0F, -6.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, 1.5F, -12.0F, -5.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, -3.0F, -12.0F, -6.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, -3.5F, -12.0F, -5.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, -6.0F, -39.0F, -1.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, -6.5F, -39.0F, -0.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, -3.0F, -39.0F, 4.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, -3.5F, -39.0F, 4.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, 2.0F, -39.0F, 4.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, 1.5F, -39.0F, 4.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, 5.0F, -39.0F, -1.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, 4.5F, -39.0F, -0.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, 2.0F, -39.0F, -6.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, 1.5F, -39.0F, -5.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 0, -3.0F, -39.0F, -6.0F, 1, 3, 2, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 0, 5, -3.5F, -39.0F, -5.5F, 2, 3, 1, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 74, 0, -6.5F, -39.0F, -7.0F, 13, 30, 14, 0.0F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 74, 44, -7.0F, -39.0F, -6.5F, 14, 30, 13, 0.0F, false));

		GlowSticks = new ModelRenderer(this);
		GlowSticks.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rotor.addChild(GlowSticks);
		GlowSticks.cubeList.add(new ModelBox(GlowSticks, 64, 0, -6.0F, -39.0F, -0.5F, 1, 30, 1, 0.0F, false));
		GlowSticks.cubeList.add(new ModelBox(GlowSticks, 64, 0, -3.0F, -39.0F, 4.5F, 1, 30, 1, 0.0F, false));
		GlowSticks.cubeList.add(new ModelBox(GlowSticks, 64, 0, 2.0F, -39.0F, 4.5F, 1, 30, 1, 0.0F, false));
		GlowSticks.cubeList.add(new ModelBox(GlowSticks, 64, 0, 5.0F, -39.0F, -0.5F, 1, 30, 1, 0.0F, false));
		GlowSticks.cubeList.add(new ModelBox(GlowSticks, 64, 0, 2.0F, -39.0F, -5.5F, 1, 30, 1, 0.0F, false));
		GlowSticks.cubeList.add(new ModelBox(GlowSticks, 64, 0, -3.0F, -39.0F, -5.5F, 1, 30, 1, 0.0F, false));

		BottomPole = new ModelRenderer(this);
		BottomPole.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rotor.addChild(BottomPole);
		BottomPole.cubeList.add(new ModelBox(BottomPole, 6, 0, -0.5F, -21.0F, -0.5F, 1, 12, 1, 0.0F, false));

		TopPole = new ModelRenderer(this);
		TopPole.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rotor.addChild(TopPole);
		TopPole.cubeList.add(new ModelBox(TopPole, 6, 0, -0.5F, -39.0F, -0.5F, 1, 12, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Rotor.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}