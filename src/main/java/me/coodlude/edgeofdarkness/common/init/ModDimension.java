package me.coodlude.edgeofdarkness.common.init;

import me.coodlude.edgeofdarkness.common.world.dimension.WorldProviderTardis;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimension {

    public static int TARDISID;
    public static DimensionType Type;

    public static void Register() {
        TARDISID = DimensionManager.getNextFreeDimId();
        Type = DimensionType.register("tardis", "_tardis", TARDISID, WorldProviderTardis.class, true);
        DimensionManager.registerDimension(TARDISID, Type);
    }
}
