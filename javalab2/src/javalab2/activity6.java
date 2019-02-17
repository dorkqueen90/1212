package javalab2;
/* this is activity 6
 * @amber and alex
 * 1/28/19
 * this program should calculate a waitress tip + the bill
 */
import java.util.Scanner;

public class activity6 {
	
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// insert bill
		System.out.println("Please insert the bill :");
		double bill = input.nextDouble();
				
		//calculate the tip
		double billWithTip = (bill * .15) + bill;
				
		// display results
		System.out.println("With a 15% tip, your bill is : " + billWithTip);
		
	}

}
