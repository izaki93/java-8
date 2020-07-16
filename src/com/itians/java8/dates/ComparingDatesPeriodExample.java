package com.itians.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2018, 01, 01);
        LocalDate localDate1 = LocalDate.of(2018, 12, 31);

        /**
         * Period
         * **/
        Period period = localDate.until(localDate1);
        System.out.println("getDays : " + period.getDays());
        System.out.println("getMonths : " + period.getMonths());
        System.out.println("getYears : " + period.getYears());

        Period period1 = period.ofDays(10);
        System.out.println("period1.getDays : " + period1.getDays());

        Period period2 = period.ofYears(10);
        System.out.println("period2.getYears : " + period2.getYears());
        System.out.println("period2.toTotalMonths : " + period2.toTotalMonths());

        Period period3 = Period.between(localDate, localDate1);
        System.out.println(String.format("period3 : Days: %s , Months: %s , Years: %s", period3.getDays(),
                period3.getMonths(), period3.getYears()));

    }
}
