/* This is flowchart 2 from activity 3.3
 * @author amber
 * @version 2/2/19
 * This program should flip a coin and display heads or tails
 */
package activity3_3;

import java.util.Scanner;

public class flowchart2 {
	
	public static void main(String[] args) {
		//ask if user would like to flip a coin
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to flip a coin? Enter 0 for no.");
		int choice = input.nextInt();
		
		//make random number
		int num = (int)(Math.random() * 2);
		
		//if statement
		if(choice != 0) {
			
		if(num == 1) {
			System.out.println("You got heads!");
		}
		if(num == 2) {
			System.out.println("You got tails!");
		}
		
		}
		System.out.println("Goodbye!");
		
	}

}
