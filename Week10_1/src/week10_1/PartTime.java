/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10_1;

/**
 *
 * @author nlakhal
 */
public class PartTime extends Teacher {
//Data Members

    private double dailyWages;
    private int daysWorked;

    public double getDailyWages() {
        return dailyWages;
    }

    public void setDailyWages(double dailyWages) {
        this.dailyWages = dailyWages;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public PartTime() {
        super();
    }

    public PartTime(String id, String name, String department, double dailyWages, int daysWorked) {
        super(id, name, department);
        this.dailyWages = dailyWages;
        this.daysWorked = daysWorked;
    }

    public String toString() {
        return super.toString() + "/nDaily Wges: " + this.getDailyWages() + "/nDays Worked: " + this.getDaysWorked() +"salary: " + this.calculateSalary();
    }

    public double calculateSalary(){
return this.dailyWages *this.daysWorked;
}
    
    
    
}
