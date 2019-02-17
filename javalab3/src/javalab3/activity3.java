package javalab3;
/* This is from lab 3, activity 3
 * @author amber and alex
 * @version 2/4/19
 * This program should do the same as activity 2, except there's a bill and discounted price now
 */

import java.util.Scanner;

public class activity3 {
	
	public static void main(String[] args) {
			//ask for membership status code
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome! What is your membership status code?");
			int code = input.nextInt();
			
			//ask for bill
			System.out.println("What is your bill? ");
			double bill = input.nextDouble();
			
			double discount;
			double tax = .046;
			
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
			//calculate totals
			double discountedTotal = bill - (bill * discount);
			double finalTotal = (discountedTotal * tax) + discountedTotal;
			//display final total with discount and sales tax
			System.out.println("Your final price is: " + finalTotal);
	}
}
