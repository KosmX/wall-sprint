package wallSprint;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;

public class ConfigLoader {
    public static ModConfig loadConfig() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    public static ConfigScreenFactory<?> getConfigScreen(){
        return parent -> AutoConfig.getConfigScreen(ModConfig.class, parent).get();
    }
}
