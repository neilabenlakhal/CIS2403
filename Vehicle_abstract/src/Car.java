

/**
 *
 * @author nlakhal
 */
class Car extends Vehicle {
    private int currentSpeed;
 
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
        this.currentSpeed = 0;
    }
 
    @Override
    void accelerate() {
        if (currentSpeed < maxSpeed)
            currentSpeed = currentSpeed+  10;
        System.out.println("Accelerating... Current speed: " + currentSpeed);
    }
 
    @Override
    void brake() {
        if (currentSpeed > 0)
            currentSpeed = currentSpeed -10;
        System.out.println("Braking... Current speed: " + currentSpeed);
    }
}

