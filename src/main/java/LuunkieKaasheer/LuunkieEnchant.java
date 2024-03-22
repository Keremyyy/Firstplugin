package LuunkieKaasheer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class LuunkieEnchant {

    ItemStack enchantItem = new ItemStack(Material.DIAMOND_SWORD);
    private Material maat;


    public LuunkieEnchant(ItemStack enchantItem) {
    this.enchantItem = enchantItem;
    }

    public void luunkieItemEnchant(Player player) {
//        ItemStack wapen = new ItemStack(enchantItem);

//        Enchantment luunkieSharpness = Enchantment.DAMAGE_ALL;
//        int sharpnessLevel = 255;
//        enchantItem.addUnsafeEnchantment(luunkieSharpness, sharpnessLevel);
//
//        player.getInventory().setItemInHand(enchantItem);
//        player.updateInventory();
        if (player == Bukkit.getPlayer("Keremy")) {
            Enchantment luunkieSharpness = Enchantment.DAMAGE_ALL;
            int sharpnessLevel = 255;
            enchantItem.addUnsafeEnchantment(luunkieSharpness, sharpnessLevel);
            player.updateInventory();


        }
    }
}

