/* This is the first flowchart is activity 3.3
 * @author amber
 * @version 2/2/19
 * This program should let the user know if they're getting enough sleep
 */

package activity3_3;

import java.util.Scanner;

public class flowchart1 {
	
	public static void main(String[] args) {
	
		//ask user for amount of sleep
		Scanner input = new Scanner(System.in);
		System.out.println("How many hours did you sleep?");
		double hours = input.nextDouble();
		
		//if statement
		if(hours > 8) {
			System.out.println("Good! You got enough sleep!");
		}
		else if(hours > 5) {
			System.out.println("That's okay. Should probably still have more though!");
		}
		else {
			System.out.println("You definitely need more sleep!");
		}
	
	}
}
