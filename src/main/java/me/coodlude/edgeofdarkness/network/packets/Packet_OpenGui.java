package me.coodlude.edgeofdarkness.network.packets;

import io.netty.buffer.ByteBuf;
import me.coodlude.edgeofdarkness.common.init.ModGuiHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Packet_OpenGui implements IMessage {

    public int gui;
    public int x, y, z;
    public int argsSize;
    public String[] args;

    public Packet_OpenGui() {
    }

    public Packet_OpenGui(int guiID, BlockPos p, String... args) {
        this.gui = guiID;
        this.x = p.getX();
        this.y = p.getY();
        this.z = p.getZ();
        argsSize = args.length;
        this.args = args;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(gui);
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeInt(argsSize);
        for (String arg : args) {
            ByteBufUtils.writeUTF8String(buf, arg);
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        gui = buf.readInt();
        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
        argsSize = buf.readInt();
        args = new String[argsSize];
        for (int x = 0; x < argsSize; x++) {
            args[x] = ByteBufUtils.readUTF8String(buf);
        }
    }

    public static class Handler implements IMessageHandler<Packet_OpenGui, IMessage> {

        @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(Packet_OpenGui message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> {
                if (message.gui == -1) {
                    Minecraft.getMinecraft().displayGuiScreen(null);
                } else {
                    GuiScreen s = (GuiScreen) ModGuiHandler.openGui(message.gui, Minecraft.getMinecraft().player, Minecraft.getMinecraft().world, message.x, message.y, message.z, message.args);
                    Minecraft.getMinecraft().displayGuiScreen(s);
                }
            });
            return null;
        }
    }
}
