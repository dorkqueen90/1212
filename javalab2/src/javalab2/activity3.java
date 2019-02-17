package javalab2;
/* activity 3
 * @amber and alex
 * 1/28/19
 * This program takes 2 variables from user and swaps them
 */
import java.util.Scanner;

public class activity3 {
	
	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		// take variables from user
		System.out.println("Please enter a number:");
		double number1 = input.nextDouble();
		
		System.out.println("Please enter a second number:");
		double number2 = input.nextDouble();
		
		// create temp variable
		double number3 = number1;
		
		//swap variables
		number1 = number2;
		number2 = number3;
		
		//display results
		System.out.println("Now we're going to swap those numbers."
				+ "You're new first number should be your second number,"
				+ "shown here : " + number1);
		
		System.out.println("This should show your new second number (which should be your first number): "
				+ number2);
	}

}
