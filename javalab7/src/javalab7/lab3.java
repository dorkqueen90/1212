package javalab7;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		// ask for values
		System.out.println("Enter 3 values: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("Your highest grade is: " + getHighest(num1, num2, num3));
		System.out.println("Your lowest grade is: " + getLowest(num1, num2, num3));
		System.out.println("Your average grade is: " + getAverage(num1, num2, num3));
		// close scanner
		input.close();
	}

	public static int getAverage(int a, int b, int c) {
		// generate average
		int average = (a + b + c) / 3;
		return average;
	}

	public static int getLowest(int a, int b, int c) {
		// sort lowest and display
		int low1 = Math.min(a, b);
		int low2 = Math.min(b, c);
		int lowest;
		if (low1 < low2)
			lowest = low1;
		else
			lowest = low2;
		return lowest;
	}

	public static int getHighest(int a, int b, int c) {
		// sort highest and display
		int high1 = Math.max(a, b);
		int high2 = Math.max(b, c);
		int highest;
		if (high1 < high2)
			highest = high2;
		else
			highest = high1;
		return highest;
	}

}
