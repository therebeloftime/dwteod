package me.coodlude.edgeofdarkness.network.packets;

import io.netty.buffer.ByteBuf;
import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketTardisInfo implements IMessage {

    public String action;
    public String info;

    public PacketTardisInfo() {
    }

    public PacketTardisInfo(String action, String info) {
        this.action = action;
        this.info = info;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        action = ByteBufUtils.readUTF8String(buf);
        info = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, action);
        ByteBufUtils.writeUTF8String(buf, info);
    }

    public static class Handler implements IMessageHandler<PacketTardisInfo, IMessage> {

        public Handler() {

        }

        @Override
        public IMessage onMessage(PacketTardisInfo mes, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> {
                ITardisCapability capability = ctx.getServerHandler().player.getCapability(CapTardisStorage.CAPABILITY, null);
                TardisInfo info = TardisHandler.getTardis(capability.getTardisID());
                String action = mes.action;
                String info_msg = mes.info;

                if (info != null && !action.equals("")) {

                    switch (action) {

                        case "destination_position":
                            if (!info_msg.equals("")) {
                                info.setDestinationPos(BlockPos.fromLong(Long.parseLong(info_msg)));
                            }
                            break;

                        case "destination_dim":
                            if (!info_msg.equals("")) {
                                info.setDestinationDim(Integer.parseInt(info_msg));
                            }
                            break;
                        case "warp":
                            if (!info_msg.equals("")) {
                                TardisHandler.immediateLanding(capability.getTardisID(), info.getDestinationPos(), info.destinationDim);
                            }
                            break;
                    }
                }
            });
            return null;
        }
    }
}
