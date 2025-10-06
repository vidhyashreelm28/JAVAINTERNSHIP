package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Employee;

//Utility class that provides common operations on Employee objects.

public class EmployeeUtilities {

    //Calculates and returns annual salary of an employee.
    public double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }

    //Increases the salary of an employee by a given percentage.
    public void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary increased by " + percentage + "%. New salary: " + newSalary);
    }

    //Displays complete employee information.
    public void showEmployeeDetails(Employee employee) {
        employee.displayInfo();
        System.out.println("Annual Salary: " + calculateAnnualSalary(employee));
        System.out.println("---------------------------------------");
    }
}
