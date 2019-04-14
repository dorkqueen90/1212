import java.text.DecimalFormat;
import java.util.Scanner;

/* This is assignment 3 - Search and Sort
 * @author Amber Sibel
 * @version 4/2/19
 * This program should display a menu of options for the user, repeating until they choose to quit.
 * Menu options include linear search, binary search, bubble sort, and selection sort.
 * Steps include:
 * Showing menu of options
 * Get choice from user
 * Display the library info to user (in order from lowest to highest quantity)
 * Ask user for book ID and num of books they wish to purchase
 * Update quantity of books
 * Display info that was requested by user (ID, title, quantity, and total price)
 * Use either linear or binary search for book (users choice)
 * Generate 10 rand nums between 1-500 and store in array
 * Sort numbers based on user choice (bubble or selection)
 * Display unsorted and sorted array.
 * Add elapsed time to each method and display at the end.
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
		int[] quantityAvailable = { 11, 12, 13, 12, 14, 12, 19, 15, 18, 19 };
		//variables for elapsed time
		long startTime = 0;
		long endTime = 0;
		long duration = 0;
		double seconds = 0.0;
		// create loop
		for (int i = 0; i < 500; i++) {
			// generate 10 random numbers between 1-500 and store in array (for sort methods)
			int[] random = new int[10];
			for(int m = 0; m < random.length; m++){
				random[m] = (int)(Math.random() * 500) + 1;
			}
			// display menu
			System.out.println("\n1. Linear Search\n2. Binary Search\n3. Bubble Sort\n4. Selection Sort\n5. Quit");
			System.out.println("Enter a number between 1-5");
			int choice = input.nextInt();
			if (choice == 5) {
				break;
			}
			switch (choice) {
			case 1: // linear search
				//start time
				startTime = System.nanoTime();
				// display table
				display(bookID, bookTitle, bookPrice, quantityAvailable);
				// ask user for book ID
				System.out.println("Please enter the Book ID: ");
				int idRequested = input.nextInt();
				//find index of book
				int index = linearSearch(bookID, idRequested);
				if (index == -1){
					System.out.println("Sorry, that ID doesn't exist.\nGoodbye.");
					break;
				}
				// ask user for num of books they wish to purchase
				System.out.println("How many would you like to purchase?");
				int quantityRequested = input.nextInt();
				//see how many are available
				if(quantityAvailable[index] >= quantityRequested) {
					// display book ID, title, num of books bought, total cost of purchase
					System.out.println("Book ID: " + bookID[index]);
					System.out.println("Book Title: " + bookTitle[index]);
					System.out.println("Number of books bought: " + quantityRequested);
					System.out.println("Total cost of purchase: " + String.format("%.2f",(quantityRequested * bookPrice[index])));
					//update quantity
					quantityAvailable[index] = (quantityAvailable[index] - quantityRequested);
					//end time
					endTime = System.nanoTime();
					duration = endTime - startTime;
					seconds = (double)duration / 1_000_000_000.0;
					System.out.println("\nElapsed time: " + new DecimalFormat("#.##########").format(seconds) + " seconds.");
				}
				else{
					System.out.println("Sorry, that quantity is unavailable.\nGoodbye.");
					//end time
					endTime = System.nanoTime();
					duration = endTime - startTime;
					seconds = (double)duration / 1_000_000_000.0;
					System.out.println("\nElapsed time: " + new DecimalFormat("#.##########").format(seconds) + " seconds.");
				}
				break;
			case 2: // binary search
				//start time
				startTime = System.nanoTime();
				//display table
				display(bookID, bookTitle, bookPrice, quantityAvailable);
				// ask user for book ID
				System.out.println("Please enter the Book ID: ");
				idRequested = input.nextInt();
				//find index of book
				index = binarySearch(bookID, idRequested);
				// ask user for num of books they wish to purchase
				System.out.println("How many would you like to purchase?");
				quantityRequested = input.nextInt();
				//see how many are available
				if(quantityAvailable[index] >= quantityRequested) {
					// display book ID, title, num of books bought, total cost of purchase
					System.out.println("Book ID: " + bookID[index]);
					System.out.println("Book Title: " + bookTitle[index]);
					System.out.println("Number of books bought: " + quantityRequested);
					System.out.println("Total cost of purchase: " + String.format("%.2f",(quantityRequested * bookPrice[index])));
					//update quantity
					quantityAvailable[index] = quantityAvailable[index] - quantityRequested;
					//end time
					endTime = System.nanoTime();
					duration = endTime - startTime;
					seconds = (double)duration / 1_000_000_000.0;
					System.out.println("\nElapsed time: " + new DecimalFormat("#.##########").format(seconds) + " seconds.");
				}
				else{
					System.out.println("Sorry, that quantity is unavailable.\nGoodbye.");
					//end time
					endTime = System.nanoTime();
					duration = endTime - startTime;
					seconds = (double)duration / 1_000_000_000.0;
					System.out.println("\nElapsed time: " + new DecimalFormat("#.##########").format(seconds) + " seconds.");
				}
				break;
			case 3: // bubble sort
				//start time
				startTime = System.nanoTime();
				// display unsorted array
				System.out.println("Unsorted array: \n");
				for(int k = 0; k < random.length; k++){
					System.out.print(random[k] + " ");
				}
				// display sorted array
				System.out.println("\nSorted array: \n");
				for(int n : bubbleSort(random)) {
					System.out.print(n + " ");
				}
				//end time
				endTime = System.nanoTime();
				duration = endTime - startTime;
				seconds = (double)duration / 1_000_000_000.0;
				System.out.println("\nElapsed time: " + new DecimalFormat("#.##########").format(seconds) + " seconds.");
				break;
			case 4: // selection sort
				//start time
				startTime = System.nanoTime();
				// display unsorted array
				System.out.println("Unsorted array: \n");
				for(int j = 0; j < random.length; j++){
					System.out.print(random[j] + " ");
				}
				// display sorted array
				System.out.println("\nSorted array: \n");
				for(int l : selectionSort(random)) {
					System.out.print(l + " ");
				}
				//end time
				endTime = System.nanoTime();
				duration = endTime - startTime;
				seconds = (double)duration / 1_000_000_000.0;
				System.out.println("\nElapsed time: " + new DecimalFormat("#.##########").format(seconds) + " seconds.");
			}
		}
		// close scanner
		input.close();
	}

	public static int[] selectionSort(int[] r) {
		// selection sort elements of an unsorted array
		for(int i = 0; i < r.length - 1; i++){
			//find minimum
			int currentMin = r[i];
			int currentMinIndex = i;

			for(int k = i + 1; k < r.length; k++){
				if(currentMin > r[k]){
					currentMin = r[k];
					currentMinIndex = k;
				}
			}
			//swap r[i] w/ r[currentMinIndex]  if needed
			if(currentMinIndex != i){
				r[currentMinIndex] = r[i];
				r[i] = currentMin;
			}
		}
		return r;
	}

	public static int[] bubbleSort(int[] r) {
		// bubble sort elements of an unsorted array
		for(int i = 1; i < r.length; i++){
			for(int k = 0; k < r.length - i; k++){
				if(r[k] > r[k + 1]){
					//swap r[k] w/ r[k + 1]
					int temp = r[k];
					r[k] = r[k + 1];
					r[k + 1] = temp;
				}
			}
		}
		return r;
	}

	public static int binarySearch(int[] ID, int idr) {
		// search for book ID, return index or -1 if not found
		// make sure it's available
		int low = 0;
		int high = ID.length - 1;
		int index = 0;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (idr < ID[mid])
				high = mid - 1;
			else if (idr == ID[mid]) {
				index = mid;
				return index;
			}
			else
				low = mid + 1;
		}
		index = -low - 1;
		return index;
	}

	public static int linearSearch(int[] ID,  int idr) {
		// returns index position or -1 if not found
		// make sure it's available
		int index = 0;
		for(int i = 0; i < ID.length; i++){
			if(idr == ID[i]) {
				index = i;
				return index;
			}
		}
		index = -1;
		return index;
	}


	public static void display(int[] ID, String[] title, double[] price, int[] quantity) {
		// display information in tabular form
		//sort and display by quantity
		sort(ID, title, price, quantity);
		System.out.printf("%-10s" , "Book ID");
		System.out.printf("%-45s" , "Title");
		System.out.printf("%10s" , "Cost");
		System.out.printf("%12s%n" , "Quantity");
		for (int i = 0; i < ID.length; i++) {
				System.out.printf("%-10d" , ID[i]);
				System.out.printf("%-45s" , title[i]);
				System.out.printf("%10.2f" , price[i]);
				System.out.printf("%10d%n" , quantity[i]);
		}
	}
	public static void sort(int[] ID, String[] title, double[] price, int[] quantity){
		//sort and display by quantity
		for(int i = 1; i < quantity.length; i++){
			for(int k = 0; k < quantity.length - i; k++){
				if(quantity[k] > quantity[k + 1]){
					//swap arrays[k] w/ arrays[k + 1]
					//quantity
					int tempQ = quantity[k];
					quantity[k] = quantity[k + 1];
					quantity[k + 1] = tempQ;
					//ID
					int tempID = ID[k];
					ID[k] = ID[k + 1];
					ID[k + 1] = tempID;
					//title
					String tempT = title[k];
					title[k] = title[k + 1];
					title[k + 1] = tempT;
					//price
					double tempP = price[k];
					price[k] = price[k + 1];
					price[k + 1] = tempP;
				} // ^ are you sure this is only worth 10 points? oof.
			}
		}
	}
}
