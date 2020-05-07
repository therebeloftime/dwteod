// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ModelTardisTrashCan extends ModelTardisBase {
	private final ModelRenderer TrashCan;

	public ModelTardisTrashCan() {
		textureWidth = 16;
		textureHeight = 16;

		TrashCan = new ModelRenderer(this);
		TrashCan.setRotationPoint(7.0F, 24.0F, -8.0F);
		TrashCan.setTextureOffset(0, 14).addBox(-12.0F, -14.0F, 4.0F, 9.0F, 14.0F, 9.0F, 0.0F, false);
		TrashCan.setTextureOffset(0, 11).addBox(-13.0F, -15.0F, 3.0F, 11.0F, 1.0F, 11.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		TrashCan.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}