/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex02_unidirectionalStudenttoTeacher;

/**
 *
 * @author neila
 */
public class MainStudentToTeacher {
    public static void main(String[] args) {
        // Create a teacher
        Teacher teacher = new Teacher("T1", "Mr.");

        // Create students and assign the teacher as their advisor
        Student student1 = new Student("S1", "A", teacher);
        Student student2 = new Student("S2", "J", teacher);

        // Display the advisor for each student
        System.out.println(student1.getAdvisor().getTeacherName());
        System.out.println(student2.getAdvisor().getTeacherName());
    }
}
