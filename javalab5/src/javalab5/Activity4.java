package javalab5;
/* Activity 4 of Lab 05
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

public class Activity4 {
	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		// Display welcome message
		System.out.println("Robot: Hello. I am a talking robot.");
		String reply = " ";
		int num;
		while(!reply.equals("Goodbye")) {
			// Get user string
			System.out.print("Reply: ");
			reply = input.next();
			// Generate random number
			num = (int)(Math.random() * 5);
			// Generate response
			switch(num) {
				case 0:
					System.out.println("Robot: Why are you like this?"); break;
				case 1:
					System.out.println("Robot: I hate my life."); break;
				case 2:
					System.out.println("Robot: Don't do it."); break;
				case 3:
					System.out.println("Robot: Someone is going to die I think."); break;
				case 4:
					System.out.println("Robot: Please smile."); break;
			}
		}
		// Display goodbye message
		System.out.println("Robot: I have enjoyed talking to you. Goodbye.");
		// Close scanner
		input.close();
	}

}
