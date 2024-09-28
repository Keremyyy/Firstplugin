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


    public void run (){
        float rensnelhied = 0.5f;
        luunkie.setWalkSpeed(rensnelhied);

        }

    }

