/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex02_bidirectional;

/**
 *
 * @author neila
 */
public class Student {
    private String studentId;
    private String studentName;
    private Teacher advisor;  // Step 1: Add a new data member of the type Teacher and name it advisor

    // Constructors
    public Student(String studentId, String studentName, Teacher advisor) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.advisor = advisor;  // Step 3: Update the constructors and add the new member as a parameter
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

    public Teacher getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Teacher advisor) {
        this.advisor = advisor;  // Step 2: Create setters and getters for the new member
    }

    // toString method
    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nStudent Name: " + studentName +
               "\nAdvisor: " + advisor.getTeacherName();  // Step 4: Update the toString method
    }
}
