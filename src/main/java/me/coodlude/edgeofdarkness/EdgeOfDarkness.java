package me.coodlude.edgeofdarkness;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.CapabilityTardis;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.commands.CommandCreateSchematic;
import me.coodlude.edgeofdarkness.common.commands.CommandPasteSchematic;
import me.coodlude.edgeofdarkness.common.commands.CommandTest;
import me.coodlude.edgeofdarkness.common.init.ModDimension;
import me.coodlude.edgeofdarkness.common.init.ModItems;
import me.coodlude.edgeofdarkness.common.init.ModSchematics;
import me.coodlude.edgeofdarkness.common.init.ModSounds;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisSkinRegistry;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.proxy.IProxy;
import me.coodlude.edgeofdarkness.util.helper.schematics.SchematicUtil;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = EdgeOfDarkness.MODID, name = EdgeOfDarkness.NAME, version = EdgeOfDarkness.VERSION)
public class EdgeOfDarkness {

    @Mod.Instance
    public static EdgeOfDarkness instance;

    @SidedProxy(clientSide = "me.coodlude.edgeofdarkness.proxy.ClientProxy", serverSide = "me.coodlude.edgeofdarkness.proxy.ServerProxy")
    public static IProxy proxy;

    private static Logger logger;
    public static Gson JSON = new GsonBuilder().setPrettyPrinting().create();

    public static final String MODID = "edgeofdarkness";
    public static final String NAME = "EdgeOfDarkness";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
        logger = event.getModLog();
        NetworkHandler.init();
        ModSounds.registerSounds();
        ModItems.init();
        ModSchematics.init();
        TardisSkinRegistry.init();
        CapabilityManager.INSTANCE.register(ITardisCapability.class, new CapTardisStorage(), CapabilityTardis::new);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        ModDimension.Register();
    }

    @EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandCreateSchematic());
        event.registerServerCommand(new CommandPasteSchematic());
        event.registerServerCommand(new CommandTest());
        SchematicUtil.queue.clear();
        TardisHandler.loadTardisses();
    }
}
