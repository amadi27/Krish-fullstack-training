package com.Amadi.training.salesmanager.service;

import com.Amadi.training.salesmanager.model.Employee;
import com.Amadi.training.salesmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        System.out.println("Overloaded Constructer");
        this.employeeRepository = employeeRepository;
    }

    public EmployeeServiceImpl() {
        System.out.println("Default Constructer");
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("Setter executed");
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
