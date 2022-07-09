package com.greatlearning.driver;
import com.greatlearning.model.Employee;
import com.greatlearning.service.EmailPasswordGenerator;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("Daphibakor", "Sungoh");
		EmailPasswordGenerator emailpwdGen = new EmailPasswordGenerator();
		
		String empDepartmentName= getDepartmentName(); //many ways to do this
		String empEmailId = emailpwdGen.generateEmail(emp.getEmpFirstName(), emp.getEmpLastName(), empDepartmentName);
		char[] empPassword = emailpwdGen.generatePassword();
		
		emailpwdGen.displayEmployeeInformation(emp.getEmpFirstName(), empEmailId, empPassword);
		
			
		

	}

	public static String getDepartmentName() {
		System.out.println("Please enter the department id from the following:\n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal \n");
		Scanner sc = new Scanner(System.in);
		int employeeChoice= sc.nextInt();
		
		String domainName;
		
		switch(employeeChoice)
		{
		
			case 1: domainName= "tech";
					break;
			
			case 2: domainName= "admn";
					break;
					
			case 3: domainName= "hr";
					break;
					
			case 4: domainName= "lgl";
					break;
					
			default: domainName= "Invalid Choice. Please enter the correct choice of Department!";
					break;
		}
		
		sc.close(); 
		return domainName;
		
	}

}
