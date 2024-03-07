/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02;

/**
 *
 */
public class Electronics extends Product { //Lab 06 Task 1

    private String os;
    private String batteryType;
    // you can add multiple attributes here  Lab 06 Task 2

    //Lab 06 Task 3
    public Electronics() {
        super();
    }

    public Electronics(String code, double price, int stock, double vat, String os, String batteryType) {
        super(code, price, stock, vat);
        this.setBatteryType(batteryType); //this.batteryType = batteryType;
        this.setOs(os);
    }

    //Lab 06 Task 04
    public String toString() {
        return super.toString() + "\nOS: " + this.getOs() + "\nBattery: " + this.getBatteryType();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

}
