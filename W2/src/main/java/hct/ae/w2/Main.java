/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.w2;

/**
 *
 * @author nlakhal
 */
public class Main {

     // Example usage
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person1 = new Person("Sarra", 20, "HO123456");

        // Accessing attributes (via public getter methods)
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("ID Number: " + person1.getIdNumber());

        // Using toString method for easy printing
        System.out.println(person1);
    }
}
