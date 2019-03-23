import java.util.Scanner;

/* This is lab 1 in HW07 for POST06
 * @author amber
 * @version 3/22/19
 * This program should count the number of words in the string inputed by the user.
 */
public class lavalab1 {
	
	public static void main(String[] args) {
		//insert lab ID
		System.out.println("ID001");
		//get string
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = input.nextLine();
		char word = ' ';
		//create loop
		int counter = 1; //create counter
		for(int k = 0; k < s1.length(); k++) {
			if(s1.charAt(k) == word) {
			counter++;
			}
		} //display number of words in string
		System.out.println("There are " + counter + " words in this string.");
		input.close();
	}
		
}


