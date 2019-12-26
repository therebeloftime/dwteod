package me.coodlude.edgeofdarkness;

import me.coodlude.edgeofdarkness.common.items.ModItems;
import me.coodlude.edgeofdarkness.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = EdgeOfDarkness.MODID, name = EdgeOfDarkness.NAME, version = EdgeOfDarkness.VERSION)
public class EdgeOfDarkness
{
    @Mod.Instance
    public static EdgeOfDarkness instance;

    @SidedProxy(clientSide = "me.coodlude.edgeofdarkness.proxy.ClientProxy", serverSide = "me.coodlude.edgeofdarkness.proxy.ServerProxy")
    public static IProxy proxy;

    private static Logger logger;

    public static final String MODID = "edgeofdarkness";
    public static final String NAME = "EdgeOfDarkness";
    public static final String VERSION = "0.0.1";


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModItems.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
