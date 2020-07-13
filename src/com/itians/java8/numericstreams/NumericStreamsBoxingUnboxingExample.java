package com.itians.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    //Boxing : convert primitive datatype to Wrapper class
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10) // IntStream of 10 elements
                // int
                .boxed()
                // Integer
                .collect(Collectors.toList());
    }

    //UnBoxing : convert Wrapper class to primitive datatype
    public static int unBoxing(List<Integer> integerList) {
        return integerList.stream()
                // Wrapper Integer values
                .mapToInt(Integer::intValue) // intValue of wrapper class
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("Boxing : " + boxing());

        List<Integer> integerList = boxing();
        System.out.println("UnBoxing : " + unBoxing(integerList));
    }
}
