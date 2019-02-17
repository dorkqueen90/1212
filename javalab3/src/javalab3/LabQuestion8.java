package javalab3;

import java.util.Scanner;

public class LabQuestion8 {

	public static void main(String[] args) {
		
		//---- Declare all the variables here
		int choice, num;
		double total =0;
		Scanner scan;
		final double tax = .023;
		
		//get selection from user
		System.out.println("Please select 1 of the following options to buy: ");
		System.out.println("1. Shirts (7$ / item)");
		System.out.println("2. Pants  (10$ / item)");
		System.out.println("3. Top    (5$ / item)");
		
		//On the next line, write the code to scan an integer called choice. Use the necessary input
		//
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like? (Enter 1, 2, 3)");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("How many shirts would you like to buy?");
			num = input.nextInt();
			total = num * 7; 
		}
		else if(choice == 2)
		{
			System.out.println("How many pants would you like to buy?");
			num = input.nextInt();
			total = num * 10;	 
		}
		else if(choice == 3)
		{
			System.out.println("How many tops would you like to buy?");
			num = input.nextInt();
			total = num * 5;
			 
		}
		double newTotal = (total * tax) + total; 
		//
		
		System.out.println("Hello Customer, Thank you for your purchase at our store.");
		// below, write the code to print the total bill
		System.out.println("Your total bill is : " + newTotal);
		
	}

}

