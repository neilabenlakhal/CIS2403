/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nlakhal
 */
public abstract class Vehicle {
    protected String name;
    protected int maxSpeed;
 
    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
 
    abstract void accelerate();
 
    abstract void brake();
 
    public String getName() {
        return name;
    }
 
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
