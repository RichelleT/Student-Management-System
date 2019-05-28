/*

	Written by Richelle Tan @ 17th May 2019.
	Code protected under copyright and is under the MIT license.
	Copyright 2019, Richelle Tan, All rights reserved.

*/

package studentmanagesys;
import java.util.Scanner;

import studentmanagesys.Student;

public class StudentManageSys {
	public static void main(String[] args){
		
		//ask how many users or students needed to add
		
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int studNum = in.nextInt();
		Student[] students = new Student[studNum];
		
		// create selected number of students
		for (int n = 0; n < studNum; n++); {
			//print user-inputed student information
			
			students[n] = new Student();
			students[n].enrollCourse();
			students[n].payBal();
		}
		for (int n = 0; n < studNum; n++); {
		System.out.println(students[n].showStat());
		}
	}
}	