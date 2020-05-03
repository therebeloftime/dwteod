package me.coodlude.edgeofdarkness.common.event;

import me.coodlude.edgeofdarkness.util.helper.schematics.BlockUpdater;
import me.coodlude.edgeofdarkness.util.helper.schematics.SchematicChunk;
import me.coodlude.edgeofdarkness.util.helper.schematics.SchematicUtil;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Map;

@Mod.EventBusSubscriber
public class ServerEvents {

    @SubscribeEvent
    public static void handleSchematicQueue(TickEvent.WorldTickEvent event) {


        if(event.world.getWorldTime() % 250 == 0 && BlockUpdater.BlockUpdaterHandler.tempUpdaters.size() > 0) {
            for (Map.Entry<Long, BlockUpdater> entry : BlockUpdater.BlockUpdaterHandler.tempUpdaters.entrySet()) {
                BlockUpdater.BlockUpdaterHandler.blockUpdaterList.clear();
                BlockUpdater.BlockUpdaterHandler.blockUpdaterList.add(entry.getValue());
            }
            BlockUpdater.BlockUpdaterHandler.tempUpdaters.clear();

        }
        BlockUpdater.BlockUpdaterHandler.handle(event.world);


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

            if(SchematicUtil.queue.size() == 1 || (SchematicUtil.queue.size() > 1 && SchematicUtil.queue.get(1).pPos.toLong() != chunk.pPos.toLong())) {
                BlockUpdater.BlockUpdaterHandler.tempUpdaters.get(chunk.getQueuePos().toLong()).complete();
            }

            if (chunk.isDone()) SchematicUtil.queue.remove(0);
        }
    }
}
