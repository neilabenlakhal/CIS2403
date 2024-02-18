/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex02_unidirectionalStudenttoTeacher;

/**
 *
 * @author neila
 */
// Student class with unidirectional relationship to Teacher
public class Student {
    private String studentId;
    private String studentName;
    private Teacher advisor;

    // Constructor
    public Student(String studentId, String studentName, Teacher advisor) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.advisor = advisor;
    }

    // Getters and Setters for studentId, studentName, and advisor

    // Other methods specific to Student
    public String getStudentName() {
        return studentName;
    }

    public Teacher getAdvisor() {
        return advisor;
    }
}

