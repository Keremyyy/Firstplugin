package LuunkieKaasheer;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class LuunkieMode {
    // plugin die luuk allemaal powers geeft
    // dit gebeurt als luunkie op een een specifieke toets op zijn toetsenbordt drukt

    private boolean isLuunkieMode = true;

    public void setLuunkieMode(PlayerInteractEvent event) {
        isLuunkieMode = !isLuunkieMode;
        if (isLuunkieMode == true) {
            event.getPlayer().sendMessage("LUUNKIE IS VANAF NU EEN DING ALL HEIL LUUNKIE!");
        } else if (isLuunkieMode == false) {
            event.getPlayer().sendMessage("Luunkie mode staat uit..... jeez saai zeg ga lekker mensen laten exploderen ofzo");
        }
    }


    public void luunkieExplosie(Location location, Vector direction) {
        if (isLuunkieMode == true) {
            World world = location.getWorld();

            Fireball fireball = (Fireball) world.spawnEntity(location, EntityType.FIREBALL);

            fireball.setDirection(direction);

            fireball.setYield(5.0f);
        }
    }
}

