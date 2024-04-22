/*
 */
package stackextraquestion;

/**
 *Write a java program for UAE Emirates ID Office to complete the tasks described in the questions below:
(This task should be done using the methods that are available in the Java Stack class) 

The program should 
1.	Create a java class and name it  EmiratesIDStackOperation. 
2.	Add an attribute named EmiratesIDNumber of type String, 
*               a Stack attribute named ST in the  EmiratesIDStackOperation class and
*               add a constructor in the class that sets the value of the EmiratesIDNumber attribute.
3.	Add a method named storeData() in EmiratesIDStackOperation class that reads each character of the EmiratesIDNumber and store it in the stack ST. 
4.	Add a method named resdData() in the EmiratesIDStackOperation class that get the values from the stack ST and find out number of characters  space and – (hyphen) are there in the EmiratesIDNumber and display it. 
 * 
 * 
 * @author nlakhal
 */
import java.util.Stack; //step 0 : import the package
public class EmiratesIDStackOperation { //1 - Create a java class and name it  EmiratesIDStackOperation. 

   public String EmiratesIDNumber;
   public Stack ST = new Stack(); //stack with no datatype
   
   
    public EmiratesIDStackOperation(String eid) { //add a constructor in the class that sets the value of the EmiratesIDNumber attribute.
        EmiratesIDNumber = eid;
    }
   
   public void storeData(){ //store EID as a stack
        for(int i=0;i< EmiratesIDNumber.length();i++){
            ST.push(EmiratesIDNumber.charAt(i));
        }
    }
   public void readData(){  //count the number of spaces and hyphens
        int countSP=0;
        int countHY=0;
      
        while(!ST.isEmpty()){
            String c = ST.pop().toString();
            if(c.equalsIgnoreCase(" "))
            {
                countSP++;
            }
            if(c.equalsIgnoreCase("-"))
            {
                countHY++;
            }
        }
        System.out.println("Number of space : "+ countSP);
        System.out.println("Number of hyphen : "+ countHY);
    }
}


