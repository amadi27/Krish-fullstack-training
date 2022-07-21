package com.Amadi.training.salesmanager.service;

import com.Amadi.training.salesmanager.model.Employee;
import com.Amadi.training.salesmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
        System.out.println("Default constructor executed");
    }

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        System.out.println("Overloaded constructor executed");
        this.employeeRepository = employeeRepository;
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println("Setter Injection Fired");
    }


    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
