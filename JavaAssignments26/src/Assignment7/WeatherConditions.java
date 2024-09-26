/*
 Assignment 7: Weather Conditions
Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
•    Temperature should be between 20°C and 30°C.
•    It should not be raining.
Requirements:
•    Use logical operators && and !.
*/

package Assignment7;

import java.util.Scanner;

public class WeatherConditions {

	private int temperature;
	private boolean raining = true;

	public void getData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Temperature: ");
		temperature = sc.nextInt();

		System.out.println("Is Raining or Not: (true/false): ");
		raining = sc.nextBoolean();

	}

	public void isSafe() {
		if ((temperature >= 20 && temperature <= 30) && !raining)
			System.out.println("Clear whether !!! it's safe to go outside");
		else
			System.out.println("It's Not safe to go outside");
	}
}
