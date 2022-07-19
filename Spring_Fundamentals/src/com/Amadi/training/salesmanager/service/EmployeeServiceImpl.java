package com.Amadi.training.salesmanager.service;

import java.util.List;

import com.Amadi.training.salesmanager.model.Employee;
import com.Amadi.training.salesmanager.repository.EmployeeRepository;
import com.Amadi.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	private EmployeeRepository employeeRepository;
	
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List <Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
	}
	


}
