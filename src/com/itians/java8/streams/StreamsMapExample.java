package com.itians.java8.streams;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> Uppercase operation on each input
                .collect(Collectors.toList()); //List<String>
    }

    public static Set<String> namesSet(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> Uppercase operation on each input
                .collect(Collectors.toSet()); //Set<String>
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
