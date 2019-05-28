/*

Written by Richelle Tan @ 17th May 2019.
Code protected under copyright and is under the MIT license.
Copyright 2019, Richelle Tan, All rights reserved.

*/

package studentmanagesys;

import java.util.Scanner;

import javax.swing.text.View;

public class Student {
	private String firstN; // students first name
	private String lastN; // students last name
	private int yearS; // students current year
	private int semS; // students current semester
	private String studID; // students' assigned student identification number
	private String courses; // courses students are enrolled in
	private String modules = ""; // modules a student has registered for
	private int tuitionBal; // students balance of tuition
	private static int courseCosts = 2400; // the costs for a certain course
	private static int id = 10000;
	
	// users will need to enter students' names and year
	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the student's first name: ");
		this.firstN = in.nextLine();

		System.out.print("Enter the student's last name: ");
		this.lastN = in.nextLine();

		System.out.print("Enter the student's current year of study: ");
		this.yearS = in.nextInt();

		System.out.print("Enter the semester the student is currently in: ");
		this.semS = in.nextInt();

		setStudID();
			
	}	

	// Generates a student ID for students
	private void setStudID() {
		//year + ID
		id++;
		this.studID = yearS + "" + id;
	}

	// Student enrolling courses
	public void enrollCourse() {
	//loop, user 0
	do {
		System.out.print("Enter course to enroll (Q to quit.): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			modules = modules + "\n  " + course;
			tuitionBal = tuitionBal + courseCosts;
		}
		
		else {
			break;
		}
	} while (1 != 0);
	}
	// Students view of balance
	public void viewBal() {
		System.out.println("Your outstanding balance is: RM" +tuitionBal);
	}

	// students pay tuition
	public void payBal() {
		viewBal();
		System.out.print("Enter the amount of payment: RM");
		Scanner in = new Scanner(System.in);
		int payments = in.nextInt();
		tuitionBal = tuitionBal - payments;
		
		if (tuitionBal != 0) {
			System.out.println("Your outstanding balance is now: RM" +tuitionBal);
		}	
		else {
			System.out.println("Thank you for the payment.");
		}
		
	}

	// shows students status
	public String showStat() {
		return "Name: " + firstN + " " + lastN +
				"\nYear " + yearS +
				"\nSemester " + semS +
				"\nStudent ID: " + studID +
				"\nCourses Enrolled:" + modules +
				"\nBalance: RM" + tuitionBal;
	
	}
}