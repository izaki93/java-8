package com.itians.java8.streams;

import com.itians.java8.data.StudentDataBase;

public class StreamsMatchExample {

    public static Boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    public static Boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static Boolean nonMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.1);
    }

    public static void main(String[] args) {

        System.out.println("Result of All Match : " + allMatch());

        System.out.println("Result of Any Match : " + anyMatch());

        System.out.println("Result of Non Match : " + nonMatch());
    }
}
