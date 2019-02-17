package javalab2;
/* activity 1
 * @amber
 * 1/28/19
 * This program should help teach children geometry
 */
import java.util.Scanner;



public class activity1 {
	
	public static void main(String[] args) {
		
		//variables
		double length, height;
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		// explain program to kids
		System.out.println("This program will help you calculate the area and perimeter!");
		
		// ask children for length
		System.out.println("Enter the length of the rectangle:");
		length = input.nextDouble();
		
		// ask children for height
		System.out.println("Enter the height of the rectangle:");
		height = input.nextDouble();
		
		// explain the calculation
		System.out.println("Now we'll take the length * height to calculate the area!");
		
		// calculate the area
		double area = length * height;
		
		// explain the perimeter
		System.out.println("Next we'll take the width + height * 2 to calculate the perimeter!");
		
		// calculate the perimeter
		double perimeter = (length + height * 2);
		
		// display results
		System.out.println("The area we calculated is : " + area);
		System.out.println("The perimeter we calculated is : " + perimeter);
		
	}
	
}
