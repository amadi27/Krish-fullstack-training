package com.Amadi.training.salesmanager.repository;

import com.Amadi.training.salesmanager.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmployeeName("Amadi");
        employee.setEmployeeLocation("Galle");
        employees.add(employee);

        return employees;

    }

}
