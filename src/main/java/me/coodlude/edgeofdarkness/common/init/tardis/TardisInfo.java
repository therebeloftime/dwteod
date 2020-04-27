package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.common.init.ModBlocks;
import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.common.tileentity.TileEntityTardis;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TardisInfo {

    public int tardisID;

    public BlockPos extereriorPos = BlockPos.ORIGIN;
    public int exteriorDim = 0;
    public transient List<UUID> playersInside = new ArrayList<>();

    public BlockPos destinationPos = BlockPos.ORIGIN;
    public int destinationDim = 0;

    public BlockPos interiorPos = BlockPos.ORIGIN;
    public float interiorSpawnRotation = 0;

    public boolean locked = false;
    public boolean inFlight = false;
    public int travelTime = 0;


    public void setTardisID(int tardisID) {
        this.tardisID = tardisID;
    }

    public int getTardisID() {
        return tardisID;
    }

    public void setExtereriorPos(BlockPos extereriorPos) {
        this.extereriorPos = extereriorPos;
    }

    public BlockPos getExtereriorPos() {
        return extereriorPos;
    }

    public void setExteriorDim(int exteriorDim) {
        this.exteriorDim = exteriorDim;
    }

    public int getExteriorDim() {
        return exteriorDim;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setInteriorPos(BlockPos interiorPos) {
        this.interiorPos = interiorPos;
    }

    public BlockPos getInteriorPos() {
        return interiorPos;
    }

    public void setInteriorSpawnRotation(float interiorSpawnRotation) {
        this.interiorSpawnRotation = interiorSpawnRotation;
    }

    public float getInteriorSpawnRotation() {
        return interiorSpawnRotation;
    }

    public void setDestinationDim(int destinationDim) {
        this.destinationDim = destinationDim;
    }

    public void setDestinationPos(BlockPos destinationPos) {
        this.destinationPos = destinationPos;
    }

    public BlockPos getDestinationPos() {
        return destinationPos;
    }

    public int getDestinationDim() {
        return destinationDim;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setInFlight(boolean inFlight) {
        this.inFlight = inFlight;
    }

    public boolean isInFlight() {
        return inFlight;
    }

    public List<UUID> getPlayersInside() {
        return playersInside;
    }

    public void addPlayerInside(UUID uuid) {
        if (!playersInside.contains(uuid)) {
            playersInside.add(uuid);
        }
    }

    public void removePlayerInside(UUID uuid) {
        if (playersInside.contains(uuid)) {
            playersInside.remove(uuid);
        }
    }

    public void land() {
        for (UUID uuid : playersInside) {
            EntityPlayer player = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayerByUUID(uuid);

            if (player instanceof EntityPlayerMP) {
                player.sendStatusMessage(new TextComponentString(TextFormatting.GREEN + new TextComponentTranslation( "msg.tardis.landing").getFormattedText()), true);
                ((EntityPlayerMP) player).connection.sendPacket(new SPacketSoundEffect(ModSounds.SHORT_REMAT, SoundCategory.BLOCKS, player.posX, player.posY, player.posZ, 1, 1));
            }
        }
    }

    public void flightUpdate() {

        if (inFlight) {
            if (travelTime > 0) {
                travelTime--;
            }

            if (travelTime <= 80) {
                World destination = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(destinationDim);

                if (travelTime == 80) {
                    destination.setBlockToAir(destinationPos);
                    destination.setBlockState(destinationPos, ModBlocks.tardis.getDefaultState());
                    setExtereriorPos(destinationPos);
                    setExteriorDim(destinationDim);
                }

                TileEntity tileEntity = destination.getTileEntity(destinationPos);

                if (tileEntity != null && tileEntity instanceof TileEntityTardis) {
                    if (travelTime == 60) {
                        ((TileEntityTardis) tileEntity).setTardisID(tardisID);
                        ((TileEntityTardis) tileEntity).setRemat(true);
                        land();
                    }
                }
            }

            if (travelTime <= 0) {
                travelTime = 0;
                inFlight = false;
            }
        }
    }

}
