package me.usti.teamhead;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Event implements Listener {
    @EventHandler
    public void Team(EntityDamageByEntityEvent event){
        if (event.getDamager() instanceof Player && event.getEntity() instanceof Player){
            Player damager = (Player) event.getDamager();
            Player player = (Player) event.getEntity();
            ItemStack helmetplayer = player.getEquipment().getHelmet();
            ItemStack helmetdamager = damager.getEquipment().getHelmet();
            if (helmetdamager.getType() == Material.LEATHER_HELMET && helmetplayer.getType() == Material.LEATHER_HELMET) {
                LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) helmetplayer.getItemMeta();
                LeatherArmorMeta leatherArmorMetadamager = (LeatherArmorMeta) helmetdamager.getItemMeta();
                int playercolor = leatherArmorMeta.getColor().hashCode();
                int damagercolor = leatherArmorMetadamager.getColor().hashCode();
                if (playercolor == damagercolor){
                    event.setCancelled(true);
                }

            }
        }
    }
}
