/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week9_2;

/**
 *
 * @author nlakhal
 */
public class Week9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FullTime FT1= new FullTime(300.5, 100.3, "ID1", "name", "CIS");
        PartTime PT1= new PartTime();
        PT1.setDailyWages(12);
        PT1.setDaysWorked(1);
        
        PT1.display();
        FT1.display();
        
        
        
    }
    
}
