/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author madan
 */
public class Employee implements Serializable{
    
    private String firstName;
    private String lastName ;
    private String address;       
    private char   gender; 
    private PayScale payLevel;
    private Department department;
    private boolean isHead;
    private int id;
    static private int idCounter;
   
   public Employee(String firstName, String lastName, String address, char gender, PayScale payLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.payLevel = payLevel;
        this.id = idCounter++;
    }
    

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

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setIsHead(boolean isHead) {
        this.isHead = isHead;
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

    public Department getDepartment() {
        return department;
    }

    public boolean isIsHead() {
        return isHead;
    }

    public int getId() {
        return id;
    }
    
}
