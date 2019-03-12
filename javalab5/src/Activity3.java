/**
 * Activity 3 of Lab 05
 * @author Lantzen Lowe
 * @date March 11, 2019
 * @version 1.0
 * 
 * Description:
 * 
 * Pseudocode:
 * 
 */

import java.util.*;

public class Activity3 {
	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		int num = 1;
		do {
			// Get number
			System.out.print("Enter a positive integer: ");
			num = input.nextInt();
		} while (num < 0 || (num % 10 == 0)); // check number
		// Display message
		System.out.println("Wise choice.");
		// Close scanner
		input.close();
	} // Close main
} // End class
