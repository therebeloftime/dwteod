package me.coodlude.edgeofdarkness.network.packets;

import io.netty.buffer.ByteBuf;
import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketTardisSnap implements IMessage {

    public PacketTardisSnap() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    public static class Handler implements IMessageHandler<PacketTardisSnap, IMessage> {

        public Handler() {

        }

        @Override
        public IMessage onMessage(PacketTardisSnap mes, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> {
                EntityPlayer player = ctx.getServerHandler().player;
                ITardisCapability capability = player.getCapability(CapTardisStorage.CAPABILITY, null);

                if (capability != null && capability.getTardisID() != 0) {
                    TardisInfo info = TardisHandler.getTardis(capability.getTardisID());

                    if(info != null) {
                        BlockPos pos = info.getExtereriorPos();

                        if((player.dimension == info.getExteriorDim() && player.getPosition().getDistance(pos.getX(), pos.getY(), pos.getZ()) <= 25) || player.dimension == ModDimension.TARDISID) {
                            player.sendStatusMessage(new TextComponentTranslation("msg.tardis.snap"), true);
                            info.setOpen(!info.isOpen());
                        }
                    }
                }
            });
            return null;
        }
    }
}
