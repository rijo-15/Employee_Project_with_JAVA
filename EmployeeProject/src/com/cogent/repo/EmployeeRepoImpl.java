package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

public class EmployeeRepoImpl implements EmployeeRepo {
	
	List<EmployeeBean> employees = new ArrayList(); 
	
	{
		employees.add(new EmployeeBean(1, "John", "Mike", "johnmike@gmail.com", 28, false, "Arkansas", "US" ));
		employees.add(new EmployeeBean(2, "Tom", "Matt", "tommatt@gmail.com", 32, true, "London", "UK" ));
		
	}

	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employees.add(employeeBean); 

	}

	@Override
	public EmployeeBean viewAllEmployee() {
		
		for(int i = 0; i<employees.size(); i++) {
			
			System.out.println(employees.get(i).getFname() + " " + employees.get(i).getLname()); 
			
			//return employees.get(i).getFname();
			  
			
		}
		return null;
	}

	@Override
	public EmployeeBean FindEmployeeById(int employeeId) {
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeId() == employeeId) {
				return employees.get(i); 
			}
			
			
		}
		return null;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeId() == employeeId) {
				employees.remove(i); 
			}
		}
		

	}

	@Override
	public EmployeeBean FindYoungestEmployee() {
		
		int num = 0; 
		int minVal = Integer.MAX_VALUE; 
		
		for(int i = 0; i <employees.size(); i++) 
			if(employees.get(i).getEmployeeAge() < minVal) {
				minVal = employees.get(i).getEmployeeAge(); 
				num = i; 
			}
			return employees.get(num);
			
		}
		
		
		
	

	@Override
	public EmployeeBean displayEmployeeFromCountry(String country) {
		
		//List<EmployeeBean> employeeFromCountry = new ArrayList<>(); 
		EmployeeBean employeeBean = null; 
		
		for(int i= 0; i< employees.size(); i++) {
			employeeBean = employees.get(i); 
			if(employees.get(i).getEmployeeCountry().equals(country)) {
				return employeeBean;  
}
		}
		
		return null;
	}

	@Override
	public EmployeeBean displayEmployeeFromCountryAndCity(String country, String city) {
		
		EmployeeBean employeeBean = null; 
		
		for(int i = 0; i < employees.size(); i++) {
			employeeBean = employees.get(i); 
			if(employees.get(i).getEmployeeCountry().equals(country) && employees.get(i).getEmployeeCity().equals(city)) {
				return employeeBean; 
			}
		}
		
		return null;
	}

}
