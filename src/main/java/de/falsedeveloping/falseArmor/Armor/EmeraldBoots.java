package de.falsedeveloping.falseArmor.Armor;

import static org.bukkit.Bukkit.getServer;

import de.falsedeveloping.falseArmor.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class EmeraldBoots {

  private Main plugin;
  public EmeraldBoots(Main plugin) {
    this.plugin = plugin;
  }
  public void addEmeralBoots() {
    ItemStack emeraldBoots = getEmeraldBootsItem();
    NamespacedKey key = new NamespacedKey(this.plugin, "emeraldBoots");
    ShapedRecipe emeraldBootsRecipe = new ShapedRecipe(key, emeraldBoots);
    emeraldBootsRecipe.shape("# #", "# #", "   ");
    emeraldBootsRecipe.setIngredient('#', Material.EMERALD);
    getServer().addRecipe(emeraldBootsRecipe);

    ItemStack emeraldBoots2 = getEmeraldBootsItem();
    NamespacedKey key2 = new NamespacedKey(this.plugin, "emeraldBoots2");
    ShapedRecipe emeraldBootsRecipe2 = new ShapedRecipe(key2, emeraldBoots2);
    emeraldBootsRecipe2.shape("   ", "# #", "# #");
    emeraldBootsRecipe2.setIngredient('#', Material.EMERALD);
    getServer().addRecipe(emeraldBootsRecipe2);
  }

  public ItemStack getEmeraldBootsItem() {
    ItemStack is = new ItemStack(Material.DIAMOND_BOOTS);
    is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
    is.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
    ItemMeta meta = is.getItemMeta();
    meta.setDisplayName("§aEmerald Boots");
    is.setItemMeta(meta);
    return is;
  }
}
