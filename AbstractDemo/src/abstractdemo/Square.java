package abstractdemo;

/**
 *
 */
public class Square extends Shape{
    private double length =23;
    
    public Square(double length){
        super.setName("Square");
        this.length = length;
    }
 
    @Override
    public double calculateArea() { //concrete method
        return length * length;
    }
  
}
