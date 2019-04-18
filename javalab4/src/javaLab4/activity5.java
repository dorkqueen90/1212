package javaLab4;

import java.util.Scanner;

public class activity5 {
	
	public static void main(String[] args) {
		//create said string
		String ex = "The trouble with programmers is that you can"
				+ "never tell what a programmer is doing until it's too late";
		//display length
		System.out.println(ex.length()); //no, b/c it starts at 0
		//user enter string
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = input.nextLine();
		
		//see if s1 is in ex
		boolean doesItWork = s1.contains(ex);
		
		//display if it was in it or not and index
		if(doesItWork == true) {
			System.out.println("This was in our string!" + s1.indexOf(ex));
		}
		else {
			System.out.println("This was not in our string. =(");
		}
		//ask to enter a character
		System.out.println("Enter a character: ");
		char c1 = input.nextLine().charAt(0);
		System.out.println(ex.indexOf(c1));
		//ask to insert index
		System.out.println("Enter an index: ");
		int i = input.nextInt();
		System.out.println(ex.charAt(i));
		//display quote with TROUBLE
		String sub1 = ex.substring(0,3);
		String sub2 = ex.substring(4, 11).toUpperCase();
		String sub3 = ex.substring(12, 101);
		String newString = sub1 + sub2 + sub3;
		System.out.println(newString);
		//create new string, display original quote w/ new string
		String s2 = " - Seymour Cray";
		System.out.println(ex.concat(s2));
	}

}
