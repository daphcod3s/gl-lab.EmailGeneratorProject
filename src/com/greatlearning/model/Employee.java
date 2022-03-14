package com.greatlearning.model;

public class Employee {

	private String empFirstName;
	private String empLastName;
	private String empDeptName;
	private String empEmail;
	private String empPassword;
	
	public Employee(String empFirstName, String empLastName)
	{
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	
	@Override //to get information on the Model
	//It will be useful when while debugging the application at run time
	public String toString() {
		return "Employee [empFirstName=" + empFirstName + ", empLastName=" + empLastName + "]";
	}
	
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpDeptName() {
		return empDeptName;
	}
	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	
}
