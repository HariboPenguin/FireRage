package me.HariboPenguin.FireRage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FireRageIgniteCommandExecutor implements CommandExecutor {
	
	private FireRage plugin;
	
	public FireRageIgniteCommandExecutor(FireRage plugin) {
		
		this.plugin = plugin;
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if(cmd.getName().equalsIgnoreCase("ignite")){
	    	
	    	ChatColor GOLD = ChatColor.GOLD;
	    	ChatColor RED = ChatColor.RED;
	    	
	    	Player player = null;
	    	if (sender instanceof Player) {
	    		player = (Player) sender;
	    	}
	    	
	    	if (player == null && args.length == 0) {
	    		
	    		sender.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + "You cannot set the console on fire");
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
	    				target.setFireTicks(10000);
	    				String targetname = this.plugin.getServer().getPlayer(args[0]).getName();
	    				String sendername = sender.getName();
	    				sender.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + RED + "You have set " + GOLD + targetname + RED + " on fire");
	    				target.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + RED + "You have been set on fire by " + GOLD + sendername);
	    				return true;
	    			}
	    		}
	    	
	    		else {
	    			Player IgniteSelf = (Player) sender;
	    			IgniteSelf.setFireTicks(10000);
	    		
	    			sender.sendMessage(RED + "[" + GOLD + "FireRage" + RED + "] " + RED + "You have set yourself on fire");
	    			return true;
	    		}
	    		
	    	}
	    	
	    	
	        
	    }
	    return false;
	}

}
