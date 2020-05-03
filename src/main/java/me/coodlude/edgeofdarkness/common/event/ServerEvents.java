package me.coodlude.edgeofdarkness.common.event;

import me.coodlude.edgeofdarkness.util.helper.schematics.SchematicChunk;
import me.coodlude.edgeofdarkness.util.helper.schematics.SchematicUtil;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber
public class ServerEvents {

    @SubscribeEvent
    public static void handleSchematicQueue(TickEvent.WorldTickEvent event) {


        if (SchematicUtil.queue.size() > 0) {
            SchematicChunk chunk = SchematicUtil.queue.get(0);

            if(chunk != null) {
                World world = event.world.getMinecraftServer().getWorld(chunk.dimID);

                try {
                    if (!chunk.isDone()) {
                        SchematicUtil.pasteBlocks(chunk, world, chunk.ignoreAir);
                        chunk.setDone(true);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                SchematicUtil.queue.remove(0);
            }

            if (chunk.isDone()) SchematicUtil.queue.remove(0);
        }
    }
}
