package javaLab4;

import java.util.Scanner;

/* this is activity 3 in lab 4
 * @amber
 * @2/25/19
 */
public class activity3 {
	
	public static void main(String[] args) {
		
		//enter thoughts on lab TA's
		Scanner input = new Scanner(System.in);
		System.out.println("What are your thoughts on the lab TA's? (2 sentences, hit enter after each)");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
				
		//concatenate these into 1 string
		String s3 = s1.concat(s2);
		System.out.println(s3);
				
		//character at index 0
		System.out.println(s3.charAt(0));
		
		//character at last index
		System.out.println(s3.charAt(s3.length()-1));
		
		//character at middle index
		int middle = (s3.length())/2;
		System.out.println(s3.charAt(middle));
		
		
		
	}

}
