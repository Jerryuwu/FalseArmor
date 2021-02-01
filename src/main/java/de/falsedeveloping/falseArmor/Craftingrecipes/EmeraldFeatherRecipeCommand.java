package de.falsedeveloping.falseArmor.Craftingrecipes;

import de.falsedeveloping.falseArmor.Ingredients.EmeraldFeather;
import de.falsedeveloping.falseArmor.Main;
import de.falsedeveloping.falseArmor.misc.ItemStackBuilder;
import java.util.Locale;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EmeraldFeatherRecipeCommand implements CommandExecutor {

  private Main plugin;
  public EmeraldFeatherRecipeCommand(Main plugin) {
    this.plugin = plugin;
  }

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!(sender instanceof Player)) {
      System.out.println("Dieser Befehl ist Spielern vorbehalten!");
      return true;
    }
    Inventory i = Bukkit.createInventory(null, 3 * 9, "Rezept:");
    Player p = (Player) sender;
    ItemStack glass = ItemStackBuilder.of(Material.BLACK_STAINED_GLASS_PANE).build();
    for(int i2 = 0; i2 < i.getSize(); i2++) {
      i.setItem(i2, glass);
    }
    //Ingredients
    ItemStack ing1;
    ItemStack ing2;
    ItemStack ing3;
    ItemStack ing4;
    ItemStack ing5;

    if (args[0].equalsIgnoreCase("emeraldfeather")) {
      ing1 = ItemStackBuilder.of(Material.AIR).build();
      ing2 = ItemStackBuilder.of(Material.EMERALD_BLOCK).build();
      ing3 = ItemStackBuilder.of(Material.FEATHER).build();
      ing4 = plugin.getEmeraldFeather().getEmeraldFeatherItem();
      i.setItem(3, ing1);
      i.setItem(5, ing1);
      i.setItem(21, ing1);
      i.setItem(23, ing1);
      i.setItem(4, ing2);
      i.setItem(12, ing2);
      i.setItem(14, ing2);
      i.setItem(22, ing2);
      i.setItem(13, ing3);
      i.setItem(10, ing4);
      i.setItem(16, ing4);
    }
    p.openInventory(i);

    return true;
  }
}
