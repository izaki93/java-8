package com.itians.java8.optional;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse() {

        //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        String name = optionalStudent.map(Student::getName).orElse("Default");

        return name;
    }

    //orElseGet
    public static String optionalOrElseGet() {

        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> optionalStudent = Optional.ofNullable(null);

        String name = optionalStudent.map(Student::getName).orElseGet(() -> "Default");

        return name;

    }

    //orElseThrow
    public static String optionalOrElseThrow() {

        //Optional<Student> getOptionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        String name = optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data available"));

        return name;

    }

    public static void main(String[] args) {


        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}