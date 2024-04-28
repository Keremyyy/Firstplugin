package firstplugin.firstplugin.Item;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;


public class Pokeflute implements Listener {


    public static void init() {
        maakFluit();
    }


    private static void maakFluit(){
        ItemStack pokeflute = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = pokeflute.getItemMeta();
        meta.setDisplayName("Pokeflute");
        List<String> lore = new ArrayList<>();
        lore.add("Use this to wake up sleeping pokemon");
        meta.setLore(lore);
        pokeflute.setItemMeta(meta);
        pokeflute = pokeflute;




    }



    @EventHandler
    public void useFlute(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand(); // Getting the item the player is holding

        if (item.getType() == Material.PAPER && event.getRightClicked() instanceof Player) {
            Player clickedPlayer = (Player) event.getRightClicked();
            player.sendMessage("You have used the pokeflute.");
            clickedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2400, 4));
            clickedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 4));
        }
    }
}
