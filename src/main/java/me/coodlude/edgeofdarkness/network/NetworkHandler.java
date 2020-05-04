package me.coodlude.edgeofdarkness.network;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.network.packets.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {

    public static SimpleNetworkWrapper NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(EdgeOfDarkness.MODID);
    public static int id = -1;

    public static void init() {
        NETWORK.registerMessage(PacketDemat.Handler.class, PacketDemat.class, id++, Side.CLIENT);
        NETWORK.registerMessage(PacketVisible.Handler.class, PacketVisible.class, id++, Side.CLIENT);
        NETWORK.registerMessage(PacketCapSync.Handler.class, PacketCapSync.class, id++, Side.CLIENT);
        NETWORK.registerMessage(PacketTardisInfo.Handler.class, PacketTardisInfo.class, id++, Side.SERVER);
        NETWORK.registerMessage(PacketTardisSnap.Handler.class, PacketTardisSnap.class, id++, Side.SERVER);
        NETWORK.registerMessage(Packet_OpenGui.Handler.class, Packet_OpenGui.class, id++, Side.CLIENT);
        NETWORK.registerMessage(Packet_RequestGui.Handler.class, Packet_RequestGui.class, id++, Side.SERVER);
    }
}
