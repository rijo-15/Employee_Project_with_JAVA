package com.cogent.service;

import com.cogent.bean.EmployeeBean;

public interface EmployeeService {
	
	public void addEmployee(EmployeeBean employeeBean); 
	public EmployeeBean viewAllEmployee(); 
	public EmployeeBean FindEmployeeById(int employeeId); 
	public void deleteEmployeeById(int employeeId); 
	public EmployeeBean FindYoungestEmployee(); 
	public EmployeeBean displayEmployeeFromCountry(String country); 
	public EmployeeBean displayEmployeeFromCountryAndCity(String country, String city); 

}
