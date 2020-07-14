package com.itians.java8.streams_terminal;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static Double average() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {

        System.out.println("sum : " + sum());

        System.out.println("average : " + average());
    }
}
