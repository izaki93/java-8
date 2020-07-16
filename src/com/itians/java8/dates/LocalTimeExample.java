package com.itians.java8.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : " + localTime);

        LocalTime localTime1 = LocalTime.of(23, 33);
        System.out.println("localTime1 H:M : " + localTime1);

        LocalTime localTime2 = LocalTime.of(23, 33, 43);
        System.out.println("localTime2 H:M:S : " + localTime2);

        LocalTime localTime3 = LocalTime.of(23, 33, 43, 989098864);
        System.out.println("localTime3 H:M:S:sss : " + localTime3);

        /**
         * Getting values from local time instance
         * **/
        System.out.println("getHour : " + localTime.getHour());
        System.out.println("getMinute : " + localTime.getMinute());
        System.out.println("getSecond : " + localTime.getSecond());
        System.out.println("ChronoField.CLOCK_HOUR_OF_DAY : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay : " + localTime.toSecondOfDay()); //represent time in seconds

        /**
         * Modifying values of LocalTime
         **/
        System.out.println("minusHours : " + localTime.minusHours(2));
        System.out.println("minus using ChronoUnit.HOURS : " + localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("with MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("with HOUR_OF_DAY : " + localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("plusMinutes : " + localTime.plusMinutes(2));
        System.out.println("withHour : " + localTime.withHour(10));
    }
}
