/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9_2;

/**
 *
 * @author nlakhal
 */
public class FullTime extends Teacher {
    
    private double basicSalary;
    private double allowance;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public FullTime() {
        super();
    }

    public FullTime(double basicSalary, double allowance, String id, String name, String department) {
        super (id,name,department);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return super.toString()+" FullTime{" + "basicSalary=" + basicSalary + ", allowance=" + allowance + '}';
    }
    
    
    
    
    
}
