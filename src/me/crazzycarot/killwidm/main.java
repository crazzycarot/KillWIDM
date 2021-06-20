package me.crazzycarot.killwidm;

import org.bukkit.Bukkit;



public void onEnable() {

	// this.api = WinsAPI.getAPI();

	PlayerColor.onEnable();

	getConfig().options().copyDefaults(true);
	saveDefaultConfig();

	// commands
	getCommand("vuller").setExecutor(this);
	getCommand("msg").setExecutor(this);
	getCommand("setspawn").setExecutor(this);
	getCommand("spawn").setExecutor(this);
	getCommand("gamestart").setExecutor(this);
	getCommand("vote").setExecutor(this);
	getCommand("help").setExecutor(this);
	getCommand("pvpaan").setExecutor(this);
	getCommand("pvpuit").setExecutor(this);
	getCommand("channel").setExecutor(this);
	getCommand("channelall").setExecutor(this);
	getCommand("revote").setExecutor(this);
	getCommand("widmbroadcast").setExecutor(this);
	getCommand("color").setExecutor(this);
	getCommand("joinmessage").setExecutor(this);
	getCommand("messagehost").setExecutor(this);
	getCommand("spectate").setExecutor(this);
	getCommand("addgame").setExecutor(this);
	getCommand("togglechat").setExecutor(this);

	getCommand("queue").setExecutor(this);

	getCommand("gamestartsilent").setExecutor(this);

	getServer().getLogger().info("Carrotnetwork WIDM Vuller v2.3.2 is active");
	Bukkit.getServer().getPluginManager().registerEvents(this, this);
	Bukkit.getServer().getPluginManager().registerEvents(new lobby(), this);

	new scoreboard(this);

	// registerevents();

}