package me.coodlude.edgeofdarkness.client.renderers;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.models.ModelDematLever;
import me.coodlude.edgeofdarkness.client.models.ModelScreen;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityDematLever;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityMonitor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;


public class RenderDematLever extends TileEntitySpecialRenderer<TileEntityDematLever> {

    ModelDematLever lever = new ModelDematLever();
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/dematlever.png");

    @Override
    public void render(TileEntityDematLever te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);

        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.rotate(90, 0, 1, 0);
        GlStateManager.translate(0.5, -1.48, 0.5);

        GlStateManager.rotate(te.rotation, 0, 1, 0);
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        lever.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GlStateManager.popMatrix();
    }
}