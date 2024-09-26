package Assignment4;
import java.util.Scanner;

public class Voting {
	private int age;
	private boolean isIndian;
	

	public void getData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Are you Indian?  (true / false )");
		isIndian = sc.nextBoolean();
	}
	
	public void checkCitizen() {
		if(!isIndian)
			System.out.println("Not Elligible !!! You are not Indian!!!");
	}
	
	public void checkVote() {
		if(age<18)
			System.out.println("Not Elligible ");
		else if (age>18 && isIndian)
			System.out.println("Elligible");

	}
}
