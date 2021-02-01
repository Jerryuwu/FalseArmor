package de.falsedeveloping.falseArmor.Armor;

import static org.bukkit.Bukkit.getServer;

import de.falsedeveloping.falseArmor.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class EmeraldHelmet {

  private Main plugin;
  public EmeraldHelmet(Main plugin) {
    this.plugin = plugin;
  }

  public void addEmeraldHelmet() {
    ItemStack emeraldHelmet = getEmeraldHelmetItem();
    NamespacedKey key = new NamespacedKey(this.plugin, "emeraldhelmet");
    ShapedRecipe emeraldHelmetRecipe = new ShapedRecipe(key, emeraldHelmet);
    emeraldHelmetRecipe.shape("###", "# #", "   ");
    emeraldHelmetRecipe.setIngredient('#', Material.EMERALD);
    getServer().addRecipe(emeraldHelmetRecipe);

    ItemStack emeraldHelmet2 = getEmeraldHelmetItem();
    NamespacedKey key2 = new NamespacedKey(this.plugin, "emeraldhelmet2");
    ShapedRecipe emeraldHelmetRecipe2 = new ShapedRecipe(key2, emeraldHelmet2);
    emeraldHelmetRecipe2.shape("   ", "###", "# #");
    emeraldHelmetRecipe2.setIngredient('#', Material.EMERALD);
    getServer().addRecipe(emeraldHelmetRecipe2);
  }

  public ItemStack getEmeraldHelmetItem() {
    ItemStack is = new ItemStack(Material.DIAMOND_HELMET);
    is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
    is.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
    ItemMeta meta = is.getItemMeta();
    meta.setDisplayName("§aEmerald Helmet");
    is.setItemMeta(meta);
    return is;
  }

}
