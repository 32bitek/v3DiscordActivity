package dev.v3team.utils;

import org.bukkit.Bukkit;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadUtil {

    public static void checkAndDownload() {
        if (!Files.exists(Paths.get("plugins/FeatherAPI.jar"))) {
            ConsoleUtil.log("Starting to download FeatherAPI from the official repository...");


            if (download()) {
                ConsoleUtil.log("FeatherAPI successfully downloaded! Restarting Server...");
                Bukkit.shutdown();
            }}
    }static boolean download() {
        try {
            URL url = new URL("https://github.com/FeatherMC/feather-server-api/releases/download/v0.0.5/feather-server-api-0.0.5-bukkit.jar");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            try (InputStream in = conn.getInputStream()) {
                Files.copy(in, Paths.get("plugins/FeatherAPI.jar"));
                return true;
            }
        } catch (Exception e) {return false;}
    }
}