package com.cogent.service;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepo employeeRepo = new EmployeeRepoImpl(); 

	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		
		employeeRepo.addEmployee(employeeBean);
		

	}

	@Override
	public EmployeeBean viewAllEmployee() {
		
		return employeeRepo.viewAllEmployee(); 
	}

	@Override
	public EmployeeBean FindEmployeeById(int employeeId) {
		
		return employeeRepo.FindEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeRepo.deleteEmployeeById(employeeId);

	}

	@Override
	public EmployeeBean FindYoungestEmployee() {
		
		return employeeRepo.FindYoungestEmployee(); 
	}

	@Override
	public EmployeeBean displayEmployeeFromCountry(String country) {
		
		return employeeRepo.displayEmployeeFromCountry(country);
	}

	@Override
	public EmployeeBean displayEmployeeFromCountryAndCity(String country, String city) {
		
		return employeeRepo.displayEmployeeFromCountryAndCity(country, city);
	}

}
