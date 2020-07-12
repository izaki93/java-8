package com.itians.java8.streams;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterStudents());

        filterStudents().forEach(System.out::println);
    }
}
