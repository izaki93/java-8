package com.itians.java8.optional;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        if (studentOptional.isPresent()) {
            studentOptional.get(); // Student
            return studentOptional.map(Student::getName); //Optional<String>
        }
        return Optional.empty(); // Represents an Optional object with no values
    }

    public static void main(String[] args) {
        /*String name = getStudentName();
        System.out.println("Length of th student name : " + name.length());*/

        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get().length()); // String which is student name
        }else {
            System.out.println("Name not provide");
        }
    }
}
