/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hct.ae.Lab04_Ex01_bidirectional;

import hct.ae.Lab04_Ex01_unidirectional.*;
import java.util.Scanner;

/**
 *
 * @author nlakhal
 */

        
public class Main {

    public static void main(String[] args) {
        // Create an instance of the class Student
        Student st1 = new Student("123", "John Doe", "Computer Science", 3.8);

        // Create an instance of the class HCTProfile and assign st1 as its owner
        HCTProfile profile1 = new HCTProfile(1, "TypeA", "2024-02-12");
        
        profile1.setStudent(st1);
        
        // Display the details of the Student and associated HCTProfile
        st1.display();
        profile1.display();
    }
}


    
