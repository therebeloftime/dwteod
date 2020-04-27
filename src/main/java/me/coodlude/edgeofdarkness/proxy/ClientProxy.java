package me.coodlude.edgeofdarkness.proxy;

import me.coodlude.edgeofdarkness.client.renderers.RenderDoor;
import me.coodlude.edgeofdarkness.client.renderers.RenderMonitor;
import me.coodlude.edgeofdarkness.client.renderers.exterior.RenderTardis;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityDoor;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityMonitor;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements IProxy {
    @Override
    public void preInit() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTardis.class, new RenderTardis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDoor.class, new RenderDoor());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMonitor.class, new RenderMonitor());
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }
}
