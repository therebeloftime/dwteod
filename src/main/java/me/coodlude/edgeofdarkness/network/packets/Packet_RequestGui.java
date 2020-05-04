package me.coodlude.edgeofdarkness.network.packets;

import io.netty.buffer.ByteBuf;
import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.init.ModGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import javax.swing.*;

public class Packet_RequestGui implements IMessage {
    public int gui;

    public Packet_RequestGui() {
    }

    public Packet_RequestGui(int guiID) {
        this.gui = gui;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        gui = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(gui);
    }

    public static class Handler implements IMessageHandler<Packet_RequestGui, IMessage> {

        @Override
        public IMessage onMessage(Packet_RequestGui message, MessageContext ctx) {
            EntityPlayer player = ctx.getServerHandler().player;

            ctx.getServerHandler().player.world.getMinecraftServer().addScheduledTask(() -> {
                player.openGui(EdgeOfDarkness.instance, message.gui, player.world, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
            });
            return null;
        }
    }
}
