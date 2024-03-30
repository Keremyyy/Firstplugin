package LuunkieKaasheer;

import org.bukkit.Bukkit;

import org.bukkit.entity.Player;

import static firstplugin.firstplugin.Firstplugin.kaasGod;

public class LuunkieBegroeting {

    public void begroet() {

        Player player = Bukkit.getPlayer(kaasGod);
        if (player == Bukkit.getPlayer(kaasGod) ){
        Bukkit.getServer().broadcastMessage("Mensen Hier is de geweldige grootheid LUUNKIE KAASHEER");
    }
}
}