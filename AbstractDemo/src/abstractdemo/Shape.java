package abstractdemo;

/**
 * make the class abstract because You don’t want to allow creation of a “Shape”
 * calculateArea method only make sense for particular shapes like square, circle et.
 */
public abstract class Shape { //Abstract - it can’t be instantiated (step 1)

    public Shape() {
        }
/*  We can add a constructor to an abstract class in Java. 
    While abstract classes cannot be instantiated directly, they can have constructors. 
    These constructors are not called directly but are instead used during the instantiation of non-abstract subclasses.
 */   
    
    private String name = "No Name"; //member attribute
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public abstract double calculateArea(); // abstract method : no body is added 
    
    
    @Override
    public String toString() {
        return "Shape{" + "name=" + name + '}';
    }

    
    
    
}
