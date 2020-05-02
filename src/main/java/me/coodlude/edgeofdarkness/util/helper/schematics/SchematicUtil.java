package me.coodlude.edgeofdarkness.util.helper.schematics;

import me.coodlude.edgeofdarkness.util.helper.WorldUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.Sys;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josia50
 */

@Mod.EventBusSubscriber
public class SchematicUtil {
    public static List<Schematic> schematics = new ArrayList<>();

    public static List<SchematicChunk> queue = new ArrayList<>();

    public static void addSchematic(Schematic schematic) {
        if (schematic != null) {
            File file = new File("mods/igauntlet/schematics/" + schematic.name + ".json");

            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
                FileOutputStream out = new FileOutputStream(file, false);
                ObjectOutputStream stream = new ObjectOutputStream(out);
                stream.writeObject(schematic);
                stream.close();
            } catch (Exception e) {

            }
        }


    }

    public static Schematic mapSchematic(World world, BlockPos blockpos1, BlockPos blockpos2, BlockPos standingPos, String name) {
        Schematic schematic = new Schematic();

       /* for (BlockPos pos : BlockPos.getAllInBox(blockpos1, blockpos2)) {

            IBlockState state = world.getBlockState(pos);
            BlockPos reference = standingPos.subtract(new Vec3i(pos.getX(), pos.getY(), pos.getZ()));
            SchematicBlockInfo blockInfo = new SchematicBlockInfo(state, world.getTileEntity(pos), reference);

            schematic.addBlockInfo(blockInfo);
        }
        */

        BlockPos blockpos3 = new BlockPos(Math.min(blockpos1.getX(), blockpos2.getX()), Math.min(blockpos1.getY(), blockpos2.getY()), Math.min(blockpos1.getZ(), blockpos2.getZ()));
        BlockPos blockpos4 = new BlockPos(Math.max(blockpos1.getX(), blockpos2.getX()), Math.max(blockpos1.getY(), blockpos2.getY()), Math.max(blockpos1.getZ(), blockpos2.getZ()));


        for (int y = blockpos3.getY(); y <= blockpos4.getY(); ++y) {
            for (int x = blockpos3.getX(); x <= blockpos4.getX(); ++x) {
                for (int z = blockpos3.getZ(); z <= blockpos4.getZ(); ++z) {
                    BlockPos pos = new BlockPos(x, y, z);
                    IBlockState state = world.getBlockState(pos);
                    BlockPos reference = standingPos.subtract(new Vec3i(pos.getX(), pos.getY(), pos.getZ()));
                    SchematicBlockInfo blockInfo = new SchematicBlockInfo(state, world.getTileEntity(pos), reference, pos);
                    schematic.addBlockInfo(blockInfo);
                }
            }
        }

        schematic.setName(name);

        return schematic;
    }

    public static void generateSchematic(Schematic schem, BlockPos pos, World world, boolean ignoreAir) {

        if (schem == null) return;

        SchematicChunk chunk = new SchematicChunk();

        for (SchematicBlockInfo blockInfo : schem.getBlockInfos()) {
            if (schem.getBlockInfos().size() <= 512) {
                BlockPos r = blockInfo.getReference();
                BlockPos pPos = pos.add(r.getX(), -r.getY(), r.getZ());

                WorldUtil.setBlock(world, pPos, blockInfo.blockState, 2);

                if (blockInfo.isTileEntity) {
                    blockInfo.tileTag.setInteger("x", pPos.getX());
                    blockInfo.tileTag.setInteger("y", pPos.getY());
                    blockInfo.tileTag.setInteger("z", pPos.getZ());
                    TileEntity tileEntity = world.getTileEntity(pPos);
                    tileEntity.readFromNBT(blockInfo.tileTag);
                    tileEntity.markDirty();
                }
                world.markAndNotifyBlock(pPos, world.getChunk(pPos), world.getBlockState(pos), world.getBlockState(pPos), 1);
            } else {
                if (chunk.getSchematicBlocks().size() == 1) {
                    chunk.setDimID(world.provider.getDimension());
                    chunk.setIgnoreAir(ignoreAir);
                    chunk.setQueuePos(pos);
                }

                chunk.addBlock(blockInfo);

                if (chunk.schematicBlocks.size() % 512 == 0) {
                    queue.add(chunk);
                    chunk = new SchematicChunk();
                }
            }
        }
        if (chunk.schematicBlocks.size() > 0) {
            queue.add(chunk);
        }
    }

    @SubscribeEvent
    public static void handleSchematicQueue(TickEvent.WorldTickEvent event) {
        if (event.side.isServer()) {

            if (queue.size() > 0) {
                SchematicChunk chunk = queue.get(0);
                World world;

                world = event.world.getMinecraftServer().getWorld(chunk.dimID);

                if (world.provider.getDimension() == chunk.dimID) {

                    try {
                        if (!chunk.isDone()) {
                            pasteBlocks(chunk, world, chunk.ignoreAir);
                            chunk.setDone(true);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (chunk.isDone()) queue.remove(0);
                }
            }
        }
    }

    public static void pasteBlocks(SchematicChunk chunk, World world, boolean ignoreAir) {
        for (SchematicBlockInfo blockInfo : chunk.getSchematicBlocks()) {
            BlockPos r = blockInfo.getReference();
            BlockPos pPos = chunk.getQueuePos().add(r.getX(), -r.getY(), r.getZ());

            if ((blockInfo.blockState.getBlock() == Blocks.AIR && ignoreAir) || blockInfo.blockState.getBlock() == world.getBlockState(pPos).getBlock()) continue;
            setAndSetup(blockInfo, pPos, world);
        }
    }

    public static void setAndSetup(SchematicBlockInfo blockInfo, BlockPos pPos, World world) {
        WorldUtil.setBlock(world, pPos, blockInfo.blockState, 2);

        if (blockInfo.isTileEntity) {
            blockInfo.tileTag.setInteger("x", pPos.getX());
            blockInfo.tileTag.setInteger("y", pPos.getY());
            blockInfo.tileTag.setInteger("z", pPos.getZ());
            TileEntity tileEntity = world.getTileEntity(pPos);
            tileEntity.readFromNBT(blockInfo.tileTag);
            tileEntity.markDirty();
        }

        world.markAndNotifyBlock(pPos, world.getChunk(pPos), world.getBlockState(pPos), world.getBlockState(pPos), 1);
    }
}
