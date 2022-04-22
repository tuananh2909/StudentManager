package com.ntqsolution;

import com.ntqsolution.controller.StudentList;
import com.ntqsolution.model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int choose;
        StudentList studentList = new StudentList();
        do {
            menu();
            choose = scanner.nextInt();
            scanner.nextLine();
//            while (choose > 6 || choose < 0) {
//
//            }
            switch (choose) {
                case 1:
                    studentList.listOfStudent();
                    break;

                case 2:
                    System.out.println("Input student ID: ");
                    String studentID = scanner.nextLine().trim();
                    System.out.println("Input student name: ");
                    String studentName = scanner.nextLine().trim();
                    System.out.println("Input student age: ");
                    int studentAge = scanner.nextInt();
                    System.out.println("Input medium score: ");
                    float mediumScore = scanner.nextFloat();
                    Student student = new Student(studentID, studentName, studentAge, mediumScore);
                    studentList.addNew(student);
                    break;

                case 3:
                    System.out.println("Input studentID need delete: ");
                    String stdID = scanner.nextLine().trim();
                    Student student1 = new Student(stdID);
                    studentList.delete(student1);
                    System.out.println("Delete successfully!");
                    break;

                case 4:
                    studentList.deleteAll();
                    System.out.println("Delete all student successfully!!!");
                    break;

                case 5:
                    System.out.println("Input student name need search: ");
                    String name = scanner.nextLine().trim();
                    System.out.println("This student need search: ");
                    studentList.searchByName(name);
                    break;

                case 6:
                    studentList.sortStudentByScore();
                    studentList.listOfStudent();
                    break;

                default:
                    System.out.print("Please re-choose: ");
                    choose = scanner.nextInt();
            }
        } while (choose != 0);

    }

    public static void menu() {
        System.out.print("Student Management:" + "\n" +
                "1. List of student" + "\n" +
                "2. Add student" + "\n" +
                "3. Delete student" + "\n" +
                "4. Delete all student" + "\n" +
                "5. Search student by name" + "\n" +
                "6. Sort student by medium score" + "\n" +
                "0. Exit" + "\n" +
                "Please choose option: " + "\n");
    }
}
