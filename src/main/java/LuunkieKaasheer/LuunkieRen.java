package LuunkieKaasheer;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.checkerframework.checker.units.qual.Speed;

public class LuunkieRen {
Player luunkie;

    public LuunkieRen(Player luunkie) {
        this.luunkie = luunkie;
    }


    private void run (Player luunkie){
        if(luunkie.isSprinting()){
            luunkie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1, 10));
        }

    }

}
