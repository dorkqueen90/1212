package javalab3;

import java.util.Scanner;

/* This is from lab 3, activity 4
 * @author amber and alex
 * @version 2/4/19
 * This program should determine if a year is a leap year
 */

public class activity4 {
	
	public static void main(String[] args) {
		//ask for year
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		//calculate leap year
		boolean isLeapYear = (year % 4 == 0 && 100 != 0) || (year % 400 == 0);
		
		//display results
		System.out.println("Is " + year + " a leap year? " + isLeapYear);
		
	}

}
