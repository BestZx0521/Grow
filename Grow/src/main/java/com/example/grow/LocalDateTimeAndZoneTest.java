package com.example.grow;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeAndZoneTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        ZonedDateTime ztime = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        ZoneId zId = ZoneId.systemDefault();
        String zone = zId.getId();
        System.out.println("当前地区"+zone);

    }
}
