package flowchart;
/* flowchart exercise 
 * @amber
 * 1/30/19
 * This program should take each store's beginning inventory
 * and subtract the widgets sold, then display the profit for each store
 */
import java.util.Scanner;

public class in_class {
	
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// ask user for input
		System.out.println("Please inset your beginning inventory value: ");
		int begInv = input.nextInt();
		
		// store value in store1, 2, and 3
		int store1 = begInv;
		int store2 = begInv;
		int store3 = begInv;
		
		// store 1 widgets sold
		System.out.println("How many widgets did store 1 sell? ");
		int store1sold = input.nextInt();
		// calculate
		int store1profit = store1 - store1sold;
		
		// store 2 widgets sold
		System.out.println("How many widgets did store 2 sell? ");
		int store2sold = input.nextInt();
		// calculate
		int store2profit = store2 - store2sold;
		
		// store 3 widgets sold
		System.out.println("How many widgets did store 3 sell? ");
		int store3sold = input.nextInt();
		// calculate
		int store3profit = store3 - store3sold;
		
		// display profits
		System.out.println("The widgets sold for store 1 are : " + store1profit);
		System.out.println("The widgets sold for store 2 are : " + store2profit);
		System.out.println("The widgets sold for store 3 are : " + store3profit);
		
		// assign value to widget
		double widget = 10;
		//calculate sales
		double profit1 = store1profit * widget;
		double profit2 = store2profit * widget;
		double profit3 = store3profit * widget;
		
		// 
		
	}

}
