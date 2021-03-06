/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;

/**
 * Name: Employee
 * purpose: to be used to create Employees objects
 * @author madan
 * @version 1
 */
public class Employee implements Serializable{
    
    private String firstName;
    private String lastName ;
    private String address;       
    private char   gender; 
    private PayScale payLevel;
    private int id;
    static private int idCounter = 1;
    
   /** 
    * 
    * constructor for employee
    * 
     * @param firstName - first name of employee
     * @param lastName - last name of employee
     * @param address - address of employee 
     * @param gender - gender of employee
     * @param payLevel - pay level of employee
    **/
   public Employee(String firstName, String lastName, String address, char gender, PayScale payLevel ) {
       
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.payLevel = payLevel;
        this.id = idCounter;
        idCounter++;
    }
    

    //Setters and Getters 
    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPayLevel(PayScale payLevel) {
        this.payLevel = payLevel;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public char getGender() {
        return gender;
    }

    public PayScale getPayLevel() {
        return payLevel;
    }

    public int getId() {
        return id;
    }
    
}
