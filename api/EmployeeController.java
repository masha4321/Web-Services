package com.example.restservice.api;

import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService empService = new EmployeeService();
    //GET
    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return empService.getAllEmployees();
    }

    @GetMapping("/employee/{empId}")
    public Employee getEmpById(@PathVariable int empId){
        return empService.getById(empId);
    }

    //POST
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        empService.addEmployee(employee);
        return employee;
    }
}
