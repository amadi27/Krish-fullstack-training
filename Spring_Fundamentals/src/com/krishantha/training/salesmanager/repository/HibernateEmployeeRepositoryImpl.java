package com.krishantha.training.salesmanager.repository;
import java.util.List;
import java.util.ArrayList;

import com.krishantha.training.salesmanager.model.Employee;

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
