/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;


import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CleanInstall {

    static private String depName, depLoc, empFName, empLName, empAddress;
    static private char empGender;
    static private int empSalScal;

    public static void clean() {
        //clear all the departments and employees to prepare for a clean start
        HrSystem.getAllDepartments().clear();
        HrSystem.getAllEmployees().clear();
        //create a scanner object to scan the file containing the data
        Scanner input;
        Department.setIdCounter(1);
        Employee.setIdCounter(1);
        //initilize the scanner object with the class path as a source 
        input = new Scanner(CleanInstall.class.getResourceAsStream("/resources/startup.txt"));
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
                PayScale ps = new PayScale();
                //insert employee and assign to a department
                HrSystem.addEmployee(empFName, empLName, empAddress, empGender, ps);
            }

        }
    }
}
