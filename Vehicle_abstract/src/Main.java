/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nlakhal
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180);
        Vehicle bicycle = new Bicycle("Mountain Bike", 30);
 
        System.out.println(car.getName() + " - Max Speed: " + car.getMaxSpeed());
        car.accelerate();
        car.accelerate();
        car.brake();
 
        System.out.println(bicycle.getName() + " - Max Speed: " + bicycle.getMaxSpeed());
        bicycle.accelerate();
        bicycle.brake();
    }
}
