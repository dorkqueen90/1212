package project;

import java.util.Scanner;

/* This is assignment 1 in 1212
 * @author amber sibel
 * @version 2/5/19
 * This program should offer a menu of 5 different options, each with their own algorithm.
 */

public class assignment1 {
	
	public static void main(String[] args) {
		
		//display menu
		System.out.println("Welcome! Here is a list of tools to use!");
		System.out.println("1. Lab Test Average Calculator");
		System.out.println("2. Dice Roll");
		System.out.println("3. Circle Area Calculator");
		System.out.println("4. Compute Distance");
		System.out.println("5. Quit");
		
		//ask for user choice
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of the tool you would like to use: ");
		int choice = input.nextInt();
		
		//if-else based on choice
		//lab test average calculator. enter grades for 3 tests.
		switch(choice) {
		case 1:
			System.out.println("You've chosen the Lab Test Average Calculator!");
			System.out.println("Please insert 3 Lab Test scores: ");
			double score1 = input.nextDouble();
			double score2 = input.nextDouble();
			double score3 = input.nextDouble();
			
			//calculate average
			double average = (score1 + score2 + score3) / 3;
			
			//display results
			System.out.println("Your Lab Test Average is: " + average);
			break;
		//dice roll. 
		case 2:
			System.out.println("You've chosen Dice Roll!");
			
			//generate random int between 1 and 6
			int random = (int)((Math.random() * 6) + 1);
			
			//ask for user to guess odd or even
			System.out.println("Please enter 1 for odd, or 2 for even.");
			int roll = input.nextInt();
			
			//display results using if statement. match = victory. no math = loss.
			if(random % 2 == 0 && roll == 2) {
				System.out.println("You are correct! Victory!");
			}
			else if(random % 2 == 0 && roll == 1) {
				System.out.println("Sorry that is not right, you lose.");
			}
			else if(random % 2 != 0 && roll == 1) {
				System.out.println("You are correct! Victory!");
			}
			else {
				System.out.println("Sorry that is not right, you lose.");
			}
			break;
		//circle area calculator
		case 3:
			System.out.println("You've chosen the Circle Area Calculator!");
			//ask for radius
			System.out.println("Please enter the radius: ");
			double radius = input.nextDouble();
			//calculate radius
			double area = 3.14 * Math.pow(radius, 2);
			//display results
			System.out.println("The area of the circle is: " + area);
			break;
		//compute distance. 
		case 4:
			System.out.println("You've chosen to Compute Distance!");
			//ask for x and y coordinates for 2 points
			System.out.println("Please insert the x and y coordinates for 2 points (x, then y, then x, then y): ");
			int x1 = input.nextInt();
			int y1 = input.nextInt(); 
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			//calculate distance.. (Math.pow(a , 0.5) for square root
			double distance = (Math.pow((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))) ,0.5));
			//display results
			System.out.println("The distance is: " + distance);
			break;
		
		//quit option
		case 5:
			System.out.println("Goodbye.");
			break;
		}
		
	}

}
