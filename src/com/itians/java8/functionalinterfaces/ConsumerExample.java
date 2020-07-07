package com.itians.java8.functionalinterfaces;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = student -> System.out.println(student);
    static Consumer<Student> c3 = student -> System.out.println(student.getName());
    static Consumer<Student> c4 = student -> System.out.println(student.getActivities());

    public static void printName() {
        System.out.println("------------------- printName ------------------- ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("------------------- printNameAndActivities ------------------- ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c3.andThen(c4)); //consumer chaining

    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("------------------- printNameAndActivitiesUsingCondition ------------------- ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c3.andThen(c4).andThen(c2).accept(student);
            }
        });

    }

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("java-8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
