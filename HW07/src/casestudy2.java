/* This is case study: Passing Arguments by Values - Listed Program
 * @author amber
 * @version 3/29/19
 * This program is similar to the increment program, except it uses a swap method
 *  and the value doesn't change.
 */
public class casestudy2 {

	public static void main(String[] args) {
		// ID
		System.out.println("ID002");
		// variables
		int num1 = 1;
		int num2 = 2;
		System.out.println("Before invoking the swap method, num1 is " + num1 + " and " + "num2 is " + num2);
		// invoke swap method
		swap(num1, num2);
		// display final numbers
		System.out.println("After invoking the swap method, num1 is " + num1 + " and " + "num2 is " + num2);
	}

	public static void swap(int n1, int n2) {
		// swap two variables
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
		// swap n1 and n2
		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
	}

}
