package dog.comedy.cosmetictest;

import com.hibiscusmc.hmccosmetics.api.HMCCosmeticsAPI;
import com.hibiscusmc.hmccosmetics.user.CosmeticUser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.List;

import static org.bukkit.Bukkit.getPluginManager;

public class MyListener implements Listener {
    @EventHandler
    public void OnInput(PlayerMoveEvent event) {
        if(getPluginManager().isPluginEnabled("HMCCosmetics")) {
            List<CosmeticUser> users = HMCCosmeticsAPI.getAllCosmeticUsers();
            Cosmetictest.logger.info("CosmeticUsers: " + users.size());
        }
        else {
            Cosmetictest.logger.info("HMCCosmetics not enabled");
        }
    }
}
