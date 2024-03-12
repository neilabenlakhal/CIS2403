package abstracttest;

/**
 *
 */
public abstract class Shape {

    private String name = "No Shape";

    public abstract double getArea(int length);
    
    @Override
    public String toString(){
        return "Shape is " + name;
    }
}
