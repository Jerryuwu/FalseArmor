package de.falsedeveloping.falseArmor.Ingredients;

import static org.bukkit.Bukkit.getServer;

import de.falsedeveloping.falseArmor.Main;
import de.falsedeveloping.falseArmor.misc.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class EmeraldFeather {

  private Main plugin;
  public EmeraldFeather(Main plugin) {
    this.plugin = plugin;
  }
  public void addEmeraldFeather() {
    ItemStack emeraldFeather = getEmeraldFeatherItem();
    NamespacedKey key = new NamespacedKey(this.plugin, "emeraldfeather");
    ShapedRecipe emeraldFeatherRecipe = new ShapedRecipe(key, emeraldFeather);
    emeraldFeatherRecipe.shape(" * ", "*#*", " * ");
    emeraldFeatherRecipe.setIngredient('#', Material.FEATHER);
    emeraldFeatherRecipe.setIngredient('*', Material.EMERALD_BLOCK);
    getServer().addRecipe(emeraldFeatherRecipe);
  }

  public ItemStack getEmeraldFeatherItem() {
    return ItemStackBuilder.of(Material.FEATHER).enchant(Enchantment.DURABILITY, 1).name("§aEmerald Feather").build();
  }

}
