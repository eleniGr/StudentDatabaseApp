package com.example.studentdatabaseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class StudentDatabaseApp{

    public static void main(String[] args) {

        SpringApplication.run(StudentDatabaseApp.class, args);
//        Student student1 = new Student();
//        student1.enroll();
//        student1.payTuition();
//        System.out.println(student1.toString());

        //Ask how many new students we want to add
        System.out.println("Enter number of students to enroll:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int n =0;n<numOfStudents;n++){
            students[n]= new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }


    }

}
