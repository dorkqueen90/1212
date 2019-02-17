package inclass3_5;

import java.util.Scanner;

/* Mock lab test 1
 * @auther amber sibel
 * @version 2/11/19
 * section 005
 * This program should create a bill for a customer based on package, minutes, and data usage.
 * It should also show what the customer price would've been with the other 2 packages.
 */
public class mock1 {
	
	public static void main(String[] args){
		
		//variables
		double addMinA = 0.45;
		double addDataA = 50.0; //$10 per 0.2 MB
		double addMinB = 0.40;
		double addDataB = 40.0; //$10 per .25 MB
		double addDataC = 10.0; //$10 per 1 MB
		//plan variables
		double planA = 39.99;
		double planB = 59.99;
		double planC = 69.99;
		
		//ask customer which package they have
		Scanner input = new Scanner(System.in);
		System.out.println("Which package do you have?");
		String plan = input.nextLine();
		
		// ask customer how many minutes and data they used
		System.out.println("How many minutes and data did you use?");
		double minutes = input.nextDouble();
		double data = input.nextDouble();
		
		//calculate plans
		//plan A
		if(minutes > 450){
			planA = planA + ((minutes - 450) * addMinA);
		}
		if(data > 1.0){
			planA = planA + ((data - 1.0) * addDataA);
		}
		//plan B
		if(minutes > 900){
			planB = planB + ((minutes - 900) * addMinB);
		}
		if(data > 2.0){
			planB = planB + ((data - 2.0) * addDataB);
		}
		//plan C
		if(data > 20.0){
			planC = planC + ((data - 20.0) * addDataC);
		}
		//switch case
		switch (plan){
		case "A":
			//display bill
			System.out.println("Your bill is " + planA);
			System.out.println("This is what your price would've been with Package B: " + planB); //this is wrong, ran out of time
			System.out.println("This is what your price would've been with Package C: " + planC); //will look this up later
			break;
		case "B":
			//display bill
			System.out.println("Your bill is " + planB);
			System.out.println("This is what your price would've been with Package A: " + planA);
			System.out.println("This is what your price would've been with Package C: " + planC);
			break;
		case "C":
			//display bill
			System.out.println("Your bill is " + planC);
			System.out.println("This is what your price would've been with Package A: " + planA);
			System.out.println("This is what your price would've been with Package B: " + planB);
			break;
		default:
			System.out.println("I'm sorry, that is not a package listed.");

		}
		
	}

}

