package com.itians.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        names.remove(0);
        for (String name : names){
            System.out.println(name);
        }
        for (String name : names){
            System.out.println(name);
        }
        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //If you try to iterate over the streams again for second time it will throw
        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //nameStream.forEach(System.out::println);



    }
}
