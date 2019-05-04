package studentdbapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String args[]) {
		// get num of students from user
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		for(int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTution();
			System.out.println(students[i].toString());
		}
	}
}
