package de.falsedeveloping.falseArmor.Armor;

import static org.bukkit.Bukkit.getServer;

import de.falsedeveloping.falseArmor.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class EmeraldChestplate {

  private Main plugin;
  public EmeraldChestplate(Main plugin) {
    this.plugin = plugin;
  }

  public void addEmeraldChestplate() {
    ItemStack emeraldChestplate = getEmeraldChestplateItem();
    NamespacedKey key = new NamespacedKey(this.plugin, "emeraldchestplate");
    ShapedRecipe emeraldChestplateRecipe = new ShapedRecipe(key, emeraldChestplate);
    emeraldChestplateRecipe.shape("# #", "###", "###");
    emeraldChestplateRecipe.setIngredient('#', Material.EMERALD);
    getServer().addRecipe(emeraldChestplateRecipe);
  }

  public ItemStack getEmeraldChestplateItem() {
    ItemStack is = new ItemStack(Material.DIAMOND_CHESTPLATE);
    is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
    is.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
    ItemMeta meta = is.getItemMeta();
    meta.setDisplayName("§aEmerald Chestplate");
    is.setItemMeta(meta);
    return is;
  }

}
