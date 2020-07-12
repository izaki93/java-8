package com.itians.java8.streams;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }
    public static List<Student> sortStudentByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }
    public static void main(String[] args) {
        System.out.println("Student sorted by name : ");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Student sorted by Gba : ");
        sortStudentByGpa().forEach(System.out::println);

        System.out.println("Student sorted by Gba Desc : ");
        sortStudentByGpaDesc().forEach(System.out::println);
    }
}
