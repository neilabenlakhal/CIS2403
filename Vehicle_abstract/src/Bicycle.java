/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nlakhal
 */
class Bicycle extends Vehicle {
    private int currentSpeed;
 
    public Bicycle(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.currentSpeed = 0;
    }
 
    @Override
    void accelerate() {
        if (currentSpeed < maxSpeed)
            currentSpeed  =currentSpeed + 5;
        System.out.println("Accelerating... Current speed: " + currentSpeed);
    }
 
    @Override
    void brake() {
        if (currentSpeed > 0)
            currentSpeed = currentSpeed-5;
        System.out.println("Braking... Current speed: " + currentSpeed);
    }
}
