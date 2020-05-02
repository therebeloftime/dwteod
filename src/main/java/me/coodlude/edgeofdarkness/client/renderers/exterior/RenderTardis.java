package me.coodlude.edgeofdarkness.client.renderers.exterior;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;

public class RenderTardis extends TileEntitySpecialRenderer<TileEntityTardis> {

    @Override
    public void render(TileEntityTardis te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();

        GlStateManager.translate(x + 0.5, y, z + 0.5);
        GlStateManager.rotate(te.rotation, 0, 1, 0);
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

        if (te.alpha < 1) {
            double i = te.getWorld().rand.nextDouble() / 320 + 1;
            GlStateManager.scale(i, i, i);
            GlStateManager.color(1, 1, 1, te.alpha);
        }


        if (te.getWorld().getBlockState(te.getPos().down()).getBlock() == Blocks.AIR) {
            GlStateManager.rotate(te.getWorld().getWorldTime() / 0.5f, 0, 1, 0);
        }

        TardisSkinRegistry.circuitList.get(te.circuitID).basemodel.render((1.0f / 45) * te.door_rotation);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
}
