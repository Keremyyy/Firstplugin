package LuunkieKaasheer;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class LuunkieMode {
    // plugin die luuk allemaal powers geeft
    // dit gebeurt als luunkie op een een specifieke toets op zijn toetsenbordt drukt

    private boolean isLuunkieMode = false;

    public void setLuunkieMode(PlayerInteractEvent event) {
        isLuunkieMode = !isLuunkieMode;
        if (isLuunkieMode == true) {
            event.getPlayer().sendMessage("LUUNKIE IS VANAF NU EEN DING ALL HEIL LUUNKIE!");
        } else {
            event.getPlayer().sendMessage("Luunkie mode staat uit..... jeez saai zeg ga lekker mensen laten exploderen ofzo");
        }
    }


    public void luunkieExplosie(EntityExplodeEvent event) {
        if (isLuunkieMode == true){


            Location explosionLocation = event.getLocation();
            for (int i = 0; i < 10; i++) { // Adjust the number of points along the ray as needed
                double offsetX = i * 0.2; // Adjust the spacing between points along the ray
                Location rayPoint = explosionLocation.clone().add(new Vector(offsetX, 0, 0));
                explosionLocation.getWorld().spawnParticle(Particle.FLAME, rayPoint, 1);
        }
        }
    }
}