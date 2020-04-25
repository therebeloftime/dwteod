package me.coodlude.edgeofdarkness.proxy;

import me.coodlude.edgeofdarkness.client.renderers.exterior.RenderTardis;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements IProxy {
    @Override
    public void preInit() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTardis.class, new RenderTardis());
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }
}
