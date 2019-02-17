package javalab2;
/*this is activity 5
 * @amber and alex
 * 1/28/19
 * this program should calculate the gas mileage
 */
import java.util.Scanner;

public class activity5 {
	
	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
				
		// insert mileage
		System.out.println("Please insert the mileage :");
		double mileage = input.nextDouble();
				
		//insert gas
		System.out.println("Now insert how many gallons of gas :");
		double gas = input.nextDouble();
				
		//calculate percentage
		double milesPerGallon = (mileage / gas);
				
		// display results
		System.out.println("Your gas mileage is : " + milesPerGallon);
				
		
	}

}
