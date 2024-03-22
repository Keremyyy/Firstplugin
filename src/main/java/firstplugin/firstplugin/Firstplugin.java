package firstplugin.firstplugin;

import LuunkieKaasheer.LuunkieEnchant;
import LuunkieKaasheer.LuunkieCheck; // Add this line
import firstplugin.firstplugin.commands.Menu;
import firstplugin.firstplugin.commands.vlieg;
import firstplugin.firstplugin.handelers.Playerhandeler;
import firstplugin.firstplugin.handelers.Torchhandeler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.event.ItemListener;

public final class Firstplugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("goedemorgen");

        getServer().getPluginManager().registerEvents(new LuunkieCheck(), this);





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


}
