package me.coodlude.edgeofdarkness.client.renderers;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.models.ModelDoorTrashCan;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityDoorTrashCan;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;


public class RenderDoorTrashCan extends TileEntitySpecialRenderer<TileEntityDoorTrashCan> {

    ModelDoorTrashCan door = new ModelDoorTrashCan();
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/trash_can.png");

    @Override
    public void render(TileEntityDoorTrashCan te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        // IBlockState state = te.getWorld().getBlockState(te.getPos());
        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.rotate(90, 0, 1, 0);
        GlStateManager.translate(0.5, -1.4, 0.5);
        //Helper.getAngleFromFacing(state.getValue(BlockDoor.FACING))
        GlStateManager.rotate(te.rotation, 0, 1, 0);
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        door.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GlStateManager.popMatrix();
    }
}