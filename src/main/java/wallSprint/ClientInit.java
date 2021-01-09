package wallSprint;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import javax.annotation.Nullable;

public class ClientInit implements ClientModInitializer {

    public static ModConfigData config = null;

    @Override
    public void onInitializeClient() {
        if(FabricLoader.getInstance().isModLoaded("autoconfig1u")){
            config = ConfigLoader.loadConfig();
        }
        else config = () -> true;
    }
}
