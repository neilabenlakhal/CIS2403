/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10_1;

/**
 *
 * @author nlakhal
 */
public abstract class Teacher {

    public Teacher() {
    }
    
   protected  String ID;
   protected String name;
   protected String departement;

    public Teacher(String ID, String name, String departement) {
        this.ID = ID;
        this.name = name;
        this.departement = departement;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Teacher{" + "ID=" + ID + ", name=" + name + ", departement=" + departement + '}';
    }
    
    public void display()
    { System.out.println (this.toString());
    }
   
 public abstract double calculateSalary();
   
 
}
