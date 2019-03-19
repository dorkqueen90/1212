package inclass3_5;

import java.util.Scanner;

	public class Calculator{
	  public static void main(String[] args){
	     Scanner scan = new Scanner(System.in);
	     int choice = 0;
	    do{
	     choice = displayMenu();
	    
	     if(choice == 1){
	       System.out.print("Enter two numbers to add: ");
	       int num1 = scan.nextInt();
	       int num2 = scan.nextInt();
	       System.out.println("Sum = " + add(num1, num2));
	     }
	     if(choice == 2) {
	    	 System.out.println("Enter two numbers to subtract: ");
	    	 int num1 = scan.nextInt();
	    	 int num2 = scan.nextInt();
	    	 System.out.println("Total = " + subtract(num1, num2));
	     }
	     if(choice == 3) {
	    	 System.out.println("Enter two decimal numbers to subtract: ");
	    	 double num1 = scan.nextDouble();
	    	 double num2 = scan.nextDouble();
	    	 System.out.println("Total = " + subtract(num1, num2));
	     }
	     if(choice == 4) {
	    	 System.out.println("Enter two decimal numbers to multiply: ");
	    	 double num1 = scan.nextDouble();
	    	 double num2 = scan.nextDouble();
	    	 System.out.println("Total = " + multiply(num1, num2));
	     }
	     if(choice == 5) {
	    	 System.out.println("Enter two decimal numbers to divide: ");
	    	 double num1 = scan.nextDouble();
	    	 double num2 = scan.nextDouble();
	    	 System.out.println("Total = " + divide(num1, num2));
	     }
	    }
	    while(choice != 6); {
	    	System.out.println("Thank you. Bye!");
	    }
	     
	  }

	  public static int displayMenu(){
		Scanner scan = new Scanner(System.in);
		int choice = 0;
	    System.out.println("1. Add");
	    System.out.println("2. Subtract");
	    System.out.println("3. Subtract with doubles");
	    System.out.println("4. Multiple");
	    System.out.println("5. Divide");
	    System.out.println("6. Quit");
	    System.out.print("Enter your choice: ");
	     choice = scan.nextInt();
	     return choice;
	 }

	 public static int add(int a, int b){
	    int sum = a + b;
	    return sum;
	 }

	 public static int subtract(int a, int b){
	    return a - b;
	 }

	 public static double subtract(double a, double b){
	    // Complete the code here. Pay attention to data types!
		 return (double)a - (double)b;
	 }

	 // Create a multiplication method that returns a double
	 public static double multiply(double a, double b) {
		 return (double)a * (double)b;
	 }
	 // Create a division method that returns a double
	 public static double divide(double a, double b) {
		 return (double)a / (double)b;
	 }
}
