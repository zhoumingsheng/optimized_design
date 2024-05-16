package com.design.infra.util;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.design.infra.constant.CommonConstants;

public class TimeUtils {

    private static final ZoneId DEFAULT_ZONE_ID = ZoneId.of(CommonConstants.DEFAULT_ZONE_ID);

    public static Instant newInstant() {
        return Instant.now(Clock.systemUTC());
    }

    public static String toStringWithMilli(Instant instant) {
        return toString(instant, TimePattern.YYYY_MM_DD_HH_MM_SS_FFF);
    }

    public static String toStringWithMilli(ZonedDateTime zonedDateTime) {
        return toString(zonedDateTime, TimePattern.YYYY_MM_DD_HH_MM_SS_FFF);
    }

    public static long getIntervalMillis(LocalDateTime first, LocalDateTime second) {

        return Math.abs(ChronoUnit.MILLIS.between(first, second));
    }

    public static long getIntervalMillis(Instant first, Instant second) {

        return Math.abs(ChronoUnit.MILLIS.between(first, second));
    }

    public static String toString(Instant instant, TimePattern timePattern) {

        return toString(toLocalDateTime(instant), timePattern);
    }

    public static String toString(ZonedDateTime zonedDateTime, TimePattern timePattern) {

        return zonedDateTime.format(getDateTimeFormatter(timePattern));
    }

    public static String toString(LocalDateTime localDateTime, TimePattern timePattern) {

        return localDateTime.format(getDateTimeFormatter(timePattern));
    }

    public static LocalDateTime toLocalDateTime(Instant instant) {
        return LocalDateTime.ofInstant(instant, DEFAULT_ZONE_ID);
    }

    private static DateTimeFormatter getDateTimeFormatter(TimePattern timePattern) {
        return DateTimeFormatter.ofPattern(timePattern.getValue());
    }

}
