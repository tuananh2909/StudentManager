package com.ntqsolution.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String studentID;
    private String name;
    private int age;
    private float mediumScore;

    public Student(String studentID, String name, int age, float mediumScore) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.mediumScore = mediumScore;
    }

    public Student(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID: " + studentID +
                ",name: " + name +
                ",age: " + age +
                ",mediumScore: " + mediumScore +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediumScore, name, age, mediumScore);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return Objects.equals(studentID, other.studentID);
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }
}
