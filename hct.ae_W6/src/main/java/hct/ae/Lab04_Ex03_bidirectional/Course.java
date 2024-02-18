/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex03_bidirectional;

/**
 *
 * @author neila
 */
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private ArrayList<Student> regStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.regStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        regStudents.add(student);
    }

    public void removeStudent(Student student) {
        regStudents.remove(student);
    }

    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }

    public void displayRegisteredStudents() {
        System.out.println(this + " has the following registered students:");
        for (Student student : regStudents) {
            System.out.println("- " + student);
        }
    }
}

