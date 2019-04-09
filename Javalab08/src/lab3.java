/* This is lab3 in lab08
 * @author amber
 * @version 4/8/19
 * This program will have a variable of 50 random numbers (1-1000).
 * It will find the highest, lowest, average, above average, and below average of the array. 
 */
public class lab3 {

	public static void main(String[] args) {
		// create array
		int[] arr = new int[50];
		// insert random numbers between 1-1000
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 1000) + 1);
		}
		// show highest number
		int num = 0;
		System.out.println("Highest: " + getHighest(arr, num));
		// show lowest number
		System.out.println("Index of lowest: " + getLowest(arr, num));
		// show average of all elements
		System.out.println("Average: " + getAverage(arr, num));
		// show all elements above the average
		System.out.println("Above average: ");
		aboveAverage(arr, num);
		// show all elements below average
		System.out.println("\nBelow average: ");
		belowAverage(arr, num);
	}

	public static void belowAverage(int[] a, int b) {
		// find and display all elements below average
		int average = getAverage(a, b);
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < average) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void aboveAverage(int[] a, int b) {
		// find and display all elements above the average
		int average = getAverage(a, b);
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > average) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static int getAverage(int[] a, int b) {
		// find average of all elements
		b = a.length - 1;
		// sum all elements
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		int average = total / b;
		return average;
	}

	public static int getLowest(int[] a, int b) {
		// find lowest in array and display index
		int low = a[0];
		int lowIndex = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < low) {
				low = a[i];
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	public static int getHighest(int[] a, int b) {
		// find highest in array
		int max = a[0];
		int maxIndex = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				maxIndex = i;
			}
		}
		return max;
	}

}
