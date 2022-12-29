package com.ynz.sandbox.play;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * computeIfAbsent: meaning that when key is not existed or key is associated with null value, then the value is added.
 * but once key is associated with a value, then it will be by passed.
 */
@Slf4j
public class UsingMapComputeIf {
    private static String KEY_REMOTE_MODIFIED = "remoteModified";
    private static String KEY_REMOTE_CREATED = "remoteCreated";
    private static String KEY_REMOTE_APPOINTMENT_ID = "remoteAppointmentId";

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put(KEY_REMOTE_APPOINTMENT_ID, null);
        map.put(KEY_REMOTE_APPOINTMENT_ID, "1000");
    }

    public static void main(String[] args) {
        MapUtils.verbosePrint(System.out, "original map:", map);

        //If this key missing a value, then set it.
        setRemoteModified(ZonedDateTime.now());
        setRemoteCreated(ZonedDateTime.now().minusDays(3L));
        MapUtils.verbosePrint(System.out, "after adding key-values:", map);

        log.info("map cannot be modified any more");

        setRemoteCreated(ZonedDateTime.now().minusDays(10L));
        MapUtils.verbosePrint(System.out, "after K-V assigned:", map);

        log.info("if key is existed and nonnull");
        String found = map.get(KEY_REMOTE_CREATED);
        log.info("found:" + found);

    }

    public static void setRemoteCreated(ZonedDateTime remoteCreated) {
        //if the key associated with null value, then put the value.
        // or this key not existed.
        map.computeIfAbsent(
                KEY_REMOTE_CREATED, (k) -> remoteCreated.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        );
    }

    public static void setRemoteModified(ZonedDateTime remoteModified) {
        map.computeIfAbsent(KEY_REMOTE_MODIFIED, (k) -> remoteModified.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    }
}
