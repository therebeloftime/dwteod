package me.coodlude.edgeofdarkness.common.init.tardis.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Event;

import java.util.UUID;

public class EventLeaveTardis extends Event {

    public int tardisID;
    public UUID uuid;

    public EventLeaveTardis(EntityPlayer player, int tardisID) {
        super();
        this.tardisID = tardisID;
        this.uuid = player.getUniqueID();
    }

    public int getTardisID() {
        return tardisID;
    }

    public UUID getUuid() {
        return uuid;
    }
}
