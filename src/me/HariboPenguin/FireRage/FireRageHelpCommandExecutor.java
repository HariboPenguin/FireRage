package me.HariboPenguin.FireRage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class FireRageHelpCommandExecutor implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private FireRage plugin;
	
	public FireRageHelpCommandExecutor(FireRage plugin) {
		
		this.plugin = plugin;
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("frhelp")) {
			
			ChatColor RED = ChatColor.RED;
	    	ChatColor GOLD = ChatColor.GOLD;
	    	ChatColor GRAY = ChatColor.GRAY;
	    	ChatColor BLUE = ChatColor.BLUE;
	    	
	    	sender.sendMessage(BLUE + "-----------------" + GOLD +  " FireRage Help Menu " + BLUE + "-----------------");
	    	sender.sendMessage(RED + "/ignite" + GOLD + " - " + GRAY + "Sets yourself on fire");
	    	sender.sendMessage(RED + "/ignite [Player]" + GOLD + " - " + GRAY + "Sets the specified player on fire");
	    	sender.sendMessage(RED + "/ext" + GOLD + " - "  + GRAY + "Extinguishes yourself");
	    	sender.sendMessage(RED + "/ext [Player]" + GOLD + " - " + GRAY + "Extinguishes the specified player");
	    	sender.sendMessage(RED + "/frhelp" + GOLD + " - " + GRAY + "Display's this help menu");
			
			return true;
			
		}
		return false;
		
	}

}
