package javaLab4;

import java.util.Scanner;

public class activity4 {
	
	public static void main(String[] args) {
		
		//get user strings
		Scanner input = new Scanner(System.in);
		System.out.println("Insert 2 sentences, hitting enter after each one.");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		//see if they're the same
		System.out.println(s1.compareTo(s2));
		//insert 2 characters
		System.out.println("Insert 2 characters");
		String charA = input.nextLine();
		String charB = input.nextLine();
		char a = charA.charAt(0);
		char b = charB.charAt(0);
		//check if they're the same
		System.out.println(charA.compareTo(charB));
		
	}

}
