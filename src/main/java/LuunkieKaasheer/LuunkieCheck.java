package LuunkieKaasheer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.block.Action;

public class LuunkieCheck implements Listener {

    LuunkieBegroeting luunkieBegroeting = new LuunkieBegroeting();
    LuunkieAanraak luunkieAanraak = new LuunkieAanraak();

    @EventHandler
//    public void onPlayerItemHeld(PlayerItemHeldEvent event) {
//        Material itemName = Material.valueOf(item.getType().name());
//        player.sendMessage(itemName);
//        LuunkieDia luunkieEnchant = new LuunkieDia(event);
//        luunkieEnchant.geefDia();
//    }


    public void onPlayerItemHeld(PlayerItemHeldEvent event) {

        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItem(event.getNewSlot());
        LuunkieEnchant luunkieEnchant = new LuunkieEnchant(item);

        luunkieEnchant.luunkieItemEnchant(player);
    }


    @EventHandler
    public void onLuunkiejoin(PlayerJoinEvent event) {

        luunkieBegroeting.begroet();
    }

    public void sendCenteredMessage(Player player, String message) {
        int messageLength = message.length();
        int screenWidth = 320; // Assuming a standard Minecraft screen width
        int spaces = (screenWidth - messageLength) / 2;
        String centeredMessage = String.format("%" + spaces + "s%s", "", message);
        player.sendMessage(centeredMessage);
    }

    @EventHandler
//    public void testenMaar(PlayerInteractEntityEvent event) {
//        Player player = event.getPlayer();
//        if (event.getRightClicked() instanceof Player) {
//            Player clickedPlayer = (Player) event.getRightClicked();
//            // Check if it's a right-click
//            Bukkit.getServer().broadcastMessage("er is iemand geklikt");
//                // Do something with the player who right-clicked and the player who was right-clicked
//                player.sendMessage("You right-clicked " + clickedPlayer.getName());
//                sendCenteredMessage(player, ChatColor.LIGHT_PURPLE + "Hello");
//            }
//        }
    public void displayHello(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (player == Bukkit.getPlayer("Keremy")) {
            luunkieAanraak.aanraak();


        }
    }
}


