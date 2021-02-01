package de.falsedeveloping.falseArmor;

import de.falsedeveloping.falseArmor.Armor.ArmorListeners.onEmeraldBootsWear;
import de.falsedeveloping.falseArmor.Armor.EmeraldBoots;
import de.falsedeveloping.falseArmor.Armor.EmeraldChestplate;
import de.falsedeveloping.falseArmor.Armor.EmeraldHelmet;
import de.falsedeveloping.falseArmor.Armor.EmeraldLeggings;
import de.falsedeveloping.falseArmor.Armor.ModifiedArmor.LightEmeraldBoots;
import de.falsedeveloping.falseArmor.Craftingrecipes.EmeraldFeatherRecipeCommand;
import de.falsedeveloping.falseArmor.Craftingrecipes.RecipeClickListener;
import de.falsedeveloping.falseArmor.Craftingrecipes.RecipesCommand;
import de.falsedeveloping.falseArmor.Ingredients.EmeraldFeather;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  private EmeraldFeather emeraldFeather;
  private EmeraldBoots emeraldBoots;
  private EmeraldLeggings emeraldLeggings;
  private EmeraldChestplate emeraldChestplate;
  private EmeraldHelmet emeraldHelmet;
  private LightEmeraldBoots lightEmeraldBoots;

  public void onEnable() {
    PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(new onEmeraldBootsWear(this), this);
    pm.registerEvents(new RecipeClickListener(), this);
    getCommand("frecipe").setExecutor(new EmeraldFeatherRecipeCommand(this));
    getCommand("frecipes").setExecutor(new RecipesCommand());

    emeraldFeather = new EmeraldFeather(this);
    emeraldBoots = new EmeraldBoots(this);
    emeraldLeggings = new EmeraldLeggings(this);
    emeraldChestplate = new EmeraldChestplate(this);
    emeraldHelmet = new EmeraldHelmet(this);
    lightEmeraldBoots = new LightEmeraldBoots(this);

    emeraldFeather.addEmeraldFeather();
    emeraldBoots.addEmeralBoots();
    emeraldLeggings.addEmeraldLeggings();
    emeraldChestplate.addEmeraldChestplate();
    emeraldHelmet.addEmeraldHelmet();
    lightEmeraldBoots.addLightEmeraldBoots();
  }

  public EmeraldFeather getEmeraldFeather() {
    return emeraldFeather;
  }

  public EmeraldBoots getEmeraldBoots() {
    return emeraldBoots;
  }

  public EmeraldLeggings getEmeraldLeggings() {
    return emeraldLeggings;
  }

  public EmeraldChestplate getEmeraldChestplate() {
    return emeraldChestplate;
  }

  public EmeraldHelmet getEmeraldHelmet() {
    return emeraldHelmet;
  }

  public LightEmeraldBoots getLightEmeraldBoots() {
    return lightEmeraldBoots;
  }
}
