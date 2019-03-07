package inclass3_5;
/* This is activity 4.1-2.
 * @author amber sibel
 * @version 2/28/19
 * This program should take a string from the user and print out the 
 * words individually, along with the first/last letters
 * Steps include:
 * - inserting scanner
 * - getting input string from user
 * - saving string and splitting it in an array
 * - having a char take the first letter of the individual word
 * - having another char take the last letter of the word
 * - making a loop to print out all the words and chars
 */
import java.util.Scanner;

public class Activity4_1_2 {
	
	public static void main(String[] args) {
		//get sentence to read
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert a sentence");
		String s1 = input.nextLine();
		//list all words and corresponding first and last letters of each word
		String[] word = s1.split(" ");
		
		for(String s2 : word) {
			
			char c1 = s2.charAt(0);
			char c2 = s2.charAt(s2.length() - 1);
			
			System.out.println(s2 +" "+ c1 + c2);
		}
		
	}

}
