package com.itians.java8.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(); // 15-07-2020
        System.out.println("localDate : " + localDate);

        LocalDate localDate1 = LocalDate.of(2020, 07, 17);
        System.out.println("localDate1 : " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2019, 02);
        System.out.println("localDate2 : " + localDate2);

        /**
         * Getting Values form localDate
         * **/
        System.out.println("getMonth : " + localDate.getMonth());
        System.out.println("getMonthValue : " + localDate.getMonthValue());
        System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear : " + localDate.getDayOfYear());
        System.out.println("DAY_OF_MONTH Using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying localDate
         * **/
        System.out.println("Current Day + 2 using plusDays : " + localDate.plusDays(2));
        System.out.println("Current Month + 2 using plusMonths : " + localDate.plusMonths(2));
        System.out.println("Current Month - 2 using minusDays : " + localDate.minusDays(2));
        System.out.println("withYear : " + localDate.withYear(2021));
        System.out.println("with Chrono Field : " + localDate.with(ChronoField.YEAR, 2022));
        System.out.println("with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("ChronoUnit minus : " + localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Additional Support methods
         * **/
        System.out.println("2020 isLeapYear ? : " + localDate.isLeapYear());
        System.out.println("2018 isLeapYear? : " + LocalDate.ofYearDay(2018, 01).isLeapYear());

        //localDate = 15-07-2020
        // localDate1 = 16-07-2020
        System.out.println("localDate isEqual localDate1 : " + localDate.isEqual(localDate1));
        System.out.println("localDate isBefore localDate1 : " + localDate.isBefore(localDate1));
        System.out.println("localDate isAfter localDate1 : " + localDate1.isAfter(localDate));

        /**
         * Unsupported
         * **/

        /*System.out.println("ChronoUnit minus : " + localDate.minus(1, ChronoUnit.MINUTES));*/
        System.out.println("isSupported ChronoUnit.MINUTES : " + localDate.isSupported(ChronoUnit.MINUTES));
    }
}
