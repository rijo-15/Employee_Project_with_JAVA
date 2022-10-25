package com.cogent.bean;

public class EmployeeBean {
	private long employeeId; 
	private String Fname; 
	private String Lname; 
	private String employeeEmail; 
	private int employeeAge; 
	private boolean employeeIsMarried; 
	private String employeeCity; 
	private String employeeCountry;
	
	
	
	//Constructor 
	
	public EmployeeBean() {
		
	}
	public EmployeeBean(long employeeId, String fname, String lname, String employeeEmail, int employeeAge,
			boolean employeeIsMarried, String employeeCity, String employeeCountry) {
		super();
		this.employeeId = employeeId;
		Fname = fname;
		Lname = lname;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
		this.employeeIsMarried = employeeIsMarried;
		this.employeeCity = employeeCity;
		this.employeeCountry = employeeCountry;
	}


	
	//Getters and Setters 
	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public String getEmployeeEmail() {
		return employeeEmail;
	}


	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}


	public int getEmployeeAge() {
		return employeeAge;
	}


	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}


	public boolean isEmployeeIsMarried() {
		return employeeIsMarried;
	}


	public void setEmployeeIsMarried(boolean employeeIsMarried) {
		this.employeeIsMarried = employeeIsMarried;
	}


	public String getEmployeeCity() {
		return employeeCity;
	}


	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}


	public String getEmployeeCountry() {
		return employeeCountry;
	}


	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	} 
	
	
	

}
