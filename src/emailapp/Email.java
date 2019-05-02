package emailapp;

import java.util.Scanner;

/**
 * @author AKSHAYA
 *
 */
public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private final int passwordLength = 8;
	private int mailboxCapacity = 500;
	private String email;
	private final String companySuffix = "google.com";
	private String alternateEmail;
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// set department - input given by IT Admin guy
		this.department = getDepartmentInfo();
		
		// get random password for given length
		this.password = getPassword(passwordLength);
		
		// set email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}

	private String getDepartmentInfo() {
		System.out.println("New Joinee: " + firstName + ". \nDEPARTMENT CODES:\n 1 for sales\n 2 for development\n 3 for accounting\n 0 for none");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		in.close();
		switch (deptChoice) {
		case 1:
			return "sales";
		case 2: 
			return "dev";
		case 3:
			return "acct";
		}
		return "";
	}
	
	private String getPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ)!@#$%^&*(!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void changePassword(String password) {
		this.password = password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nEMAIL ADDR: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity;
	}

}
