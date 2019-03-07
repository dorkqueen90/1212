package javaLab4;

import java.util.Scanner;

public class activity6 {
	
	public static void main(String[] args) {
		
		//divide 2 # = 2 places after decimal point (make sure no runtime if /0)
		//ask for numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert 2 numbers to divide: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		double num3 = num1 / num2;
		double num4 = (double)Math.round(num3 * 100)/100;
		
		if(num2 == 0) {
			System.out.println("Sorry, you can't divide by 0!");
		}
		else {
			System.out.println(num4);
		}
		
	}

}
