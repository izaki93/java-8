package com.itians.java8.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {

        // Instant.now() :Represents the time in seconds from January 01,1970(EPOCH) to current time as a huge number.
        Instant instant = Instant.now();
        System.out.println(instant);

        // get seconds from Jan 1st 1970 -> Epoch to the current time
        // each day has -> 86400 seconds
        System.out.println("getEpochSecond : " + instant.getEpochSecond());

        System.out.println(Instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();

        Duration duration = Duration.between(instant, instant1);
        System.out.println("duration : " + duration.getNano());
    }
}
