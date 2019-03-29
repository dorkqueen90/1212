/* This is case study: Increment - Listed Program
 * @author amber
 * @version 3/29/19
 * This program should display c before and after it is invoked my the method.
 */
public class casestudy1 {

	public static void main(String[] args) {
		// ID
		System.out.println("ID001");
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment(x); // invoke method
		System.out.println("After the call, x is " + x);

	}

	public static void increment(int n) {
		// increment n
		n++;
		System.out.println("n inside the method is " + n);
	}

}
