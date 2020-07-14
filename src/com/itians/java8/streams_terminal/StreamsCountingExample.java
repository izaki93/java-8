package com.itians.java8.streams_terminal;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static Long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(counting());
    }

    public static void main(String[] args) {

        System.out.println("count : " + count());
    }
}
