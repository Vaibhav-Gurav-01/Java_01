/*
Assignment 2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
•    Use logical operators && and || to combine conditions.
*/

package Assignment2;

import java.util.Scanner;

public class ExamGrade {

	private String name;
	private float sub1, sub2, sub3;
	private float average;

	Scanner sc = new Scanner(System.in);

	public void getData() {

		System.out.println("Enter Student Name: ");
		name = sc.next();

		System.out.println("Enter sub1 Marks: ");
		sub1 = sc.nextFloat();
		System.out.println("Enter sub2 Marks: ");
		sub2 = sc.nextFloat();
		System.out.println("Enter sub3 Marks: ");
		sub3 = sc.nextFloat();

	}

	public float avg() {
		average = (sub1 + sub2 + sub3) / 3;
		return average;

	}

	public void displayResult() {
		if ((avg() > 60.00) && sub1 > 40 && sub2 > 40 && sub3 > 40)
			System.out.println("Congradulation! " + name + " Your Are Passed !!!");
		else
			System.out.println("Failed !!!");

	}

}
