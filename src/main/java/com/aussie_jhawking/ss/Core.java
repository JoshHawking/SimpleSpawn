package com.aussie_jhawking.ss;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin implements Listener {
	
	
	public static String TAG = ChatColor.GRAY + "[" +ChatColor.YELLOW + "SimpleSpawn" + ChatColor.GRAY + " ] " + ChatColor.YELLOW + "";
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player p = (Player)sender;
	
	if((command.getLabel().equalsIgnoreCase("spawn"))){
		if (p.hasPermission("ss.spawn")){
			 p.teleport(p.getWorld().getSpawnLocation());
		        p.sendMessage(Core.TAG + "Returned to spawn!");
		}
		if (!p.hasPermission("ss.spawn")) {
	        p.sendMessage(Core.TAG + "You can't do that");
	      }
       return true;
}
  if((command.getLabel().equalsIgnoreCase("setspawn"))){
  	if (p.hasPermission("ss.setspawn"))
      {
        p.getWorld().setSpawnLocation(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ());
        p.sendMessage(Core.TAG + "Spawn Set!");
      }
      if (!p.hasPermission("ss.setspawn")) {
        p.sendMessage(Core.TAG + "You can't do that");
      }
      return true;
}
	
	
	return false;

}
}