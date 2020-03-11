package com.employee.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.employee.controller","com.employee.config"})
public class Application {
    public static void main(String[] arg) {
        SpringApplication.run(Application.class,arg);
    }
}
/**
 * ToDo
 * 1. Add DAO layer
 * 2. Implement hibernet
 * 3. Design UI
 * 4. Connect with UI
 */
