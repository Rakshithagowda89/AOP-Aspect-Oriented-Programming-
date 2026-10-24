package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {

        SpringApplication.run(
                EmployeeApplication.class, args
        );
    }

    @Override
    public void run(String... args) {

        System.out.println("========== EMPLOYEE MANAGEMENT SYSTEM ==========");

        employeeService.registerEmployee(101, "Artha", 30000);

        employeeService.displayEmployee();
        
        try {
            employeeService.updateSalary(101, -5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception handled successfully: " + e.getMessage());
        }

        System.out.println();
        System.out.println("========== APPLICATION FINISHED ==========");
    }
}

