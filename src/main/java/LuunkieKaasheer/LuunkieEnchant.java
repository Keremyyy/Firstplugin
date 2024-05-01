package LuunkieKaasheer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


import static firstplugin.firstplugin.Firstplugin.kaasGod;


public class LuunkieEnchant {

    ItemStack enchantItem = new ItemStack(Material.DIAMOND_SWORD);


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
        if (player == Bukkit.getPlayer(kaasGod)) {
            Enchantment luunkieSharpness = Enchantment.DAMAGE_ALL;
            int sharpnessLevel = 255;
            enchantItem.addUnsafeEnchantment(luunkieSharpness, sharpnessLevel);
            player.updateInventory();

        }
    }

    public void luuntieItemDisenchant(){
        int enchantmentLevel = enchantItem.getEnchantmentLevel(Enchantment.DAMAGE_ALL);
        if (enchantmentLevel == 255) {
            enchantItem.removeEnchantment(Enchantment.DAMAGE_ALL);
        }
    }

}

