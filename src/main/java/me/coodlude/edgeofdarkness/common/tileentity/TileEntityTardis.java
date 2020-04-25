package me.coodlude.edgeofdarkness.common.tileentity;

import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.network.packets.PacketDemat;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;

public class TileEntityTardis extends TileEntity implements ITickable {

    public int circuitID = 0;
    public float alpha = 0;
    public boolean isRemat = false, isDemat = false;

    public TileEntityTardis() {

    }

    @Override
    public void update() {

        if (isRemat || isDemat) {


            if (isRemat && alpha < 1) {
                alpha += 0.016f;
            } else if (isRemat) {
                isRemat = false;
            }

            if (isDemat && alpha > 0) {
                alpha -= 0.016f;
            } else if (isDemat) {
                isDemat = false;

                if (!world.isRemote) world.setBlockToAir(pos);
            }

            if(isRemat && isDemat) isDemat = false;
        }

    }

    public void setRemat(boolean remat) {
        isRemat = remat;
        world.playSound(null, pos, ModSounds.SHORT_REMAT, SoundCategory.BLOCKS, 1, 1);
        if(remat) sendDemat(false);
    }

    public void setDemat(boolean demat) {
        isDemat = demat;
        world.playSound(null, pos, ModSounds.DEMAT, SoundCategory.BLOCKS, 1, 1);
        if(demat) sendDemat(true);
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public void setAlphalevel(float alphaLevel) {
        this.alpha = alphaLevel;
    }

    public void switchDematState() {
        if(isRemat || isDemat) {
            if(isRemat) setDemat(true);
            else if(isDemat) setRemat(true);
        }
    }

    public void sendDemat(boolean isDemat) {
        if(!world.isRemote) {
            NetworkHandler.NETWORK.sendToAll(new PacketDemat(pos, isDemat));
        }
    }
}
