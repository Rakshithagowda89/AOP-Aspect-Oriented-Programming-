package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public class EmployeeService {

    public void registerEmployee(int id, String name, double salary) {

        Employee employee = new Employee(id, name, salary);

        System.out.println("Employee registered successfully!");
        System.out.println(employee);
    }

    public void updateSalary(int id, double salary) {

        if (salary < 0) {
            throw new IllegalArgumentException(
                    "Salary cannot be negative"
            );
        }

        System.out.println(
                "Salary updated successfully for Employee ID: " + id
        );
        System.out.println("New Salary: " + salary);
    }

    public void displayEmployee() {

        System.out.println("Displaying employee details...");
    }
}
