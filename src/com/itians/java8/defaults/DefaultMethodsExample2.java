package com.itians.java8.defaults;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList) {
        System.out.println("After Sort: ");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList) {
        System.out.println("After Sort By GPA: ");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);

        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {
        System.out.println("After Sort With Null Values: ");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {

        System.out.println("After Comparator chaining : ");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);

    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(studentList);

        System.out.println("Before Sort: ");
        studentList.forEach(studentConsumer);
        //sortByName(studentList);
        //sortByGpa(studentList);
        //comparatorChaining(studentList);
        sortWithNullValues(studentList);
    }
}
