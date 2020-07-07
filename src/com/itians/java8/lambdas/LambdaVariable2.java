package com.itians.java8.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    public static void main(String[] args) {
        int value = 4;
        Consumer<Integer> c1 = i ->{
            //value++; not allowed to modify any local variable inside lambda scope
            //this concept called Effectively Final
            System.out.println(value + i);
        };
        //not allowed to modify any local variable outside lambda scope
        //value =6;
        c1.accept(4);
    }
}
