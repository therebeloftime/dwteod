package me.coodlude.edgeofdarkness;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.coodlude.edgeofdarkness.common.capability.CapTardisStorage;
import me.coodlude.edgeofdarkness.common.capability.CapabilityTardis;
import me.coodlude.edgeofdarkness.common.capability.ITardisCapability;
import me.coodlude.edgeofdarkness.common.commands.CommandCreateSchematic;
import me.coodlude.edgeofdarkness.common.commands.CommandPasteSchematic;
import me.coodlude.edgeofdarkness.common.commands.CommandTest;
import me.coodlude.edgeofdarkness.common.init.*;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
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
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@Mod(modid = EdgeOfDarkness.MODID, name = EdgeOfDarkness.NAME, version = EdgeOfDarkness.VERSION)
public class EdgeOfDarkness {

    @Mod.Instance
    public static EdgeOfDarkness instance;

    @SidedProxy(clientSide = "me.coodlude.edgeofdarkness.proxy.ClientProxy", serverSide = "me.coodlude.edgeofdarkness.proxy.ServerProxy")
    public static IProxy proxy;

    private static Logger logger;
    public static Gson JSON = new GsonBuilder().setPrettyPrinting().create();

    public static final String MODID = "edgeofdarkness";
    public static final String NAME = "DoctorWho:TheEdgeOfDarkness";
    public static final String VERSION = "1.0.3";

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
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new ModGuiHandler());
    }

    @EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandCreateSchematic());
        event.registerServerCommand(new CommandPasteSchematic());
        event.registerServerCommand(new CommandTest());
        SchematicUtil.queue.clear();
        TardisHandler.loadTardisses();
    }

    @EventHandler
    public void onServerStopping(FMLServerStoppingEvent event) {
        if(TardisHandler.tardises.size() > 0) {
            for(Map.Entry<Integer, TardisInfo> infoEntry : TardisHandler.tardises.entrySet()) {
                TardisHandler.saveTardis(infoEntry.getKey());
            }
        }
    }
}
