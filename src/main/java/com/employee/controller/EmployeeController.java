package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        System.out.println("In service => "+employeeService);
        this.employeeService = employeeService;
    }

    @GetMapping()
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @PatchMapping("/{id}")
    public Employee updateEmployeeUsingPatch(@PathVariable Integer id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);

    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
         employeeService.deleteEmployee(id);
    }

    @RequestMapping("/ping")
    public String ping() {
        return "I am up :)";
    }
}
