package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllemps() {
        List<Employee> employeeList = employeeService.getAllEmployee();
        return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee() {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setEmpname("Kalai");
        return new ResponseEntity<>(employeeService.createEmployee(emp), HttpStatus.CREATED);
    }
}
