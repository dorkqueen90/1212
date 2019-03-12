package javalab5;

import java.util.Arrays;
import java.util.Scanner;

public class javalab2 {
	
	public static void main(String[] args) {
		String s1 = "";
		String finalStr = "";
		boolean flagFalse = false;
		Scanner input = new Scanner(System.in);
		//loop where user enters string until they exit
		
			System.out.println("Enter a string: ");
			while(true) {
			s1 = input.nextLine();
			
			if(s1.equalsIgnoreCase("exit")) {
				break;
			}
			else
				finalStr = finalStr.concat(s1 + " ");
		}
			System.out.println(finalStr);
	}

}
