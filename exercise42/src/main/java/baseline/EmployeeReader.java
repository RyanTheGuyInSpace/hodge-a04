/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class EmployeeReader {
    public LinkedList<Employee> employees = new LinkedList<>();
    private BufferedReader reader;
    private BufferedWriter writer;


    /**
     * Reads the specified file for employees and stores them into the employees list.
     * @param fileName The name of the file to read Employees from.
     */
    public void readEmployees(String fileName) {
        try {
            reader = new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();
            while(line != null) {
                String[] employeeInfo = new String[3];

                employeeInfo = line.split(",");

                Employee employee = new Employee();

                employee.lastName = employeeInfo[0];
                employee.firstName = employeeInfo[1];
                employee.salary = Integer.parseInt(employeeInfo[2]);

                saveEmployee(employee);

                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
            return;
        }
    }

    /**
     * Saves the specified employee to the employees list.
     * @param employee The employee to add to the employees list.
     */
    public void saveEmployee(Employee employee) {
        this.employees.add(employee);
    }

    /**
     * Writes all employees to the console and the specified file as a formatted table.
     * @param fileName The name of the file to write the formatted table to.
     */
    public void writeEmployees(String fileName) {
        System.out.printf("%-10s %-10s %-10s%n", "Last", "First", "Salary");
        System.out.println("----------------------------");

        for (int i = 0; i < employees.size(); i++) {
            Employee current = employees.get(i);

            System.out.printf("%-10s %-10s %-10s%n", current.lastName, current.firstName, current.salary);
        }
    }
}
