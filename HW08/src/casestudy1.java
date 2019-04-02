import java.util.Scanner;

/* This is a case study in HW08 - Analyzing Numbers
 * @author amber
 * @version 4/2/19
 * This program should find the number of items above the average of all items.
 */
public class casestudy1 {

	public static void main(String[] args) {
		// ID
		System.out.println("ID001");
		// create scanner
		Scanner input = new Scanner(System.in);
		// get the num of items
		System.out.println("Enter the number of items: ");
		int n = input.nextInt();
		// create array
		double[] numbers = new double[n];
		double sum = 0;
		// get numbers
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		double average = sum / n;
		// num of elements above average
		int count = 0;
		for (int i = 0; i < n; i++)
			if (numbers[i] > average)
				count++;

		System.out.println("Average is " + average);
		System.out.println("Number of elements above average is " + count);
	}

}
