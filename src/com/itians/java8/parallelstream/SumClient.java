package com.itians.java8.parallelstream;

import java.util.stream.IntStream;

public class SumClient {

    //Note if you have any mutable variable don't use parallel stream at all.
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                //.parallel()
                .forEach(sum::performSum); //500500

        System.out.println(sum.getTotal());
    }
}
