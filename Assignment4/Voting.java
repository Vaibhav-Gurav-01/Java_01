/*Assignment 4: Voting Eligibility
Write a program that checks if a person is eligible to vote. A person can vote if they are a citizen and their age is 18 or above.
Requirements:
•    Use logical && to combine conditions, and ! to negate conditions if necessary.*/
package Assignment4;

import java.util.Scanner;

public class Voting {

	private int age;
	private boolean Indian;
	

	public void getData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Are you Indian? ");
		System.out.println(!Indian?  "notElligible":"Elligible");
	}
	
	public void checkCitizen() {
		if(!Indian)
			System.out.println("You are not Indian!!!");
	}
	
	public void checkVote() {
		if(age<18)
			System.out.println("Not Elligible ");
		else if (age>18 && Indian)
			System.out.println("Elligible");
	}

}