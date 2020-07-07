package com.itians.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    //check if the Number is even number
    static Predicate<Integer> p = number -> number % 2 == 0;
    static Predicate<Integer> p1 = number -> number % 2 == 0;
    static Predicate<Integer> p2 = number -> number % 5 == 0;

    public static void predicateAnd() {
        System.out.println("-------------------- predicateAnd -------------------- ");
        System.out.println("Predicate And Result is : " + p1.and(p2).test(10)); //predicate chaining
        System.out.println("Predicate And Result is : " + p1.and(p2).test(9));
    }

    public static void predicateOr() {
        System.out.println("-------------------- predicateOr -------------------- ");
        System.out.println("Predicate OR Result is : " + p1.or(p2).test(10)); //predicate chaining
        System.out.println("Predicate OR Result is : " + p1.or(p2).test(8));
    }

    public static void predicateNegate() {
        System.out.println("-------------------- predicateNegate -------------------- ");
        System.out.println("Predicate Negate Result is : " + p1.or(p2).negate().test(10)); //predicate chaining
    }

    public static void main(String[] args) {

        System.out.println(p.test(6));

        predicateAnd();

        predicateOr();

        predicateNegate();
    }
}
