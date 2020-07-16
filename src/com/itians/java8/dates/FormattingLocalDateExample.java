package com.itians.java8.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate() {

        /**
         * Using system defined format
         */
        String date = "2018-04-28";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate : " + localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1 : " + localDate1);

        String isoDate = "20180428"; //yyyyMMdd
        System.out.println("BASIC_ISO_DATE : " +LocalDate.parse(isoDate,DateTimeFormatter.BASIC_ISO_DATE));

        /**
         * Custom system defined format
         */
        String date1 = "2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate2 = LocalDate.parse(date1,dateTimeFormatter);
        System.out.println("localDate2 : " + localDate2);

        String date2 = "2018*04*28";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("uuuu*MM*dd");
        LocalDate localDate3 = LocalDate.parse(date2,dateTimeFormatter1);
        System.out.println("localDate3 : " + localDate3);

    }

    public static void formatLocalDate() {

        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd|MM|yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : " + formattedDate);
    }

    public static void main(String[] args) {

        parseLocalDate();
        formatLocalDate();

    }
}
