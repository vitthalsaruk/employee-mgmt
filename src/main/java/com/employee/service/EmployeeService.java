package com.employee.service;

import com.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployee(int id);
    public Employee addEmployee(Employee employee);
    public List<Employee> updateEmployee(int id, Employee employee);
    public Employee deleteEmployee(int id);
}
