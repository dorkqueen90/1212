/* This is HW03 program 3
 * @auther amber
 * @version 2/1/19
 * This program should display info and cost about a specific car model
 */
import java.util.Scanner;

public class javaLab3 {
	
	public static void main(String[] args) {
		
		//assignment ID
		System.out.println("ID003");
		
		//get car model from user
		Scanner input = new Scanner(System.in);
		System.out.println("What is your car model?");
		String carModel = input.nextLine();
		
		//get initial cost from user
		System.out.println("What is the initial cost?");
		double initialCost = input.nextDouble();
		
		//calculate sales tax
		double salesTax = initialCost * .036;
		double total = initialCost + salesTax;
		
		//calculate membership discount
		double discount = (total * .15);
		double newTotal = total - discount;
		
		//display results
		System.out.println("Your car model is a " + carModel);
		System.out.println("The initial cost is: $"+ initialCost);
		System.out.println("The sales tax is: $" + salesTax);
		System.out.println("The discount is: $" + discount);
		System.out.println("The Final Price is: $" + newTotal);
		
		//commission 
		double commission = (newTotal * .10);
		System.out.println("Salesman commission is: $" + commission);
		
	}

}
