package me.coodlude.edgeofdarkness.client.events;

import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class ClientHandler {

    public static boolean sound;

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void renderPlayer(RenderPlayerEvent.Pre event) {

        EntityPlayer player = event.getEntityPlayer();
        ITardisCapability capability = player.getCapability(CapTardisStorage.CAPABILITY, null);


        if (capability.isInFlight()) {
            event.setCanceled(true);
            GlStateManager.pushMatrix();

            if (!event.getEntityPlayer().collidedVertically) {
                GlStateManager.rotate(event.getEntityPlayer().world.getWorldTime() * 12, 0, 1, 0);
            }

            if (player.world.getWorldTime() % 60 == 0 && !sound) {
                player.playSound(ModSounds.FLY, 1, 1);
                sound = true;
            }

            if (player.world.getWorldTime() % 61 == 0) {
                sound = false;
            }

            TardisSkinRegistry.circuitList.get(0).renderExterior();
            GlStateManager.popMatrix();
        }
    }

}
