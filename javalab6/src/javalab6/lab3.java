package javalab6;
/* This is activity 3 in Lab06
 * @author amber
 * @version 3/18/19
 * This program should let the user input how many names they want to add in.
 * Then an array is created based on that number. It should then have them put in the names.
 * Next it should sort them in alphabetical order.
 */
import java.util.Arrays;
import java.util.Scanner;

public class lab3 {
	
	public static void main(String[] args) {
		//ask for amount of names
		Scanner input = new Scanner(System.in);
		System.out.println("How many names would you like to enter?");
		int num = input.nextInt();
		//create array
		String[] namesArr = new String[num];
		//ask for names
		for(int i = 0; i < namesArr.length; i++) {
		System.out.println("Please enter " + namesArr.length + " names: ");
		namesArr[i] = input.next();
		}
		Arrays.sort(namesArr);
		System.out.print(Arrays.toString(namesArr));
	}

}
