/* This is HW 03, program 2
 * @amber
 * 1/31/19
 * This program should show the monthly interest based on the user input
 */
import java.util.Scanner;

public class javaLab2 {
	
	public static void main(String[] args) {
	//ID for assignment
	System.out.println("ID002");
	
	//create scanner
	Scanner input = new Scanner(System.in);
	
	//ask user for balance and interest rate
	System.out.println("What is your balance and annual interest rate? ");
	double balance = input.nextDouble();
	double interestRate = input.nextDouble();
	
	//calculate interest for next month
	double interest = balance * (interestRate/1200);
	
	//display interest for next month
	System.out.println("Your interest for next month is: " + interest);
	}

}
