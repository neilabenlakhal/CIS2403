/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9_2;

/**
 *
 * @author nlakhal
 */
class Teacher {

    protected String id;
    protected String name;
    protected String department;

    public Teacher() {
    }

    public Teacher(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", department=" + department + '}';
    }

    public void display(){
    System.out.println(this.toString());
}
}