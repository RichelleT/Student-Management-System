/*

Written by Richelle Tan @ 17th May 2019.
Code protected under copyright and is under the MIT license.
Copyright 2019, Richelle Tan, All rights reserved.

*/
package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstN; // students first name
	private String lastN; // students last name
	private String yearS; // students current year
	private String semS; // students current semester
	private int studID; // students' assigned student identification number
	private String courses; // courses students are enrolled in
	private String modules; // modules a student has registered for
	private int tuitionBal; // students balance of tuition
	private int courseCosts; // the costs for a certain course

	// users will need to enter students' names and year
	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the student's first name: ");
		this.firstN = in.nextLine();

		System.out.println("Enter the student's last name: ");
		this.lastN = in.nextLine();

		System.out.print("Enter the student's current year of study: ");
		this.yearS = in.nextInt();

		System.out.println("Enter the semester the student is currently in: ");
		this.semS = in.nextInt();

		System.out.println(firstN+""+lastN+""+yearS+""+semS);
	}

	// Generates a student ID for students

	// Student enrolling courses

	// Students view of balance

	// students pay tuition

	// shows students status
}
