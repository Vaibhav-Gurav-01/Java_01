/**
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
•    Use logical && to combine these conditions.
*/

package Assignment1;

import java.util.Scanner;

public class AgeValidation {

	private int age;
	private double income;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter Income: ");
		income = sc.nextDouble();

	}
	public void checkElligibility() {
		if(age>18 && age<=60 && income>25000)
			System.out.println("Congratulations!!! You are Elligible for Loan.");
		else
			System.out.println("Sorry! You are  Not Elligible.");
	}

}
