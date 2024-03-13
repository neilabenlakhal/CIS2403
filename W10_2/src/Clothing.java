/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 */
public class Clothing extends Product {//Lab 06 Task 1

    private String size;
    private String material;
    // you can add multiple attributes here  Lab 06 Task 2

    //Lab 06 Task 3
    public Clothing() {
        super();
    }

   
     @Override
    public double calculateRetailPrice() {
        double total_price = price + price * vat;
        double extra_Charge = total_price*0.03; // 3% charge
        return (total_price+extra_Charge);
      //  return (price + price * vat) * 1.03; // Extra charge for clothing
    }
    
    public Clothing(String code, double price, int stock, double vat, String size, String material) {
        super(code, price, stock, vat);
        this.setMaterial(material);// this.material=material;
        this.setSize(size);//this.size=size;
    }

    //Lab 06 Task 04
    public String toString() {
        return super.toString() + "\nSize: " + this.getSize() + "\nMaterial: " + this.getMaterial();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
