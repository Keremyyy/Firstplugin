package LuunkieKaasheer;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LuunkieAanraak {



    public void aanraak(Player player, org.bukkit.event.player.PlayerInteractEntityEvent event) {
        String message = ChatColor.GREEN + "heeft u gezegend met de kracht van Luunkie Kaasheer, moge hij u zegenen en beschermen tegen het kwade";
        Player clickedPlayer = (Player) event.getRightClicked();
        clickedPlayer.sendTitle(player.getName(), message, 10, 70, 20);
        clickedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 2400, 4));
        clickedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 4));
        clickedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 6000, 0));
        clickedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 6000, 0));
        clickedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 6000, 9));
    }

}