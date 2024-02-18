/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hct.ae.Lab04_Ex02_unidirectionalTeachertoStudent;


/**
 *
 * @author neila
 */

    /**
     */
public class MainTeacherToStudent {
    public static void main(String[] args) {
        // Create a teacher
        Teacher teacher = new Teacher("T1", "Mr.S");

        // Create students and add them to the teacher's advisees
        Student student1 = new Student("S1", "A");
        Student student2 = new Student("S2", "B");

        teacher.addAdvisee(student1);
        teacher.addAdvisee(student2);

        // Display the teacher's advisees
        teacher.displayAdvisees();
    }
}
  

