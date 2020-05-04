package me.coodlude.edgeofdarkness.client.renderers;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.models.ModelTest;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;


public class RenderTest extends TileEntitySpecialRenderer<TileEntityTest> {

    ModelTest test = new ModelTest();
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/test.png");

    @Override
    public void render(TileEntityTest te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);

        GlStateManager.rotate(te.rotation, 0, 1, 0);
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        test.render(te.getWorld().getWorldTime(), -te.getWorld().getWorldTime(), te.getWorld().getWorldTime(), 0.0625f);
        GlStateManager.popMatrix();
    }
}