package deanteegarden.emergentcities;

import deanteegarden.emergentcities.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = EmergentCities.MODID, name = EmergentCities.MODNAME, version = EmergentCities.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class EmergentCities {

    public static final String MODID = "emergentcities";
    public static final String MODNAME = "Emergent Cities";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "deanteegarden.emergentcities.proxy.ClientProxy", serverSide = "deanteegarden.emergentcities.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static EmergentCities instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


    public static CreativeTabs creativeTab = new CreativeTabs("EmergentCities") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.blockFastFurnace);
        }
    };
}