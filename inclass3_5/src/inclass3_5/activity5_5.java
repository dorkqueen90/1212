package inclass3_5;

import java.util.Arrays;
import java.util.Scanner;

public class activity5_5 {
	
	public static void main(String[] args) {
		
		
		//ask user for string
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = input.nextLine();
			
		char[] ar = new char[s1.length()];
			for(int i = 0; i < s1.length(); i++) {
				ar[i] = s1.charAt(i);
			}
			for(int i = 0; i < ar.length; i++) {
				System.out.println(ar[i]);
			}
			System.out.println(Arrays.toString(ar));
		
		
	}

}
