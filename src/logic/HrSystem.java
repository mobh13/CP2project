/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 * @author madan Name: Human Resource System 
 * @Purpose: Used to behave as the
 * management tool for storing the structure of the system.
 * @version 2
 */
public class HrSystem {

    private static ArrayList<Department> allDepartments;
    private static ArrayList<PayScale> payScales;

    public static void setAllDepartments(ArrayList<Department> allDepartments) {
        HrSystem.allDepartments = allDepartments;
    }

    public static void setPayScales(ArrayList<PayScale> payScales) {
        HrSystem.payScales = payScales;
    }

    /**
     * @author Moosa
     * @purpose creating a new employee object using parameters and adding it to dep unassigned emp
     * @param firstName
     * @param lastName
     * @param address
     * @param gender
     * @param payLevel
     * @return empID
     */
    public static int addEmployee(String firstName, String lastName, String address, char gender, int payLevel) {
        //creating an emp object with the coresponding pay scale to the the appropiat department
        PayScale ps1 = payScales.get(payLevel);
        Employee newEmp = new Employee(firstName, lastName, address, gender, ps1);
        HrSystem.getAllDepartments().get(0).getListOfEmployees().add(newEmp);
        return newEmp.getId();
    }

    public static Employee addEmployee(Employee emp, int i) {
        allDepartments.get(i).getListOfEmployees().add(emp);
        return emp;
    }

    public HrSystem() {

        allDepartments = new ArrayList<>();
        payScales = new ArrayList<>();
    }

    /**
     * @author Mohammad Madan 
     * @Purpose creating a new department object
     * @param name
     * @param location
     * @return depID
     * @throws NullPointerException
     */
    public static int addDepartment(String name, String location) {
        //creating an dep object with the data passed to add it to the system.
         Department newDep = null;
        try {
             newDep = new Department(name, location);
            allDepartments.add(newDep);
        } catch (NullPointerException ex) {
            throw new NullPointerException("Cannot insert empty values in the employee. Error: " + ex);
        }
        
        return newDep.getId();

    }

    public static ArrayList<Department> getAllDepartments() {
        return allDepartments;
    }

    public static ArrayList<PayScale> getPayScales() {
        return payScales;
    }

    /**
     * @author: Abdulla Ali 
     * @purpose: assigning an employee as head of a department
     * @param empId
     * @param depId
     *  @throws NullPointerException
     */
    public static void designateHead(int empId, int depId) {
        //try and catch clause for null values and assign passed parameters to head fro dep
        try {
            getAllDepartments().get(depId).setHead(getAllDepartments().get(depId).getListOfEmployees().get(empId));
        } catch (NullPointerException ex) {
            throw new NullPointerException("Cannot insert empty values in the employee. Error: " + ex);
        }
    }

    /**
     * @author: Moosa Hammad 
     * @Purpose: changing the details of a specific employee
     * @param indx
     * @param f_name
     * @param l_name
     * @param address
     * @param gender
     * @param payScale_indx
     * @param depIndx
     * @throws NullPointerException
     */
    public static void editEmployee(int indx, String f_name, String l_name, String address, char gender, int payScale_indx, int depIndx) {
        //a try and catch clause to catch any null values being passed to the method
        try {
            //getting all the data and updating it to the employee
            getAllDepartments().get(depIndx).getListOfEmployees().get(indx).setFirstName(f_name);
            getAllDepartments().get(depIndx).getListOfEmployees().get(indx).setLastName(l_name);
            getAllDepartments().get(depIndx).getListOfEmployees().get(indx).setAddress(address);
            getAllDepartments().get(depIndx).getListOfEmployees().get(indx).setGender(gender);
            getAllDepartments().get(depIndx).getListOfEmployees().get(indx).setPayLevel(payScales.get(payScale_indx));
        } catch (NullPointerException ex) {
            throw new NullPointerException("Cannot insert empty values in the employee. Error: " + ex);
        }

    }

    /**
     * @author: abdulla ali
     * @purpose: to search for a department and delete it from system
     * @param dep
     * @return boolean found
     */
    public static boolean deleteDepartment(Department dep) {
        //boolean to control the loop and to retunr the value
        boolean found = false;
        //loop to search for department in the list based on ID and name and delete it from systen.
        for (int i = 0; i < allDepartments.size() && found == false; i++) {
            if (allDepartments.get(i).getId() == dep.getId()
                    && allDepartments.get(i).getName().equalsIgnoreCase(dep.getName())) {
                allDepartments.remove(i);
                found = true;
            }
        }
        return found;
    }

}
