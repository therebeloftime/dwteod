package me.coodlude.edgeofdarkness.client.renderers.exterior;

import me.coodlude.edgeofdarkness.common.blocks.BlockTardis;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import me.coodlude.edgeofdarkness.util.helper.Helper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderTardis extends TileEntitySpecialRenderer<TileEntityTardis> {

    @Override
    public void render(TileEntityTardis te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.translate(x, y, z);
        IBlockState state = te.getWorld().getBlockState(te.getPos());
        GlStateManager.rotate(Helper.getAngleFromFacing(state.getValue(BlockTardis.FACING)), 0, 1, 0);
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1, 1, 1, te.alpha);
        TardisSkinRegistry.circuitList.get(te.circuitID).renderExterior();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
}
