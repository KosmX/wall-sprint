package wallSprint;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "wall-sprint")
public class ModConfig implements ConfigData, ModConfigData{
    boolean enabled = true;

    @Override
    public boolean enabled() {
        return enabled;
    }
}
