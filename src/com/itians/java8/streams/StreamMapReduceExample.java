package com.itians.java8.streams;

import com.itians.java8.data.Student;
import com.itians.java8.data.StudentDataBase;

public class StreamMapReduceExample {

    public static int noOfNoteBooks() {

        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks) //Stream<Integer>
                //.reduce(0, (a, b) -> a + b);
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("noOfNoteBooks : " + noOfNoteBooks());
    }
}
