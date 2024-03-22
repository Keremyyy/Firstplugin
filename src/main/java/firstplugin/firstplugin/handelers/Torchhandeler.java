package firstplugin.firstplugin.handelers;

import firstplugin.firstplugin.Firstplugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class Torchhandeler implements Listener {
    public Torchhandeler(Firstplugin plugin){
    Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTorchplace_low(BlockPlaceEvent event){
    if (event.getBlock().getType() == Material.TORCH){
        event.getBlock().setType(Material.DIAMOND_BLOCK);
    }

    }


    @EventHandler
    public void onTorchPlace(BlockPlaceEvent event){
        Block block = event.getBlock();

        if(block.getType() != Material.TORCH){
            return;
        }
        Bukkit.getServer().broadcastMessage("vuuren gek");
    }


}