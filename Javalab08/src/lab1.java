import java.util.Scanner;

/* This is lab 1 from lab08.
 * @author amber
 * @version 4/8/19
 * This program should use an array of 10 integers from the user and search via index.
 */
public class lab1 {

	public static void main(String[] main) {
		// declare array
		int[] arr = new int[10];
		// create scanner
		Scanner input = new Scanner(System.in);
		// loop for user to input data
		System.out.println("Enter " + arr.length + " values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		// search based on index position. loop until -1
		for (int i = 0; i < 200; i++) {
			System.out.println("Enter index position (enter -1 to exit):");
			int pos = input.nextInt();

			if (pos > 10) {
				System.out.println("Sorry, that is out of bounds.");
				System.out.println("Enter an index position: ");
				pos = input.nextInt();
			}
			if (pos == -1) { // exit option
				break;
			}
			int index = arr[pos];
			if (index < arr.length) {
				System.out.println(index);
			}
		}
	}

}
