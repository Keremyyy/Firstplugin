package LuunkieKaasheer;

import org.bukkit.Bukkit;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;

import org.bukkit.entity.Player;

import static firstplugin.firstplugin.Firstplugin.kaasGod;


public class LuunkieBegroeting {

    public void begroet(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        if (player == Bukkit.getPlayer(kaasGod) ){
        Bukkit.getServer().broadcastMessage("Mensen Hier is de geweldige grootheid LUUNKIE KAASHEER");
    }
//        this does not work and the if statement has to be changed
//        change in luunkiecheck is needed

}
}