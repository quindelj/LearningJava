package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName,lastName, password, department, altEmail, email;
	private String compSuffix = "mail.com";
	private int mailboxCapacity = 222;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randPassword(10);
		System.out.println("Password is: " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + compSuffix;
		//System.out.println(email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("Department codes: \nl for Sales\n2 for Devolpment\n3 for Accounnting\n 0 for none\n Enter code");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if (choice == 1) {
			return "Sales";
		}else if(choice == 2) {
			return "Dev";
		}else if(choice == 3) {
			return "Account";
		}else {
			return " ";
		}
		
	}
	
	//Generate a random password
	private String randPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!##$%*";
		char [] pass = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			pass[i] = passwordSet.charAt(rand);
		}
		return new String(pass);
	}
	
	// set the mailbox capacity
	public void setMailoxCapcity(int cap) {
		this.mailboxCapacity = cap;
	}
	
	public int getMailboxCap() {return mailboxCapacity;}
	
	//Set the alt email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	public String getAltEmail() {return altEmail;}
	
	// Change email
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME:" + firstName + " " + lastName + "\n"
				+ "COMPANY EMAIL:" + email + "\n" 
				+ "MAILBOX CAPACITY:" + mailboxCapacity + "mb";
	}
}
