package com.yourname.assignment.employees;

//The Employee class represents a general employee,It demonstrates the use of access modifiers and encapsulation.

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //Getter and Setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    //Getter and Setter for employeeId 
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    //Getter and Setter for salary
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    //Displays basic employee information
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
