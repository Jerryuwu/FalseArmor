package de.falsedeveloping.falseArmor.Armor.ArmorListeners;

import de.falsedeveloping.falseArmor.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class onEmeraldBootsWear implements Listener {

  private Main plugin;
  public onEmeraldBootsWear(Main plugin) {
    this.plugin = plugin;
  }
  @EventHandler
  public void onLEBWear(InventoryCloseEvent e) {
    if ((e.getInventory() instanceof PlayerInventory)) return;
    Player p = (Player) e.getPlayer();

    //Jumpboost removed from player
    ItemStack boots = p.getInventory().getBoots();
    if (boots == null || !(boots.getItemMeta().getDisplayName().equals("§aLight Emerald Boots"))) {
      p.removePotionEffect(PotionEffectType.JUMP);
      p.removePotionEffect(PotionEffectType.SPEED);
      return;
    }
    //Jumpboost added to player
    if (boots.getItemMeta().getDisplayName().equals("§aLight Emerald Boots")) {
      p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
      p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
    }
  }
  @EventHandler
  public void onLEBRightClick(PlayerInteractEvent e) {
    if (e.getItem() == null) return;
    if (!(e.getAction().equals(Action.RIGHT_CLICK_AIR)) && !(e.getAction().equals(Action.RIGHT_CLICK_BLOCK))) return;
    if (!e.getItem().getItemMeta().getDisplayName().equals("§aLight Emerald Boots")) return;
    Player p = e.getPlayer();
    if (p.getInventory().getBoots() != null) return;
    p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
  }
}
