package com.ynz.sandbox.play;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeCompTimeStamp {
    private static final String dateTime = "2021-10-14T12:42:02.927+01:00";

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTime, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        //Timestamp timestamp = new Timestamp();
        Instant dateTimeInstant = zonedDateTime.toInstant();
        System.out.println(dateTimeInstant);
        Instant timesTampInstant = new Timestamp(System.currentTimeMillis()).toInstant();
        System.out.println(timesTampInstant);
    }
}
