/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02;

/**
 *
 */
public class Customer {

    private String id;
    private String name;
    private String phone;
    private String city;

    public Customer() {
    }

    public Customer(String id, String name, String phone, String city) {
        this.setCity(city);
        this.setId(id);
        this.setName(name);
        this.setPhone(phone);
    }

    public String phoneNumberValidation() {
        boolean check = phone.matches("[0-9]+"); // Check if text contains only numbers
        if (check && phone.length() == 10) {
            return "Valid phone number";
        } else {
            return "Invalid phone number";
        }
    }

    public String toString() {
        return "\nID: " + this.getId() + "\nName: " + this.getName()
                + "Phone: " + this.getPhone() + "\nCity: " + this.getCity();
    }

    public void display() {
        System.out.println(this.toString());
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
