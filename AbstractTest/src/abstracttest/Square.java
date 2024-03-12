package abstracttest;

/**
 *
 */
public class Square extends Shape {

    @Override
    public double getArea(int length) {
        return length * length;
    }

    @Override
    public String toString() {
        return "This is a square!";
    }
}
