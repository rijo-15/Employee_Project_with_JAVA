package com.cogent.client;

import java.util.Scanner;

import com.cogent.Exception.NoEmployeeException;
import com.cogent.bean.EmployeeBean;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		boolean isMarried = false; 
		
		EmployeeService employeeService = new EmployeeServiceImpl(); 
		EmployeeBean employeeBean = null; 
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
	System.out.println("*******************************************************************");	
	System.out.println("*                       Menu                                      *");
	System.out.println("*******************************************************************");
	System.out.println("*                 1. Add Employee                                 *");
	System.out.println("*                 2. View All Employee                            *");
	System.out.println("*                 3. Find the Employee By ID                      *");
	System.out.println("*                 4. Delete Employee By ID                        *");
	System.out.println("*                 5. Find the youngest Employee                   *");
	System.out.println("*                 6. Find the Employee by country                 *");
	System.out.println("*                 7. Find the Employee from country and city      *");
	System.out.println("*******************************************************************");
	
	System.out.println("Please select an option");
	
	
	int option = scanner.nextInt(); 
	
	switch(option) {
	
	
	//add employee 
	case 1: 
		employeeBean = new EmployeeBean(); 
		System.out.println("     Add Employee       ");
		
		System.out.println("Please enter the employeeID");
		employeeBean.setEmployeeId(scanner.nextInt());
		System.out.println("Please enter Employee First name");
		employeeBean.setFname(scanner.next());
		System.out.println("Please enter Employee Last name");
		employeeBean.setLname(scanner.next());
		System.out.println("Please enter Employee's email");
		employeeBean.setEmployeeEmail(scanner.next());
		System.out.println("Please enter Employee's Age");
		employeeBean.setEmployeeAge(scanner.nextInt());
		System.out.println("Is the employee Married Y or N");
		
		String yesNo = scanner.next(); 
		
		if(yesNo.equals("Y")) {
			employeeBean.setEmployeeIsMarried(true);
		}else {
			employeeBean.setEmployeeIsMarried(false);
		}
		
		System.out.println("Please enter the city");
		employeeBean.setEmployeeCity(scanner.next());
		System.out.println("Please enter the country"); 
		employeeBean.setEmployeeCountry(scanner.next());
		employeeService.addEmployee(employeeBean);
		System.out.println("Employee added Succefully");
		System.out.println();
	break; 
	
	
	
	//View all employees
	case 2: 
		System.out.println("List of All Employees ");
		
		employeeService.viewAllEmployee(); 
		
		System.out.println();
		
		break; 
		
		
		//Find employee by Id
	case 3:
		System.out.println("Please enter the employee Id ");
		EmployeeBean employee = employeeService.FindEmployeeById(scanner.nextInt()); 
		
		if(employee != null) {
			System.out.println("First Name:" + employee.getFname() + "      Last Name: " + employee.getLname());
		}else {
			System.out.println("Employee not found");
		}
		
		System.out.println();
		
		break; 
		
		
		//Delete employee By Id
	case 4: 
		
		
		System.out.println("Please enter employee Id to delete the employee");
		employeeService.deleteEmployeeById(scanner.nextInt());
		
		System.out.println("Employee Deleted successfully");
		
		System.out.println();
		
		break; 
		
		//Find the youngest employee
	case 5: 
		System.out.println("The youngest employee");
		
		 employee = employeeService.FindYoungestEmployee(); 
		 
		 System.out.println("First Name: " + employee.getFname() + "  Last Name: " + employee.getLname() + " Age: " + employee.getEmployeeAge());
		 System.out.println();
		 
		 break;
		
		
		//Employee from country 
	case 6: 
		System.out.println("Employees from selected country");
		System.out.println("Please enter a Country");
		
		
		
		employee = employeeService.displayEmployeeFromCountry(scanner.next()); 
		
		if(employee != null) {
			System.out.println("First Name: " + employee.getFname() + "\nLast Name: "+  employee.getLname() + "\nCountry: " + employee.getEmployeeCountry());
		}else {
			System.out.println("Employee not found");
		}
		
		
		System.out.println();
		
		
		break;
		
		
		//Employee from Country and City 
	case 7: 
		System.out.println("Employees from selected country and city");
		
		System.out.println("Please enter a country");
		
		String inputCountry = scanner.next(); 
		
		System.out.println("Please enter a city");
		
		String inputCity = scanner.next();
		
		
		employee = employeeService.displayEmployeeFromCountryAndCity(inputCountry, inputCity); 
		
		if(employee != null) {
			System.out.println("First Name: " + employee.getFname() + "\nLast Name: " + employee.getLname() + "\nCountry: " + employee.getEmployeeCountry() 
			+ "\nCity: " + employee.getEmployeeCity());
		}else {
			
			throw new NoEmployeeException("No Employee found"); 
		}
		
		
		
		System.out.println();
		
		
		
		break; 
		
		default: 
			System.out.println("Please enter a valid option");
	}
	
	
		
		
		
		

	
		}
	}

}
