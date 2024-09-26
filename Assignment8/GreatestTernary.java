/*
Assignment 8: Determine the Greatest Number Using Ternary Operator

Write a Java program to find the greatest number among three numbers using the ternary operator.

*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers.*/

package Assignment8;
import java.util.Scanner;

public class GreatestTernary {
	private int num1;
	private int num2;
	private int num3;
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		num1=sc.nextInt();
		System.out.print("Enter num2: ");
		num2=sc.nextInt();
		System.out.print("Enter num3: ");
		num3=sc.nextInt();
	}
	
	public void greater() {
		System.out.println("Greater Number is: ");
		System.out.print((num1>num2&&num1>num3)? num1:
							(num2>num1&&num2>num3)? num2:num3);
	}
	
}
