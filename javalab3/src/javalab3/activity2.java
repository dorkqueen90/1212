package javalab3;
/* This is from lab 3, activity 2
 * @author amber and alex
 * @version 2/4/19
 * This program should calculate a discount based on membership code
 */
import java.util.Scanner;

public class activity2 {
	
	public static void main(String[] args) {
		
		//ask for membership status code
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! What is your membership status code?");
		int code = input.nextInt();
		
		double discount;
		
		//if-else statement
		//2014 = 15%, 2015 = 10%, 2016 = 5%
		if(code == 2014) {
			discount = .15;
		}
		else if(code == 2015) {
			discount = .10;
		}
		else if(code == 2016) {
			discount = .05;
		}
		else {
			discount = 0;
		}
		//display membership discount (switch statement)
		switch (code) {
		case 2014: System.out.println("Your discount is 15%!"); break;
		case 2015: System.out.println("Your discount is 10%!"); break;
		case 2016: System.out.println("Your discount is 5%!"); break;
		default: System.out.println("You don't get a discount.");
		}
		
	}

}
