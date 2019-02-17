package javalab2;

/*this is activity 2
 * @amber and alex
 * 1/28/19
 * This program should display mod operations and integer division
 */
import java.util.Scanner;

public class activity2 {
	
	public static void main(String[] args) {
		
		//explain what we're doing
		System.out.println("In this program we're going to demonstrate mod operations"
				+ " and integer division.");
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//  getting 2 integers from the user
		System.out.println("Please insert the first integer(between 0 - 9): ");
		int a = input.nextInt();
		
		System.out.println("Please insert another integer (between 0 - 9");
		int b = input.nextInt();
		
		// calculating mod operations
		int mod = a % b;
		
		// calculating integer division
		int division = a / b;
		
		// displaying and explaining mod operations
		System.out.println("Now we take the first integer " + a + " and divide it by the second integer"
				+ b + "and we're going to get the remainder using modulus");
		System.out.println("The modulus is: " + mod);
		
		//displaying and explaining integer division
		System.out.println("For this one we divide the first integer " + a + " by the second integer"
				+ b);
		System.out.println("The answer to this is: " + division);
		
	}

}
