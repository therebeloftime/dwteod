package me.coodlude.edgeofdarkness.client.renderers;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.client.models.ModelDoor;
import me.coodlude.edgeofdarkness.common.blocks.BlockDoor;
import me.coodlude.edgeofdarkness.common.blocks.BlockTardis;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityDoor;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import me.coodlude.edgeofdarkness.util.helper.Helper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;


public class RenderDoor extends TileEntitySpecialRenderer<TileEntityDoor> {

    ModelDoor door = new ModelDoor();
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/door.png");

    @Override
    public void render(TileEntityDoor te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        IBlockState state = te.getWorld().getBlockState(te.getPos());
        GlStateManager.rotate(Helper.getAngleFromFacing(state.getValue(BlockDoor.FACING)), 0, 1, 0);
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        door.render(null, 0,0,0,0,0,0.0625f);
        GlStateManager.popMatrix();
    }
}