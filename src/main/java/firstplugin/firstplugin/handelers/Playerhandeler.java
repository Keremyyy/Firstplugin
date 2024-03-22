package firstplugin.firstplugin.handelers;

import firstplugin.firstplugin.Firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Playerhandeler implements Listener {
    public Playerhandeler(Firstplugin plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

            @EventHandler
                public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

                ItemStack item = new ItemStack(Material.ACACIA_PLANKS, 30);
                Inventory inv = player.getInventory();

                inv.addItem(item);
                inv.setItem(8, item);
            }

    }

