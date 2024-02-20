package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alaternativeEmail;
	private String companySuffix = "company.com";
	
	// Constructor to Receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED:"+this.firstName+" "+this.lastName);
		
		// Call method asking for department
		this.department = setDepartment();
		System.out.println("Department: "+ this.department);
		
		// Call method asking password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is "+this.password);
		
		// combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix; 
		System.out.println("Your Email is : " + email);
		
		
		
	}
	
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for sales \n2 for Development\n3 for Accounting\n0 for none\n Enter the department");
		int depChoice = new Scanner(System.in).nextInt();
		if(depChoice == 1) {return "Sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";}
	}
	
	// Generate Random Password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	
	// Set mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set alternative email
	public void setAlternateEmail(String altMail) {
		this.alaternativeEmail = altMail;
	}
	
	// Change the Password
	public void changePassword(String password) {
		this.password = password;
	}


	public int getMailboxCapacity() {
		return mailboxCapacity;
	}


	public String getAlaternativeEmail() {
		return alaternativeEmail;
	}


	public String getPassword() {
		return password;
	}
	
	
	

}
