package inclass3_5;

import java.util.Scanner;

public class teamProgramming {
	
	public static void main(String[] args) {
		
		//get users name
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last name: ");
		String name = input.nextLine();
		
		//capitalize the first letter of each word
		String capFirst = "";
		Scanner lineScan = new Scanner(name);
		while(lineScan.hasNext()) {
			String word = lineScan.next();
			capFirst += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		
		//display name in caps
		System.out.println("You entered: " + capFirst.trim());
		
		//store new variable in old variable
		name = capFirst;
		
		//ask user for single character to search for. if in name -> display index
		System.out.println("Enter a character: ");
		char c = input.nextLine().charAt(0);
		System.out.println(name.indexOf(c));
		
		//have user enter another string
		System.out.println("Enter another string: ");
		String s1 = input.nextLine();
		
		//display message if string is within original name
		boolean doesItWork = name.contains(s1);
		if(doesItWork == true) {
			System.out.println("This was in our string!  " + name.indexOf(s1));
		}
		else {
			System.out.println("This was not in our string. =(");
		}
		
	}

}
