package de.falsedeveloping.falseArmor.Craftingrecipes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class RecipeClickListener implements Listener {

  @EventHandler
  public void onRecipeClick(InventoryClickEvent e) {
    if (e.getClickedInventory() == null) return;
    if (e.getView().getTitle().equals("Rezept:")) {
      e.setCancelled(true);
    }
  }

}
