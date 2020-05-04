package me.coodlude.edgeofdarkness.client.renderers;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.models.TardisCircuitSelector;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityCircuitSelector;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;


public class RenderCircuitSelector extends TileEntitySpecialRenderer<TileEntityCircuitSelector> {

    public TardisCircuitSelector test = new TardisCircuitSelector();
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/circuitselector.png");

    @Override
    public void render(TileEntityCircuitSelector te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.rotate(90, 0, 1, 0);
        GlStateManager.translate(0.5, -1.55, 0.5);
        GlStateManager.rotate(te.rotation, 0, 1, 0);
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        float f = te.getWorld().getWorldTime() / 0.5f;
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        test.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GlStateManager.rotate(-180, 1, 0, 0);
        GlStateManager.rotate(f, 0, 1, 0);
        GlStateManager.translate(0.0, -1.40, 0.0);
        GlStateManager.scale(0.2f, 0.2f, 0.2);
        GlStateManager.color(1, 1, 1, te.alpha);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        TardisSkinRegistry.circuitList.get(te.circuitID).renderExterior((1.0f / 45) * te.doorOpen);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
}