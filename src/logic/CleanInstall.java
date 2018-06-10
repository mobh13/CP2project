/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moosa Hammad
 * Purpose: Have a clean install populating program with sample data
 */
public class CleanInstall {

    static private String depName, depLoc, empFName, empLName, empAddress;
    static private char empGender;
    static private int empSalScal;
    
    /**
     * @Author: Moosa Hammad
     * Purpose: Take the data from a text file stored locally and then add it in
     * the program array lists and variables
     */

    public static void clean() {
        //clear all the departments and employees to prepare for a clean start
        try {
            HrSystem.getAllDepartments().get(0).getListOfEmployees().clear();
            HrSystem.getAllDepartments().clear();
            Department.setIdCounter(0);
            HrSystem.addDepartment("Unassigned Employees", "");
            //create a scanner object to scan the file containing the data
            Scanner input;
            Department.setIdCounter(1);
            Employee.setIdCounter(1);
            //initilize the scanner object with the class path as a source 
            

            input = new Scanner(new File("startup.txt"));

            //take every set of data and store it in a variable
            int noDepartments = Integer.parseInt(input.nextLine());
            for (int i = 0; i < noDepartments; i++) {
                depName = input.nextLine();
                depLoc = input.nextLine();
                int noEmployees = Integer.parseInt(input.nextLine());
                //add the department
                HrSystem.addDepartment(depName, depLoc);
                //loop for every employee in department
                for (int j = 0; j < noEmployees; j++) {
                    //take employee info from file
                    empFName = input.nextLine();
                    empLName = input.nextLine();
                    empGender = input.nextLine().charAt(0);
                    empAddress = input.nextLine();
                    empSalScal = Integer.parseInt(input.nextLine().trim());
                    //insert employee and assign to a department
                    Employee emp = new Employee(empFName, empLName, empAddress, empGender, HrSystem.getPayScales().get(empSalScal - 1));
                    //skip the unassigned department
                    HrSystem.addEmployee(emp, i + 1);
                }
            }
        } catch (FileNotFoundException ex) {
           Logger.getLogger(CleanInstall.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
