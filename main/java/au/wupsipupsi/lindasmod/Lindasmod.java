package au.wupsipupsi.lindasmod;

import au.wupsipupsi.lindasmod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static au.wupsipupsi.lindasmod.LindasmodConstants.*;


@Mod(
        modid = MOD_ID,
        name = MOD_NAME,
        version = VERSION
)
public class Lindasmod {

    @Mod.Instance(MOD_ID)
    private static Lindasmod INSTANCE;

    public static Lindasmod getINSTANCE() {
        return INSTANCE;
    }
    @SidedProxy(clientSide = "au.wupsipupsi.lindasmod.proxy.ClientProxy", serverSide = "au.wupsipupsi.lindasmod.proxy.CommonProxy")
    private static CommonProxy proxy;

    public static CommonProxy getProxy() {
        return proxy;
    }

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preinit(event);
    }

    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    public void postinit(FMLPostInitializationEvent event) {
        proxy.postinit(event);
    }
}
