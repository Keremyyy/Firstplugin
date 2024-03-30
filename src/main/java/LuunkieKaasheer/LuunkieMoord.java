package LuunkieKaasheer;

import org.bukkit.event.entity.PlayerDeathEvent;

import static firstplugin.firstplugin.Firstplugin.kaasGod;

public class LuunkieMoord {


    public void vermoordDoorLuunkie (PlayerDeathEvent event) {
        String deathMessage = event.getDeathMessage();
        String killerName = event.getEntity().getKiller().getName();
        // Check if the death was caused by a player
        if (event.getEntity().getKiller() != null && killerName.equals(kaasGod)){

            deathMessage = event.getEntity().getName() + " heeft een poepje van onze god op het hooft gekregen";
        }
        event.setDeathMessage(deathMessage);
    }
}