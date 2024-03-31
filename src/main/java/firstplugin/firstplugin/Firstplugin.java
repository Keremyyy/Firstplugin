package firstplugin.firstplugin;

import LuunkieKaasheer.LuunkieCheck; // Add this line
import LuunkieKaasheer.LuunkieMoord;
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

public final class Firstplugin extends JavaPlugin implements Listener {

    public static String kaasGod = "Keremyy";



    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("goedemorgen");

        getServer().getPluginManager().registerEvents(new LuunkieCheck(), this);
        getServer().getPluginManager().registerEvents(this, this);





        new Torchhandeler(this);
        new Playerhandeler(this);


        getCommand("vlieg").setExecutor(new vlieg());
        getCommand("menu").setExecutor(new Menu());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("opgerot");
    }

    @EventHandler
    public void onPlayerSneak(PlayerInteractEvent event) {
        // Check if the player is sneaking and pressed "L"
        if (event.getPlayer().isSneaking() && event.getAction().toString().contains("RIGHT_CLICK")
        ) {
            // Perform some action when the hotkey is triggered
            event.getPlayer().sendMessage("You pressed the hotkey!");
            // Add your desired action here
        }
    }


}
