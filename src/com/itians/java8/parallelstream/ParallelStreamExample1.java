package com.itians.java8.parallelstream;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                //flatMap used when each every element in the stream represent a list
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to Execute the pipeline in sequential  : " + (endTime - startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .parallel()
                .map(Student::getActivities) //Stream<List<String>>
                //flatMap used when each every element in the stream represent a list
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to Execute the pipeline in parallel  : " + (endTime - startTime));
        return studentActivities;
    }

    public static void main(String[] args) {

        sequentialPrintStudentActivities();

        parallelPrintStudentActivities();

    }
}
