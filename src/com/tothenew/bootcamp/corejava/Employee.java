package com.tothenew.bootcamp.corejava;

public class Employee {

    Integer id;
    String name;
    String department;

    public Employee() { // Default constructor
    }

    public Employee(Integer id, String name, String department) { // Parametrized constructor
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(Employee employee) { // Copy constructor
        this.id = employee.id;
        this.name = employee.name;
        this.department = employee.department;
    }
}
