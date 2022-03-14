package com.greatlearning.service;

import java.util.Random;
//import com.greatlearning.model.Employee;

public class EmailPasswordGenerator {
	
	//Template to generate email- FirstNameLastName@department.company.com
	
	/**
	 * 
	 * RETURNS EMAIL ID OF EMPLOYEE
	 * 
	 * @param firstName - FirstName of Employee
	 * @param lastName - LastName of Employee
	 * @param deptName - Department of Employee
	 * @return - email id of employee based on department
	 * 
	 */
	
	/**
	 * GENERATING DEPARTMENT EMAIL ID
	 *
	 * */
	
	public String generateEmail(String firstName, String lastName, String deptName) {
		
		String emailId;
		
		emailId= firstName + lastName + "@" + deptName + "company.com"; //Generating Email
		
		return emailId;
				
	}
	

	/** 
	 * 
	 * RETURNS RANDOMLY GENERATED PASSWORD 
	 * 
	 * @return - randomly generated password with array of characters
	 * 
	 */
	
	/**
	 * 
	 * Sting Pool - Data Protection
	 * Hence always preferred to save password in character array 
	 *
	 * */
	
	public  char[] generatePassword() {
		
		String allowedCharacters = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ+_%1234567890");
		//char[] array = allowedCharacters.toCharArray();
		
		int length=8;
		Random random = new Random();
		
		char[] empPassword = new char[length]; 
		
		for(int i=0; i<length; i++) 
		{
			int randomIndex= random.nextInt(allowedCharacters.length());
			empPassword[i]= allowedCharacters.charAt(randomIndex);
			
		}
		
		return empPassword;
				
	}
	
	public void displayEmployeeInformation(String firstName, String emailId, char[] password) {
		
		/**
		 * Dear Employee, your generated credentials are as follows -
		 * Email:
		 * Password:
		 */
		
		
		System.out.println(" Dear " + firstName + " your generated credentials are as follows- \n Email: " + emailId + "\n Password: " + new String(password) );
		//you may check other print formats
		
	}

}
