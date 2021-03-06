package me.coodlude.edgeofdarkness.client.renderers;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.models.ModelScreen;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityMonitor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;


public class RenderMonitor extends TileEntitySpecialRenderer<TileEntityMonitor> {

    ModelScreen screen = new ModelScreen();
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/screen.png");

    @Override
    public void render(TileEntityMonitor te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);

        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.rotate(90, 0, 1, 0);
        GlStateManager.scale(1.5,1.5,1.5);
        GlStateManager.translate(0.3, -1.48, 0.345);

        GlStateManager.rotate(te.rotation, 0, 1, 0);
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        screen.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GlStateManager.popMatrix();
    }
}