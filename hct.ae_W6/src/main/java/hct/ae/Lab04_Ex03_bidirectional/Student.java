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

public class Student {
    private String studentId;
    private String studentName;
    private ArrayList<Course> regCourses;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.regCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        regCourses.add(course);
    }

    public void dropCourse(Course course) {
        regCourses.remove(course);
    }

    public String toString() {
        return "Student ID: " + studentId + ", Student Name: " + studentName;
    }

    public void displayRegisteredCourses() {
        System.out.println(this + " is registered in the following courses:");
        for (Course course : regCourses) {
            System.out.println("- " + course);
        }
    }
}
