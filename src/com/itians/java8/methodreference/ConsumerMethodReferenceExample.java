package com.itians.java8.methodreference;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * className::methodName
     */
    static Consumer<Student> c1 = System.out::println;

    /**
     * className::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);

        StudentDataBase.getAllStudents().forEach(c2);
    }
}
