package com.itians.java8.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        Integer i = 0;
        Consumer<Integer> c1 = i1 -> System.out.println("Value is :" + i);
    }
}
