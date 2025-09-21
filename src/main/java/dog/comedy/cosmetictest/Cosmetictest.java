package dog.comedy.cosmetictest;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Cosmetictest extends JavaPlugin {
    public static Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
}
