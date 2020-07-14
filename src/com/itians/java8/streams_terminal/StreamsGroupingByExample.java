package com.itians.java8.streams_terminal;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizedGroupingBy() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() > 3.9 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {

        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {

        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));

        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy() {

        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        LinkedHashMap::new, toSet()));

        System.out.println(studentLinkedHashMap);

    }

    public static void calculateTopGpa() {

        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));

        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(studentMap);
    }

    public static void calculateLeastGpa() {

        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));

        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(studentMap);
    }

    public static void main(String[] args) {

        //groupStudentByGender();
        //customizedGroupingBy();
        //twoLevelGrouping_1();
        //twoLevelGrouping_2();
        //threeArgumentGroupBy();
        //calculateTopGpa();
        calculateLeastGpa();
    }
}
