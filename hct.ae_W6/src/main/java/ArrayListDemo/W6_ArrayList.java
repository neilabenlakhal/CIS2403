/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayListDemo;

/**
 *
 * @author nlakhal
 */
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 */
import java.util.ArrayList;

import java.util.*;

/**
 *
 * @author neila
 *
 */
public class W6_ArrayList {

    public static void main(String[] args) {

// 1. Arrays: Fixed size collections
        String[] names2= new String[25];
        String[] names = {"hend", "Rafeea", "Mariam"}; // 3 items 

        System.out.println(names[0]); //display hend

        System.out.println(names[2]);//Mariam

        System.out.println(names.length); //the number of items in my Array : 3

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);

        }

        int[] numbersArray = new int[5];

// 3. Initializing Arrays
        numbersArray[0] = 10;

        numbersArray[1] = 20;

        numbersArray[2] = 10;

        numbersArray[3] = 20;

        numbersArray[4] = 10;

        // 2. ArrayLists: Dynamic size collections | size can change when we add items
        ArrayList<Integer> numbersList = new ArrayList<>();
        //int[] numbersList= new Int[25];
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Boolean> answers = new ArrayList<>();
        
        ArrayList<Double> grades = new ArrayList<>();
   
        
        grades.add(95.5);
        grades.add(88.7);
         grades.add(88.7);

        
        for (double g : grades) {

            System.out.println("the student grade is : " + g);

        }
        
        
        

        namesList.add("hend"); //names[0]="hend
        namesList.add("Rafeea");
        namesList.add("Mariam");

        // 4. Initializing ArrayLists
        numbersList.add(10); //prefdefined method to add items 

        numbersList.add(20);

        // Sample Code - Displaying Arrays
        for (int i = 0; i < numbersArray.length; i++) {

            System.out.println("Number: " + numbersArray[i]);

        }

        //second method
        System.out.println("Array Example:");

        for (int num : numbersList) {

            System.out.println("Number: " + num);

        }

        // Sample Code - Displaying ArrayList
        for (int i = 0; i < numbersList.size(); i++) {

            System.out.println("Number: " + numbersArray[i]);

        }

        //second method
        System.out.println("Array Example:");

        for (int num : numbersArray) {

            System.out.println("Number: " + num);

        }

        // Creating an ArrayList of Integers
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);

        intList.add(2);

        // Creating an array of Strings
        String[] stringArray = new String[]{"Java", "Programming"};

        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Hello");

        stringList.add("World");

        // Tips for Beginners: Choose based on fixed or dynamic size needs
    }

}
