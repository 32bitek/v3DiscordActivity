package dev.v3team.utils;

import net.digitalingot.feather.serverapi.api.FeatherAPI;
import net.digitalingot.feather.serverapi.api.event.player.PlayerHelloEvent;
import net.digitalingot.feather.serverapi.api.meta.DiscordActivity;
import net.digitalingot.feather.serverapi.api.player.FeatherPlayer;
import java.io.ObjectInputFilter;

public class FeatherUtil {

    public static void registerActivity() {
        FeatherAPI.getEventService().subscribe(PlayerHelloEvent.class, event -> {
            FeatherPlayer player = event.getPlayer();

            DiscordActivity activity = DiscordActivity.builder()
                    .withImage(ConfigUtil.getImage())
                    .withImageText(ConfigUtil.getImageText())
                    .withState(ConfigUtil.getState())
                    .withDetails(ConfigUtil.getDetails())
                    .withStartTimestamp(System.currentTimeMillis())
                    .build();

            FeatherAPI.getMetaService().updateDiscordActivity(player, activity);
        });
    }
}
