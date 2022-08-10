package com.example.demo.serviceImpl;

import com.example.demo.model.Employee;
import com.example.demo.repo.Emprepo;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private Emprepo emprepo;

    @Override
    public Employee createEmployee(Employee emp) {
        return emprepo.save(emp);
    }

    @Override
    @Cacheable("employees")
    public List<Employee> getAllEmployee() {
        return emprepo.findAll();
    }
}
