/*
 *  * @author Amber Sibel
 * @version 1/26/2019
 * This program should break a large amount of money into smaller units
 * The output when the input is 1.99 is: 1 dollar, 3 quarters, 2 dimes, 0 nickels, 4 pennies
 * 
 * Steps include:
 * Importing scanner
 * Adding assignment ID
 * Create scanner
 * Receive amount of money from user
 * Convert the money
 * Find the number of one dollars
 * Find the number of quarters in remaining amount
 * Find the number of dimes in remaining amount
 * Find the number of nickels in remaining amount
 * Find the number of pennies in remaining amount
 * Display results
 */
import java.util.Scanner;

public class caseStudy2 {

public static void main(String[] args) {
		
		System.out.println("ID002");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
}
}
