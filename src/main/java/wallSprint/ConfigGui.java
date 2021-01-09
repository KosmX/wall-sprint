package wallSprint;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import net.fabricmc.loader.api.FabricLoader;


public class ConfigGui implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        //if(FabricLoader.getInstance().isModLoaded("autoconfig1u") && FabricLoader.getInstance().isModLoaded("cloth-config2")){
        return ConfigLoader.getConfigScreen();

    }
}
