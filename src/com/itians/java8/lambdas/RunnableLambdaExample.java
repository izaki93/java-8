package com.itians.java8.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * prior java 8
         * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        /**
         * java 8 lambda syntax
         * ()->{}
         * */

        // if you have single line no need for {} after ->
        Runnable runnableLambda = () -> System.out.println("Inside Runnable 2");
        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("Inside Runnable 2")).start();

        // if you have Multiple lines you need for {} after ->
        Runnable runnableLambdaMultipleLine = () -> {
            System.out.println("Inside Runnable 3");
            System.out.println("Inside Runnable 4");
        };
        new Thread(runnableLambdaMultipleLine).start();

    }
}
