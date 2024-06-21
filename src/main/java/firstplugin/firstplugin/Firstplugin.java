package firstplugin.firstplugin;

import LuunkieKaasheer.LuunkieCheck;
import LuunkieKaasheer.LuunkieMoord;
import firstplugin.firstplugin.Item.Pokeflute;
import firstplugin.firstplugin.commands.Menu;
import firstplugin.firstplugin.commands.vlieg;
import firstplugin.firstplugin.handelers.Playerhandeler;
import firstplugin.firstplugin.handelers.Torchhandeler;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;
//import firstplugin.firstplugin.Item.Itemmanager;


public final class Firstplugin extends JavaPlugin implements Listener {

    public static String kaasGod = "Keremyy";

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("goedemorgen");

        // Initialize your items
//        Itemmanager.init();

        // Register event listeners
        getServer().getPluginManager().registerEvents(new LuunkieCheck(), this);
        getServer().getPluginManager().registerEvents(new Pokeflute(), this);
        getServer().getPluginManager().registerEvents(this, this);

        // Initialize your handlers
        new Torchhandeler(this);
        new Playerhandeler(this);

        // Register commands
        getCommand("vlieg").setExecutor(new vlieg());
        getCommand("menu").setExecutor(new Menu());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("opgerot");
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
    }

    @EventHandler
    public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
    }
}
