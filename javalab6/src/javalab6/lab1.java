package javalab6;
/* This is activity 1 and 2 in Lab06
 * @author amber
 * @version 3/18/19
 * This program should get a string from the user and turn it into an array. 
 * It should then display it back one letter at a time.
 * In the second part, it should check to see if the new string is the same as the old one.
 */
import java.util.Arrays;
import java.util.Scanner;

public class lab1 {
	
	public static void main(String[] args) {
		
		//user input string
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert a string: ");
		String s1 = input.nextLine();
		//make array
		char[] arr = s1.toCharArray();
		//display results
		for(int i = 0; i < s1.length(); i++) {
			arr[i] = s1.charAt(i);
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//part 2
		System.out.println("Please enter a second string: ");
		String s2 = input.nextLine();
		//check to see if equal
		boolean doesItWork = s2.contentEquals(s1);
		if(doesItWork == true)
			System.out.println("Your string is in the previous string.");
		else
			System.out.println("Your string is not in the previous string.");
		//close input
		input.close();
	}

}
