package com.skcraft.launcher;

import com.skcraft.launcher.util.HttpRequest;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static com.skcraft.launcher.util.HttpRequest.url;

public class ShiningArmor {

    public static List<String> names = new ArrayList<>();
    @Data
    public static class UpdaterPayload {
        private final String sender;
        private final List<String> names;
    }

    public static void sendUpdate(Launcher launcher, String name) {
        try {
            if (!names.isEmpty()) {
                HttpRequest.post(url(launcher.prop("dubApiBaseUrl") + "shiningarmor"))
                        .bodyJson(new UpdaterPayload(name, names))
                        .execute()
                        .expectResponseCode(200);
                names.clear();
            }
        } catch (Exception e) {
        }
    }
}
