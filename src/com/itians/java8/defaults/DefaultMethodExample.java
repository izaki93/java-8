package com.itians.java8.defaults;

import com.itians.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {

        /**
         * Sort list of names in alphabetical order
         **/
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * Prior Java 8
         * **/
        Collections.sort(stringList);
        System.out.println("Sorted List using  Collections.sort() : " + stringList);

        /**
         * In Java 8
         **/
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List using  listName.sort() in natural Order : " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted List using  listName.sort() in reverse Order : " + stringList);

    }
}
