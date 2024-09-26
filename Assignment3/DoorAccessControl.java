/*
 Assignment 3: Door Access Control
Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
Requirements:
•    Use logical operators &&, ||, and !.
*/
package Assignment3;
import java.util.Scanner
;
public class DoorAccessControl {
	private boolean id=true;
	private boolean card=false;
	private boolean isAdmin=true;
	
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter ID validity (true/false): ");
	         id = sc.nextBoolean();

	        System.out.print("Enter card validity (true/false): ");
	        card = sc.nextBoolean();

	        System.out.print("Are you an admin? (true/false): ");
	        isAdmin = sc.nextBoolean();

	}
	public void checkAccess() {
		if ((id && card) || isAdmin) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
	}
	
	
	
}
