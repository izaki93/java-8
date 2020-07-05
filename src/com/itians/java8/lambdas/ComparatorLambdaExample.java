package com.itians.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * prior java 8
         **/
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 0 -> o1 == 02
                // 1 ->  o1 > o2
                // -1 ->  o1 < o2
                return o1.compareTo(02);
            }
        };
        System.out.println("Result Of Comparator is : " + integerComparator.compare(3, 2));


        /**
         *  java 8 lambda syntax
         **/
        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        System.out.println("Result Of Comparator is : " + comparatorLambda.compare(3, 2));
    }
}
