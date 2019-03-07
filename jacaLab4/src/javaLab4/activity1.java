package javaLab4;
/* this is activity 1 in lab 4
 * @amber sibel
 * @ 2/25/19
 */
import java.util.Scanner;

public class activity1 {
	
	public static void main(String[] args) {
		
		//ask user for name
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your first name: ");
		String fName = input.nextLine();
		System.out.println("Please insert your last name: ");
		String lName = input.nextLine();
		
		//print new string showing last, first
		System.out.println(lName.concat(fName));
	}

}
