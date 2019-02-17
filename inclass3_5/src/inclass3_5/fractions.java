package inclass3_5;
/* this is the in class assignment 'check fractions'
 * @amber
 * @ 2/13/19
 * this program should ask user for the fraction, then turn it into a proper fraction
 * (depending on input)
 */
import java.util.Scanner;

public class fractions {
	
	public static void main(String[] args) {
		//ask for numerator and denominator
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert a numerator and denominator: ");
		int numerator = input.nextInt();
		int denom = input.nextInt();
		//determine if improper fraction
		//calculate if %c = 0 
		if(numerator % denom == 0) {
			//variable for %
			int reduced = (numerator / denom);
			System.out.println(numerator + " / " + denom + " can be reduced by " + reduced);
		}
		//calculate improper fraction
		else if(numerator > denom ) {
			int reduced = numerator / denom;
			int newnum = numerator % denom;
			System.out.println(numerator + " / " + denom + " is an improper fraction and its mixed fraction is " + reduced + " + " + newnum + " / " + denom);
		}
		//display if it's a proper fraction
		else {
			System.out.println(numerator + " / " + denom + " is a proper fraction!");
		}
	}

	
}
/* analysis from worksheet:
 * the problem was turning an improper fraction into a proper one
 * --
 * steps include:
 * getting numerator and denominator from user
 * deciding if it was reducable, proper, or improper
 * calculating the reduction and improper fractions
 * displaying the results based on the input given
 * -----
 * i used the test data from the example above and came up with my own
 * i had an issue at first with my logic, but then swapped 2 statements in the if statement
 * now it works great!
 */
