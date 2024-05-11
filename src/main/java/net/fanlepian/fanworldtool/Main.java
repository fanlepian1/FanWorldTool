package net.fanlepian.fanworldtool;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private JavaPlugin Instance;

    @Override
    public void onEnable() {
        this.Instance =this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
