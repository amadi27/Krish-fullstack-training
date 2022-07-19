package com.Amadi.training.salesmanager.repository;
import java.util.List;

import com.Amadi.training.salesmanager.model.Employee;

import java.util.ArrayList;

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
