package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees(){

        Employee emp1 = new Employee(1,"Maryia", "Parshykava",
                new Address(123, "Java Street","Montreal", "QC", "Canada"),
                "Back-End Developper", 4567586);

        Employee emp2 = new Employee(2,"Sponge", "Bob",
                new Address(123, "Krusty Street","Bikini Bottom", "Ocean", "Bikini Bottom Country"),
                "Cook/burger flipper", 1238596);

        Employee emp3 = new Employee(3,"Patrick", "Star",
                new Address(123, "Under His Rock Street","Bikini Bottom", "Ocean", "Bikini Bottom Country"),
                "Too Dumb to Find A Job", 74859623);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public Employee getById(int empId){
        for(Employee emp : employees){
            if (emp.getEmpId() == empId){
                return emp;
            }
        }
        return null;
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }
}