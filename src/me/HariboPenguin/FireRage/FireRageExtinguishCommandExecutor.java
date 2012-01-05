package me.HariboPenguin.FireRage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FireRageExtinguishCommandExecutor implements CommandExecutor {
	
	private FireRage plugin;
	
	public FireRageExtinguishCommandExecutor(FireRage plugin) {
		
		this.plugin = plugin;
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if(cmd.getName().equalsIgnoreCase("ext")){
	    	
	    	ChatColor RED = ChatColor.RED;
	    	ChatColor GOLD = ChatColor.GOLD;
	    	ChatColor BLUE = ChatColor.BLUE;
	    	ChatColor AQUA = ChatColor.AQUA;
	    	
	    	Player player = null;
	    	if (sender instanceof Player) {
	    		player = (Player) sender;
	    	}
	    	
	    	if (player == null && args.length == 0) {
	    		
	    		sender.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + "You cannot extinguish the console");
	    		return true;
	    		
	    	} 
	    	
	    	else {
	    		
	    		if (args.length == 1) {
	    			Player target = this.plugin.getServer().getPlayer(args[0]);
	    		
	    			if (target == null) {
	    				sender.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + "That player is not online");
	    				return true;
	    			}
	    		
	    			else {
	    				target.setFireTicks(0);
	    				String targetname = this.plugin.getServer().getPlayer(args[0]).getName();
	    				String sendername = sender.getName();
	    				sender.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + BLUE + "You have extinguished " + AQUA + targetname);
	    				target.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + BLUE + "You have been extinguished by " + AQUA + sendername);
	    				return true;
	    			}
	    		}
	    	
	    		else {
	    		
	    			Player ExtSelf = (Player) sender;
	    			ExtSelf.setFireTicks(0);
	    		
	    			sender.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + BLUE + "You have extinguished yourself");
	    			return true;
	    		}
	    		
	    	}
	    	
	    	
	    	
	    }
	    return false;
	}

}
