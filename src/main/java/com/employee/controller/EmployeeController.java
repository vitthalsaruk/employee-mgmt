package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    EmployeeService employeeService = new EmployeeServiceImpl();

    /**
     * To get all employee details.
     * @return
     */
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    /**
     * To get particular employee
     * @param id
     * @return
     */
    @GetMapping()
    public Employee getEmployee(@RequestParam int id) {
        return employeeService.getEmployee(id);
    }

    /**
     * To add employee
     * @param employee
     * @return
     */
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PatchMapping("/update")
    public List<Employee> updateEmployee(@RequestParam int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/delete")
    public Employee deleteEmployee(@RequestParam int id) {
        return employeeService.deleteEmployee(id);
    }

    @RequestMapping(method = RequestMethod.OPTIONS, value = "/ping", produces = "text/plain")
    public String ping() {
        return "I am up :)";
    }
}
