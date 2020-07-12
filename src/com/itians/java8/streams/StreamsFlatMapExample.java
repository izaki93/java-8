package com.itians.java8.streams;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                //flatMap used when each every element in the stream represent a list
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                //flatMap used when each every element in the stream represent a list
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println("Students Count : " + getStudentActivitiesCount());
    }
}
