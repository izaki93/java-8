package com.itians.java8.streams;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(studentPredicate)
                .peek(student -> {
                    System.out.println("After 1 st filter : ------- \n"+student);
                })
                .filter(studentGpaPredicate)
                .peek(student -> {
                    System.out.println("After 2 st filter : ------- \n"+student);
                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
