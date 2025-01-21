/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressapplication;

import java.io.Serializable;

/**
 *
 * @author seanb
 */
public class contact implements Serializable{
    protected String firstName, surename, email, phoneNumber, address;

    public contact(String firstName, String surename, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.surename = surename;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public contact() {
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact Info\n"
                + "First Name: " + firstName + 
                "\nSurname: " + surename + 
                "\nEmail: " + email + 
                " \nPhone Number: " + phoneNumber + 
                "\nAddress: " + address;
    }
    
    
}
