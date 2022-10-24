package com.example.studentdatabaseapp;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id= 1000;
    //Constructor: user enters name and year

    public Student() {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter firstname: ");
        this.firstname = in.nextLine();
        System.out.println("Enter lastname: ");
        this.lastname = in.nextLine();
        System.out.println("Enter Student Grade Level: ");
        System.out.print(" 1 for Freshmen \n2 for Sophmore \n3 for Junior \n4 for Senior");
        this.gradeYear = in.nextInt();
        setStudentID();

        setStudentID();
    }

    //Generate 5-digit ID
    private void setStudentID(){
        //Grade Level + ID
        id++;
       this.studentID =  this.gradeYear + "" + id;

    }

    //Enroll in courses
    public void enroll(){

        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals( "Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
                break;
            }
        }while(1 != 0);
        System.out.println("Tuition Balance:" + tuitionBalance);
    }

    //View Balance
    public void viewBalance(){

        System.out.println("your Balance is :" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance= tuitionBalance - payment;
        System.out.println("Thank you for your payment of:" + payment);
        viewBalance();


    }

    //Show Status
    public String toString(){
        return "Name:" + firstname + "\nCourses:" + courses + "\nBalance:" + tuitionBalance;
    }
}
