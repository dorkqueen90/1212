package javalab6;
/* This is problem 4 in Lab06
 * @author amber
 * @version 3/18/19
 * This program should ask how many numbers to input, create array based on number.
 * It should then have them input the numbers and add them together, displaying the total.
 */
import java.util.Scanner;

public class lab4 {
	
	public static void main(String[] args) {
		
		//ask for amount of names
		Scanner input = new Scanner(System.in);
		System.out.println("How many strings would you like to enter?");
		String num = input.nextLine(); //use string type
		int result = Integer.parseInt(num); //parse to create int
		//create array
		String[] s1Arr = new String[result];
		//ask for names
		int result2 = 0;
		
		System.out.println("Please enter " + s1Arr.length + " value(s): ");
		String s1 = input.nextLine();
		s1Arr[result] = s1.split(" ");
		
		for(int i = 0; i < s1Arr.length; i++) {	
		//parse strings and convert to integer
		result2 += Integer.parseInt(s1Arr[i]);
		}
		//display
		System.out.println("Total: " + result2);
		//close input
		input.close();
	}

}
