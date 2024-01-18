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
        Product second_product = new Product("CB121", 1.5, 0);
        second_product.checkAvaiability();
        first_product.checkAvaiability();
        
        
    }
    
}
