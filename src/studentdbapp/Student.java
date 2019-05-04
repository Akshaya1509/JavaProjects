package studentdbapp;

import java.util.Scanner;

/**
 * @author AKSHAYA
 *
 */
public class Student {
	private static int id = 1000;
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	
	Student () {
		Scanner in  = new Scanner(System.in);
		System.out.println("enter firstName:");
		this.firstName = in.nextLine();
		
		System.out.println("enter lastName:");
		this.lastName = in.nextLine();
		
		System.out.println("1 - freshmen\n2 - sophomore\n3 - junior\n4 - Senior");
		this.gradeYear = in.nextLine();
		
		setStudentId();
	}
	
	private void setStudentId() {
		id++;
		studentId = gradeYear + "" +  id;
	}
	
	public void enroll() {
		Scanner in = new Scanner(System.in);
		String course;
		do {
			System.out.println("enter a course: ");
			course = in.nextLine();
			if (course.equals("Q")) {
				break;
			} else {
				courses = courses + " " + course;
				tuitionBalance += costOfCourse;
			}
		} while(1 != 0);
	}
	
	public void viewBalance() {
		System.out.println("BALANCE IS : " + tuitionBalance);
	}
	
	public void payTution() {
		viewBalance();
		int payment;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your payment : ");
		payment = in.nextInt();
		tuitionBalance -=  payment;
		System.out.println("Payment of " + payment + " is DONE!");
		viewBalance();
	}
	
	public String toString() {
		return "NAME: " + firstName + " " + lastName +
				"\nGRADE YEAR: " + gradeYear +
				"\nSTUDENT ID: " + studentId +
				"\nCOURSES ENROLLED: " + courses + 
				"\nBalance: " + tuitionBalance;
	}

}
