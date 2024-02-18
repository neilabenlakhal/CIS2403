/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hct.ae.Lab04_Ex02_bidirectional;

/**
 *
 * @author neila
 */

    /**
     */
    public class Main {
    public static void main(String[] args) {
        // Step 5: In the driver class, create a new instance of the class Teacher and call it tch1.
        Teacher tch1 = new Teacher("T1", "Mr.");

        // Step 6: Create a new instance of the class Student, name it stu1, and assign tch1 as the advisor.
        Student stu1 = new Student("S1", "M", tch1);

        // Step 7: Display the student information to show the assigned advisor name.
        System.out.println(stu1);

        // Step 8: Run the application.

        // Additional steps for Teacher class
        // Step 7: In the driver class, create a new instance of the Teacher class and name it tch10.
        Teacher tch10 = new Teacher("T10", "Mr.");

        // Step 8: Create 4 instances of the Student class and add them one by one to tch10 list of advisees.
        Student stu2 = new Student("S2", "A", tch10);
        Student stu3 = new Student("S3", "B", tch10);
        Student stu4 = new Student("S4", "AC", tch10);

        tch10.addAdvisee(stu2);
        tch10.addAdvisee(stu3);
        tch10.addAdvisee(stu4);

        // Display tch10's advisees
        tch10.displayAdvisees();
    }
}

    

