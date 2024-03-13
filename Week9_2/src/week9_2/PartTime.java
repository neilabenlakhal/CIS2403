/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9_2;

/**
 *
 * @author nlakhal
 */
public class PartTime extends Teacher {
//Data Members

    private double dailyWages;
    private int daysWorked;

    public PartTime() {
        super();
    }

    public PartTime(String id, String name, String department, double dailyWages, int daysWorked) {
        super(id, name, department);
        this.dailyWages = dailyWages;
        this.daysWorked = daysWorked;
    }

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

    @Override
    public String toString() {
        return super.toString() + "PartTime{" + "dailyWages=" + dailyWages + ", daysWorked=" + daysWorked + '}';
    }

}
