/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex02_unidirectionalTeachertoStudent;

/**
 *
 * @author neila
 */
public class Student {
    private String studentId;
    private String studentName;

    // Constructors
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    

    // toString method
    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nStudent Name: " + studentName;  
    }
}
