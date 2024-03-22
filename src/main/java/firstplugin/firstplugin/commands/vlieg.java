package firstplugin.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class vlieg implements CommandExecutor {

//    LuunkieDia dialuuk = new  LuunkieDia(Material.DIAMOND_SWORD);
//    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("jij bent geen mens");
        }

        Player player = (Player) sender;

        // Call the geefDia() method on the LuunkieDia instance
//        dialuuk.geefDia();



//    if (player.getAllowFlight() == false) {
//        player.setAllowFlight(true);
//    }
//    else{
//        player.setAllowFlight(false);
//    }


        return true;
    }
}
