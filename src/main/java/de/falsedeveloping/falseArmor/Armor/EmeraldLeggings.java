package de.falsedeveloping.falseArmor.Armor;

import static org.bukkit.Bukkit.getServer;
import de.falsedeveloping.falseArmor.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class EmeraldLeggings {

  private Main plugin;
  public EmeraldLeggings(Main plugin) {
    this.plugin = plugin;
  }

  public void addEmeraldLeggings() {
    ItemStack emeraldLeggings = getEmeraldLeggingsItem();
    NamespacedKey key = new NamespacedKey(this.plugin, "emeraldleggings");
    ShapedRecipe emeraldLeggingsRecipe = new ShapedRecipe(key, emeraldLeggings);
    emeraldLeggingsRecipe.shape("###", "# #", "# #");
    emeraldLeggingsRecipe.setIngredient('#', Material.EMERALD);
    getServer().addRecipe(emeraldLeggingsRecipe);
  }

  public ItemStack getEmeraldLeggingsItem() {
    ItemStack is = new ItemStack(Material.DIAMOND_LEGGINGS);
    is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
    is.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
    ItemMeta meta = is.getItemMeta();
    meta.setDisplayName("§aEmerald Leggings");
    is.setItemMeta(meta);
    return is;
  }
}

