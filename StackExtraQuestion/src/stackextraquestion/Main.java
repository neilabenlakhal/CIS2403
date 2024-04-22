/*
Write a java program for UAE Emirates ID Office to complete the tasks described in the questions below:
(This task should be done using the methods that are available in the Java Stack class) 

The program should 
1.	Create a java class and name it  EmiratesIDStackOperation. 
2.	Add an attribute named EmiratesIDNumber of type String, a Stack attribute named ST in the EmiratesIDStackOperation class and add a constructor in the class that sets the value of the EmiratesIDNumber attribute.
3.	Add a method named storeData() in EmiratesIDStackOperation class that reads each character of the EmiratesIDNumber and store it in the stack ST. 
4.	Add a method named resdData() in the EmiratesIDStackOperation class that get the values from the stack ST and find out number of characters  space and – (hyphen) are there in the EmiratesIDNumber and display it. 

 */
package stackextraquestion;

/**
 *
 * @author nlakhal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
EmiratesIDStackOperation eid = new EmiratesIDStackOperation("12-345 666 67 ");
eid.storeData(); //store the eid as a stack
eid.readData();// count and display the number of hypens and spaces.


    }
    
}
