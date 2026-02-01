package dev.v3team;

import dev.v3team.utils.ConsoleUtil;
import dev.v3team.utils.DownloadUtil;
import dev.v3team.utils.FeatherUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        DownloadUtil.checkAndDownload();
        saveDefaultConfig();
        ConsoleUtil.log("Plugin is starting..");
        ConsoleUtil.log("Checking requirements...");
        FeatherUtil.registerActivity();
        ConsoleUtil.log("Launched!");

    }
    @Override
    public void onDisable() {
        ConsoleUtil.log("Plugin is being disabled...");
    }
}
