/*
Assignment 6: Logical NOT (!) for Negation
Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
•    Use logical ! to negate conditions.
*/

package Assignment6;
import java.util.Scanner;

public class NumBetween {
	private int num;
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Between 10 to 20: ");
		num =sc.nextInt();
		
	}
	
	public void numBetween() {
		if(!(num>=10 && num<=20))
			System.out.println(num+ " is NOT between 10 and 20. ");
		else
			System.out.println(num+ " is  between 10 and 20. ");
	}
}
