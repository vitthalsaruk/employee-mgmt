package com.employee;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {
    private EmployeeRepository employeeRepository;

    @Autowired
    public Application(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Application() {

    }

    public static void main(String[] arg) {
        SpringApplication.run(Application.class,arg);
    }

    @Override
    public void run(ApplicationArguments args) {
        employeeRepository.save(new Employee(101,"Vitthal",50000));
        employeeRepository.save(new Employee(102,"Sham",60000));
        employeeRepository.save(new Employee(103,"Pranav",70000));

    }
}

/*
  ToDo
  1. Add DAO layer
  2. Implement hibernet
  3. Design UI
  4. Connect with UI
 */
