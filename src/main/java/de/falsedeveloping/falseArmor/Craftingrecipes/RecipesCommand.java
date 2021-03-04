package de.falsedeveloping.falseArmor.Craftingrecipes;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RecipesCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!(sender instanceof Player)) {
      System.out.println("Dieser Befehl ist Spielern vorbehalten!");
      return true;
    }
    Player p = (Player) sender;
    p.sendMessage("§4Benutze /frecipe [Rezept], um dir das Rezept anzuzeigen!");
    List<String> recipes = new ArrayList<>();
    recipes.add("§aEmeraldfeather");
    p.sendMessage("§b§lVerfügbare Rezepte: ");
    for (String i : recipes) {
      p.sendMessage(i);
    }

    return true;
  }
}
