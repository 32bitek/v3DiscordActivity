package dev.v3team.utils;

import dev.v3team.ServerPlugin;

public class ConfigUtil {
    public static String getImage() {
        return ServerPlugin.getPlugin(ServerPlugin.class).getConfig().getString("image-link", "Unkown");
    } public static String getImageText() {
        return ServerPlugin.getPlugin(ServerPlugin.class).getConfig().getString("image-text", "Unkown");
    } public static String getState() {
        return ServerPlugin.getPlugin(ServerPlugin.class).getConfig().getString("state", "Unkown");
    } public static String getDetails() {
        return ServerPlugin.getPlugin(ServerPlugin.class).getConfig().getString("details", "Unkown");
    }


}
