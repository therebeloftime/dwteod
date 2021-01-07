package me.coodlude.edgeofdarkness.common.capability;

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.network.packets.PacketCapSync;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nonnull;

public class CapabilityTardis implements ITardisCapability {

    private EntityPlayer player;

    public boolean inFlight = false;
    public int tardisID = 0;


    public CapabilityTardis() {
    }


    public CapabilityTardis(EntityPlayer player) {
        this.player = player;
    }

    @Override
    public void update() {
        if(!player.world.isRemote) {
            if(player.world.provider instanceof WorldProviderTardis) {
                if (tardisID != 0 && TardisHandler.doesTardisExist(tardisID)) {
                    TardisInfo info = TardisHandler.getTardis(tardisID);

                    if (info.inFlight && player.world.getWorldTime() % 80 == 0) {
                        ((EntityPlayerMP) player).connection.sendPacket(new SPacketSoundEffect(ModSounds.FLY, SoundCategory.BLOCKS, player.posX, player.posY, player.posZ, 1, 1));
                    }
                }
            }
        }
    }

    @Override
    public void sync() {
        if (!player.world.isRemote)
            NetworkHandler.NETWORK.sendToAll(new PacketCapSync(player, serializeNBT()));
    }

    @Override
    public void setFlight(boolean flight) {
        this.inFlight = flight;
    }

    @Override
    public boolean isInFlight() {
        return inFlight;
    }

    @Override
    public void setTardisID(int id) {
        this.tardisID = id;
    }

    @Override
    public int getTardisID() {
        return tardisID;
    }


    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setBoolean("inflight", inFlight);
        nbt.setInteger("tardisID", tardisID);
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        inFlight = nbt.getBoolean("inflight");
        tardisID = nbt.getInteger("tardisID");
    }

    @Mod.EventBusSubscriber(modid = EdgeOfDarkness.MODID)
    public static class Events {

        @SubscribeEvent
        public static void attach(AttachCapabilitiesEvent<Entity> event) {
            if (event.getObject() instanceof EntityPlayer)
                event.addCapability(new ResourceLocation(EdgeOfDarkness.MODID, "tardis-cap"), new CapTardisStorage.TardisCapProvider((EntityPlayer) event.getObject()));
        }

        @SubscribeEvent
        public static void update(LivingEvent.LivingUpdateEvent event) {
            CapabilityTardis cap = event.getEntityLiving().getCapability(CapTardisStorage.CAPABILITY, null);
            if (cap != null) {
                cap.update();
                cap.sync();
            }
        }

        @SubscribeEvent
        public static void onPlayerClone(PlayerEvent.Clone event) {
            Capability.IStorage storage = CapTardisStorage.CAPABILITY.getStorage();

            ITardisCapability oldCap = get(event.getOriginal());
            ITardisCapability newCap = get(event.getEntityPlayer());

            NBTTagCompound nbt = (NBTTagCompound) storage.writeNBT(CapTardisStorage.CAPABILITY, oldCap, null);
            storage.readNBT(CapTardisStorage.CAPABILITY, newCap, null, nbt);
            get(event.getEntityPlayer()).sync();
        }

        @SubscribeEvent
        public static void playerTracking(PlayerEvent.StartTracking event) {
            get(event.getEntityPlayer()).sync();
        }

        @SubscribeEvent
        public static void onPlayerLeave(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent event) {
        }
    }


    @SubscribeEvent
    public static void onPlayerRespawn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event) {
        get(event.player).sync();
    }


    @SubscribeEvent
    public static void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
        get(event.player).sync();
    }

    @SubscribeEvent
    public static void onDeathEvent(LivingDeathEvent e) {
        if (e.getEntityLiving() instanceof EntityPlayer) {
            get((EntityPlayer) e.getEntityLiving()).sync();
        }
    }

    @Nonnull
    public static ITardisCapability get(EntityPlayer player) {
        if (player.hasCapability(CapTardisStorage.CAPABILITY, null)) {
            return player.getCapability(CapTardisStorage.CAPABILITY, null);
        }
        throw new IllegalStateException("Missing Capability - Edge");
    }
}
