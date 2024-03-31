package LuunkieKaasheer;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static firstplugin.firstplugin.Firstplugin.kaasGod;

public class LuunkieSpreek {
// zeg ik, almachtige kaasheer luunkie

    public void luunkiePraat(AsyncPlayerChatEvent event, Player player) {
        if (player.getName().equals(kaasGod)){
            String originalMessage = event.getMessage();
            String modifiedMessage = originalMessage + "zeg ik, almachtige kaasheer luunkie.";
            event.setMessage(modifiedMessage);
        }
    }
}
