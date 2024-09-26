/*
Assignment 5: Job Application
Write a program that checks if a person is eligible for a job based on their qualifications. A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
Requirements:
•    Use logical operators to combine conditions.*/
package Assignment5;

import java.util.Scanner;

public class JobApplication {

	private boolean isDegree;
	private boolean isExperience;
	private boolean isCriminal;

	public void getData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do You Have Bachelor’s Degree (true/false)");
		isDegree = sc.nextBoolean();
		
		System.out.println("Do You Have Any Experience (true/false)");
		isExperience = sc.nextBoolean();
		
		System.out.println("Dou you have any Criminal Record?  (true/false)");
		isCriminal = sc.nextBoolean();
		
	}
	
	public void check() {
		
		if((isDegree || isExperience) && !isCriminal) 
			System.out.println("Eligible for the job.");
		else
			System.out.println("Not Eligible for the job.");
	
	}
}
