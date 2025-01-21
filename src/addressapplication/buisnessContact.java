/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressapplication;

/**
 *
 * @author seanb
 */
public class buisnessContact extends contact{
    private String company;

    public buisnessContact(String firstName, String surename, String email, String phoneNumber, String address, String company) {
        super(firstName, surename, email, phoneNumber, address);
        this.company = company;
    }

    public buisnessContact() {
    }
    
    

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCompany: " + company;
    }
    
    
}
