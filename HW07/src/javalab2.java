import java.util.Scanner;

/* This is lab 2 in HW07 for POST06
 * @author amber
 * @version 3/22/19
 * This program should count the letters occurrence
 */
public class javalab2 {
	
	public static void main(String[] args) {
		//insert lab ID
		System.out.println("ID002");
		//get string from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = input.nextLine();
		//get letter from user
		System.out.println("Enter a letter: ");
		String let = input.nextLine();
		//see how many times the letter occurs in sentence
		if(s1.contains(let)) {
			int counter = 0; //create counter
			for(int k = 0; k < s1.length(); k++) {
				if(s1.charAt(k)== let.charAt(0)) {
					counter++;
				}
			}
		System.out.println("This letter is represented " + counter + " times in this sentence.");
		}
		else //in case it doesn't contain it
			System.out.println("This letter is not in the string.");
		input.close();
	}

}
