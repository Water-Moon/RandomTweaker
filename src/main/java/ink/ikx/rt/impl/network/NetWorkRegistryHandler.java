package ink.ikx.rt.impl.network;

import ink.ikx.rt.RandomTweaker;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class NetWorkRegistryHandler {

    public static void register() {
        NetworkRegistry.INSTANCE.registerGuiHandler(RandomTweaker.MODID, new RTGuiHandler());
    }
}
