package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee emp);

    List<Employee> getAllEmployee();
}
