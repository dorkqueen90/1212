package javalab3;
/* This is from lab 3, activity 3
 * @author amber and alex
 * @version 2/4/19
 * This program should do the same as activity 2, except there's a bill and discounted price now
 */

import java.util.Scanner;

public class activity3 { // lab7.2

	public static void main(String[] args) {
		double discount = 0;
		// ask for membership status code
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! What is your membership status code?");
		double code = input.nextInt();
		// calculate discount
		discount = calculateDiscount(code, discount);
		// ask for bill
		System.out.println("What is your bill? ");
		double bill = input.nextDouble();
		// display final bill
		System.out.println("Your final price is: " + calculateFinalPrice(bill, discount));
		input.close();
	}

	public static double calculateFinalPrice(double a, double b) {
		// bill - (bill * discount);
		double total = a - (a * b);
		// display final total with discount and sales tax
		total += total * .046;
		return total;
	}

	public static double calculateDiscount(double a, double b) { // a- code b-discount

		if (a == 2014) {
			b = .15;
			System.out.println("Your discount is 15%!");
		} else if (a == 2015) {
			b = .10;
			System.out.println("Your discount is 10%!");
		} else if (a == 2016) {
			b = .05;
			System.out.println("Your discount is 5%!");
		} else {
			b = 0;
			System.out.println("You don't get a discount.");
		}
		return b;
	}

}
