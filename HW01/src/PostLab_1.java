/* 
 * @author Amber Sibel
 * @version 1/26/2019
 * This program should prompt user for number and convert kilometers to miles
 * 
 * Steps include:
 * Importing Scanner to program
 * Adding ID to assignment
 * Creating the scanner
 * Prompting user for the kilometers
 * Converting kilometers to miles
 * Displaying how many miles it is
 */
import java.util.Scanner;

public class PostLab_1 {
	
	public static void main(String[] args) {
		
		System.out.println("ID001");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number in kilometers: ");
		double numberInKilometers = input.nextDouble();
		
		double miles = numberInKilometers * .621;
		
		System.out.println(numberInKilometers + " kilometers is " + miles + " miles.");
		
	}

}
