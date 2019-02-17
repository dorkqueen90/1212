/* This is homework 03, program 1
 * @amber
 * 1/31/19
 * This program should convert pounds into kilograms
 */
import java.util.Scanner;

public class javaLab1 {
	
	public static void main(String[] args) {
		//ID for lab assignment
		System.out.println("ID001");
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//ask user for # in pounds
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		//convert to kilograms
		double kilo = 0.454 * pounds;
		
		//display result
		System.out.println(pounds + " pounds is " + kilo + " kilograms.");
	}

}
