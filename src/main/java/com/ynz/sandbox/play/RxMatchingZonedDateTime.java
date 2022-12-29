package com.ynz.sandbox.play;

public class RxMatchingZonedDateTime {

    public static final String beforeString = "2023-11-04T12:09:53.682Z";

    public static final String afterString = "2020-11-04T12:09:53.682Z";

    public static final String dateTime = "2015-01-17T18:23:02.682+08:00";

    public static void main(String[] args) {

        String zonedDateTimePattern = "^(-?(?:[1-9][0-9]*)?[0-9]{4})-(1[0-2]|0[1-9])-(3[01]|0[1-9]|[12][0-9])T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]{3})?(Z)?$\n";

        System.out.println(beforeString.matches(zonedDateTimePattern));
        System.out.println(dateTime.matches(zonedDateTimePattern));

        String regexZonedDateTime = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{1,9}(?:Z|[+-][01]\\d:[0-5]\\d)";
        System.out.println(afterString.matches(regexZonedDateTime));

        System.out.println(dateTime.matches(regexZonedDateTime));
    }
}
