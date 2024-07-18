package me.usti.teamhead;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Teamhead extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
