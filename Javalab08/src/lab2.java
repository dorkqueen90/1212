import java.util.Scanner;

/* This is lab 2 in Lab08.
 * @author amber
 * @version 4/8/19
 * This program should fill the array with random numbers from 1 to the user's choosing.
 * Asks user to search for an int, displays index of position. No element found option.
 */
public class lab2 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		// ask for how big the array should be
		System.out.println("How big do you want your array?!?");
		int s = input.nextInt();
		// create array
		int[] arr = new int[s];
		// fill array with random numbers 1-s
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * s) + 1;
			System.out.println(arr[i]);
		}
		// ask user for int to search for
		System.out.println("Insert an integer: ");
		int r = input.nextInt();
		// search arr for r
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == r) {
				System.out.println(r + " is found at : " + i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No element found");
		}
	}

}
