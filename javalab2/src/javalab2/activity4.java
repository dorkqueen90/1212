package javalab2;
/* this is activity 4
 * @amber and alex
 * 1/28/19
 * This program should Bill Gates test percentages.
 */
import java.util.Scanner;

public class activity4 {
	
	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		// insert total number of questions correct
		System.out.println("Please insert the total number of questions you got correct :");
		double correct = input.nextDouble();
		
		//insert total number of questions on test
		System.out.println("Now tell us how many questions there are total on the test :");
		double total = input.nextDouble();
		
		//calculate percentage
		double percentage = (correct / total)*100;
		
		// display results
		System.out.println("Your grade percentage is : " + percentage);
		
	}

}
