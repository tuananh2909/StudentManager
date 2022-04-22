package com.ntqsolution.controller;

import com.ntqsolution.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentList {
    private List<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    //Add new student
    public void addNew(Student student) {
        this.studentList.add(student);
    }

    //List of student
    public void listOfStudent() {
        if (!isEmptyList()) {
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
            System.err.println("List of student is empty!!!");
        }
    }

    //Delete all student
    public void deleteAll() {
        this.studentList.removeAll(studentList);
    }

    //Delete student by studentID
    public void delete(Student student) {
        this.studentList.remove(student);
    }

    //Search student by name
    public void searchByName(String name) {
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                System.out.println(student);
            }
        }
    }

    //Sort increase student by medium score
    public void sortStudentByScore() {
        this.studentList.sort(new Comparator<Student>() {
            @Override
            //CompareByScore
            public int compare(Student student1, Student student2) {
                return Float.compare(student1.getMediumScore(), student2.getMediumScore());
            }
        });
    }

    //check student existed
//    public boolean isStudentExist(Student student) {
//        return this.studentList.contains(student);
//    }

    //check empty
    public boolean isEmptyList() {
        return this.studentList.isEmpty();
    }
}
