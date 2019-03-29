import java.util.Scanner;

/* This is case study: Modularizing Code - Listed Program
 * @author amber
 * @version 3/29/19
 * This program should get two integers from the user and uses a method to display their
 * greatest common divisor.
 */
public class casestudy3 {

	public static void main(String[] args) {
		// ID
		System.out.println("ID003");
		// create scanner
		Scanner input = new Scanner(System.in);
		// get integers from user
		System.out.println("Enter first Integer:");
		int n1 = input.nextInt();
		System.out.println("Enter second Integer:");
		int n2 = input.nextInt();
		// display divisor
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}

	public static int gcd(int n1, int n2) {
		// get the gcd of 2 integers
		int gcd = 1; // initial gcd is 1
		int k = 2; // possible second

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k; // update gcd
			k++;
		}
		return gcd; // return gcd
	}

}
