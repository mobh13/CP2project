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
 * Name: Department
 * purpose: to be used to create Departments objects
 * @author madan
 * @version 1
 */
public class Department implements Serializable {

    private String name;
    private String location;
    private int id;
    static private int idCounter = 0;
    private Employee head;
    private ArrayList<Employee> listOfEmployees ;
    /** 
    * custom constructor 
     * @param name
     * @param location
    **/
    public Department(String name, String location) {

        this.id = idCounter;
        this.name = name;
        this.location = location;
        idCounter++;
        listOfEmployees = new ArrayList<>();
    }

   
    /** 
    * 
    *   Setters and Getters
    * 
    **/
    public static int getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public Employee getHead() {
        return head;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setIdCounter(int idCounter) {
        Department.idCounter = idCounter;
    }

    public void setHead(Employee head) {
        this.head = head;
    }
     public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

}
