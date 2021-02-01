package de.falsedeveloping.falseArmor.Armor.ModifiedArmor;

import static org.bukkit.Bukkit.getServer;

import de.falsedeveloping.falseArmor.Main;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class LightEmeraldBoots {

  private Main plugin;
  public LightEmeraldBoots(Main plugin) {
    this.plugin = plugin;
  }

  public void addLightEmeraldBoots() {
    ItemStack boots = getLightEmeraldBootsItem();
    NamespacedKey key = new NamespacedKey(this.plugin, "lightemeraldboots");
    ShapedRecipe bootsrecipe = new ShapedRecipe(key, boots);
    bootsrecipe.shape("   ", " #*", "   ");
    ItemStack is1 = plugin.getEmeraldBoots().getEmeraldBootsItem();
    ItemStack is2 = plugin.getEmeraldFeather().getEmeraldFeatherItem();
    bootsrecipe.setIngredient('#', is1);
    bootsrecipe.setIngredient('*', is2);
    getServer().addRecipe(bootsrecipe);
    //TODO: ADD MORE WAYS TO CRAFT!!!
  }

  public ItemStack getLightEmeraldBootsItem() {
    ItemStack is = new ItemStack(Material.DIAMOND_BOOTS);
    is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
    is.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
    ItemMeta meta = is.getItemMeta();
    meta.setDisplayName("§aLight Emerald Boots");
    List<String> loreList = new ArrayList<>();
    loreList.add("Gives you Speed II");
    loreList.add("Gives you Jumpboost II");
    meta.setLore(loreList);
    is.setItemMeta(meta);
    return is;
  }

}
