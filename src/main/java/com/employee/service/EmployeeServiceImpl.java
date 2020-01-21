package com.employee.service;

import com.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    @Override
    public Employee getEmployee(int id) {
        for(Employee employee:employeeList) {
            if(employee.getId()==id)
                return employee;
        }
        return null;
    }

    @Override
    public Employee addEmployee(Employee e) {
        employeeList.add(e);
        return e;
    }

    @Override
    public List<Employee> updateEmployee(int id, Employee employee) {
        for(Employee emp:employeeList) {
            if(emp.getId()==id){
                employeeList.remove(emp);
                employeeList.add(employee);
                return employeeList;
            }
        }
        return null;
    }

    @Override
    public Employee deleteEmployee(int id) {
        for(Employee emp:employeeList) {
            if(emp.getId()==id){
                employeeList.remove(emp);
                return emp;
            }
        }
        return null;
    }
}
