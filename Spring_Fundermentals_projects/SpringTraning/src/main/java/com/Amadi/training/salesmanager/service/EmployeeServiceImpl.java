package com.Amadi.training.salesmanager.service;

import com.Amadi.training.salesmanager.model.Employee;
import com.Amadi.training.salesmanager.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

//    EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //    create setter for above reference
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //    create getter for above reference
    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
