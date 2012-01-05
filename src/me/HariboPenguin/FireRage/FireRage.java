package me.HariboPenguin.FireRage;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class FireRage extends JavaPlugin {
	
	public static FireRage plugin;
	public final Logger log = Logger.getLogger("Minecraft");
	private FireRageIgniteCommandExecutor IgniteExecutor;
	private FireRageExtinguishCommandExecutor ExtinguishExecutor;
	
	
	@Override
	public void onDisable() {
		
		PluginDescriptionFile pdfFile = this.getDescription();
		this.log.info(pdfFile.getName() + " has been disabled!");
		
	}
	
	@Override
	public void onEnable() {
		
		IgniteExecutor = new FireRageIgniteCommandExecutor(this);
		getCommand("ignite").setExecutor(IgniteExecutor);
		
		ExtinguishExecutor = new FireRageExtinguishCommandExecutor(this);
		getCommand("ext").setExecutor(ExtinguishExecutor);
		
		PluginDescriptionFile pdfFile = this.getDescription();
		this.log.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled!");
	}
	
}