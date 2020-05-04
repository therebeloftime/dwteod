package me.coodlude.edgeofdarkness.client.renderers;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.models.ModelFlightPanel;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityFlightPanel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;


public class RenderFlightPanel extends TileEntitySpecialRenderer<TileEntityFlightPanel> {

    ModelFlightPanel flightPanel = new ModelFlightPanel();
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/flight_panel.png");

    @Override
    public void render(TileEntityFlightPanel te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y, z + 0.5);

        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.rotate(180, 0, 1, 0);
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        GlStateManager.rotate(te.rotation + 180, 0, 1, 0);
        flightPanel.render(null, te.translate, 0, 0, 0, 0, 0.0625f);
        FontRenderer renderer = Minecraft.getMinecraft().fontRenderer;
        GlStateManager.rotate(90, 0, 1, 0);
        GlStateManager.translate(-0.35, -0.5, -0.01);
        GlStateManager.scale(0.0035, 0.0035, 0.0035);
        TardisInfo info = te.info;

        if (info != null && te.translate != 0.52f) {
            renderer.drawString("Tardis ID: " + info.tardisID ,0, -5, 0XFA00);
            renderer.drawString("Tardis Position: Z:" + info.getExtereriorPos().getX() + " Y:" + info.getExtereriorPos().getY() + " Z:" + info.getExtereriorPos().getZ(), 0, 5, 0xFA00);
            renderer.drawString("Tardis Dimension: " + info.getExteriorDim(), 0, 15, 0xFA00);

            renderer.drawString("Tardis Destination: Z:" + info.getDestinationPos().getX() + " Y:" + info.getDestinationPos().getY() + " Z:" + info.getDestinationPos().getZ(), 0, 35, 0xFA00);
            renderer.drawString("Tardis Destination Dim: " + info.getDestinationDim(), 0, 45, 0xFA00);
            renderer.drawString("Travel Time Left: " + info.travelTime / 20, 0, 65, 0xFA00);
        }

        GlStateManager.popMatrix();
    }

    public int addi(int x) {
        x = x + 10;
        return x + 10;
    }
}