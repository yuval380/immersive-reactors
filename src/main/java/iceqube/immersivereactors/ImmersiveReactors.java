package iceqube.immersivereactors;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static net.minecraftforge.fml.common.Mod.*;

@Mod(
        modid = ImmersiveReactors.MOD_ID,
        name = ImmersiveReactors.MOD_NAME,
        version = ImmersiveReactors.VERSION,
        dependencies = "required-after:immersiveengineering@[0.12,);")

public class ImmersiveReactors {

    public static final String MOD_ID = "immersivereactors";
    public static final String MOD_NAME = "Immersive Reactors";
    public static final String VERSION = "@VERSION@";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }
}