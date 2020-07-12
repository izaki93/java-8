package com.itians.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        System.out.println("Streams.of --------------------");
        Stream<String> stringStream = Stream.of("Ibrahim", "Mohamed", "Ahmed");
        stringStream.forEach(System.out::println);

        System.out.println("Streams.iterate --------------------");
        Stream.iterate(1, x -> x * 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("Streams.generate --------------------");
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);

    }
}
