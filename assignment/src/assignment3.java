import java.util.Scanner;

/* This is assignment 3 - Search and Sort
 * @author Amber Sibel
 * @version 4/2/19
 * This program should display a menu of options for the user, repeating until they choose to quit.
 * Steps include:
 * Showing menu of options
 * Get choice from user
 * Display the library info to user
 * Ask user for book ID and num of books they wish to purchase
 * Update quantity of books
 * Display info that was requested by user
 * Use either linear or binary search for book (users choice)
 * Generate 10 rand nums between 1-500 and store in array
 * Sort numbers based on user choice (bubble or selection)
 */
public class assignment3 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		// create arrays
		String[] bookTitle = { "Starting out with Java", "Java Programming", "Software Structures",
				"Design and Analysis Algorithms", "Computer Graphics", "Artificial Intelligence: A Modern Approach",
				"Probability and Statistics", "Cognitive Science", "Modern Information Retreival",
				"Speech and Language Processing" };
		int[] bookID = { 1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800, 1999 };
		double[] bookPrice = { 102.32, 43.25, 54.00, 67.32, 105.00, 113.22, 20.00, 42.45, 32.11, 123.75 };
		int[] quantityAvailable = { 11, 12, 13, 12, 14, 12, 19, 15, 18, 19 }; // inside loop to update?
		// create loop
		for (int i = 0; i < 500; i++) {
			// display menu
			System.out.println("1. Linear Search\n2. Binary Search\n3. Bubble Sort\n4. Selection Sort\n5. Quit");
			System.out.println("Enter a number between 1-5");
			int choice = input.nextInt();
			if (choice == 5) {
				break;
			}
			switch (choice) {
			case 1: // linear search
				// display table
				display(bookID, bookTitle, bookPrice);
				// ask user for book ID
				// ask user for num of books they wish to purchase
				// make sure it's available
				// update quantity of book (quantityAvailable array)
				// display book ID, title, num of books bought, total cost of purchase
				System.out.println(linearSearch());
				break;
			case 2: // binary search
				// ask user for book ID
				// ask user for num of books they wish to purchase
				// make sure it's available
				// update quantity of book (quantityAvailable array)
				// display book ID, title, num of books bought, total cost of purchase
				System.out.println(binarySearch());
				break;
			case 3: // bubble sort
				// generate 10 random numbers between 1-500 and store in array
				// sort based on user's choice
				// display unsorted and sorted array
				System.out.println(bubbleSort());
				break;
			case 4: // selection sort
				// generate 10 random numbers between 1-500 and store in array
				// sort based on user's choice
				// display unsorted and sorted array
				System.out.println(selectionSort());
				break;
			}
		}
		// close scanner
		input.close();
	}

	public static char[] selectionSort() {
		// selection sort elements of an unsorted array
		return null;
	}

	public static int[] bubbleSort() {
		// bubble sort elements of an unsorted array
		return null;
	}

	public static int[] binarySearch() {
		// search for book ID, return index or -1 if not found
		return null;
	}

	public static char[] linearSearch() {
		// returns index position or -1 if not found
		return null;
	}

	public static void display(int[] ID, String[] title, double[] price) {
		// display information in tabular form
		for (int i = 0; i < ID.length; i++) {
			if (title.length > 35 && title.length < 55)
				System.out.println(ID[i] + "\t" + title[i] + "\t" + price[i]);
			else if (title.length > 25 && title.length < 35)
				System.out.println(ID[i] + "\t" + title[i] + "\t\t" + price[i]);
			else if (title.length < 20)
				System.out.println(ID[i] + "\t" + title[i] + "\t\t\t" + price[i]);
		}
	}

}
