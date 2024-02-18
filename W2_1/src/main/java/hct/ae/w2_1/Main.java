/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hct.ae.w2_1;

/**
 *
 * @author nlakhal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // code = CB121   price= 1.5 stock=12
        
        Product first_product =new Product(); //default  
        Product second_product = new Product("CB121", 1.5, 0,5,"book");
   
        
        Product third = new Product ("CB111", 3.5,100,3,"pencil");
        
        Product milk = new Product ("12", 7.3, 12,6,"milk");
        
second_product.checkAvailability2();

System.out.println(second_product.checkAvailability());

second_product.display();
milk.checkAvailability(); // check the avaiability of the product milk
milk.display(); // display the information of the product milk
    }
    
}
