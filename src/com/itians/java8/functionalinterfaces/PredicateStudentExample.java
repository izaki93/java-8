package com.itians.java8.functionalinterfaces;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> students = StudentDataBase.getAllStudents();
    static Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentPredicate2 = student -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        System.out.println("-------------------- filterStudentByGradeLevel -------------------- ");
        students.forEach(student -> {
            if (studentPredicate.test(student)) { //student.getGradeLevel() >= 3;
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa() {
        System.out.println("-------------------- filterStudentByGpa -------------------- ");
        students.forEach(student -> {
            if (studentPredicate2.test(student)) { //student.getGpa() >= 3.9;
                System.out.println(student);
            }
        });
    }

    public static void filterStudents() {
        System.out.println("-------------------- filterStudents -------------------- ");
        students.forEach(student -> {
           /* if(studentPredicate.and(studentPredicate2).test(student)){
                System.out.println(student);
            }*/
            /*if(studentPredicate.or(studentPredicate2).test(student)){
                System.out.println(student);
            }*/
            if (studentPredicate.or(studentPredicate2).negate().test(student)) { //student.getGradeLevel() >= 3; student.getGpa() >= 3.9;
                System.out.println(student);
            } else {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();

        filterStudentByGpa();

        filterStudents();
        ;
    }
}
