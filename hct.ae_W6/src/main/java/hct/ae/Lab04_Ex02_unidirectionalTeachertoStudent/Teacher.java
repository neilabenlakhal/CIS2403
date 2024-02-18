/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex02_unidirectionalTeachertoStudent;

/**
 *
 * @author neila
 * 
 * Unidirectional Relationship (Teacher → Student):

In this case, a Teacher has a reference to Student, but a Student does not have a direct reference to the Teacher.
 *

 */

import java.util.ArrayList; //import this

//// Teacher class with unidirectional relationship to Student


public class Teacher {

    private String teacherId;
    private String teacherName;
    private ArrayList<Student> advisees;  // Step 1: Add a new data member of the type ArrayList<Student> and name it advisees

    // Constructors
    public Teacher(String teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.advisees = new ArrayList<>();  // Step 3: Initialize the advisees Arraylist in all constructors
    }

    // Getters and Setters
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public ArrayList<Student> getAdvisees() {
        return advisees;
    }

    // Methods to manage advisees
    public void addAdvisee(Student student) {
        advisees.add(student);  // Step 4: Define a method to add a student to the list
    }

    public void removeAdvisee(Student student) {
        advisees.remove(student);  // Step 5: Define a method to remove a student from the list
    }

    public void displayAdvisees() { // Step 6: Define a method to display the advisees ID’s
        System.out.println("Advisees for " + teacherName + ":");
        for (int i = 0; i < advisees.size(); i++) {
            Student student = advisees.get(i);
            System.out.println("- " + student.getStudentName());
        }
    }
}
