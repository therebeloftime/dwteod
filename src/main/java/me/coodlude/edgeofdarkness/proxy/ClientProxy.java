package me.coodlude.edgeofdarkness.proxy;

import me.coodlude.edgeofdarkness.client.init.ModKeybinds;
import me.coodlude.edgeofdarkness.client.renderers.*;
import me.coodlude.edgeofdarkness.client.renderers.exterior.RenderTardis;
import me.coodlude.edgeofdarkness.common.tileentity.*;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements IProxy {
    @Override
    public void preInit() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTardis.class, new RenderTardis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDoor.class, new RenderDoor());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMonitor.class, new RenderMonitor());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDematLever.class, new RenderDematLever());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCircuitSelector.class, new RenderCircuitSelector());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlightPanel.class, new RenderFlightPanel());
        ModKeybinds.init();
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }
}
