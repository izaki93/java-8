package com.itians.java8.streams;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                //1
                //3
                //5
                //7
                // a = identity = 1, b=first element on list = 1 (from stream) -> result 1 is returned
                // a = result from previous step = 1 , b = 3 (from stream) -> result 3 is returned
                // a = result from previous step = 3 , b = 5 (from stream) -> result 15 is returned
                // a = result from previous step = 15 , b = 7 (from stream) -> result 105 is returned
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> integers1 = new ArrayList<>();

        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);
        System.out.println(result1.isPresent());

        Optional<Student> student = getHighestGPAStudent();
        if (student.isPresent()) {
            System.out.println(student.get());
        }
    }
}
