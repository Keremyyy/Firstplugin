package LuunkieKaasheer;

import org.bukkit.Bukkit;

import org.bukkit.Server;
import org.bukkit.entity.Player;

public class LuunkieBegroeting {

    public void begroet() {

        Player player = Bukkit.getPlayer("Keremy");
        if (player == Bukkit.getPlayer("Keremy") ){
        Bukkit.getServer().broadcastMessage("Mensen Hier is de geweldige grootheid LUUNKIE KAASHEER");
    }
}
}