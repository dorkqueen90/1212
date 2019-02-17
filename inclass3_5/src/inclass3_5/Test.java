package inclass3_5;
	
import java.util.*;

public class Test{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num;

    System.out.print("Enter a number: ");
    num = scan.nextInt();

    // Check if a number is even or odd
    switch(num % 2){
      case 0:
        System.out.println("Num is odd!");
        break;
      case 1:
        System.out.println("Num is even!");
        break;
    } // End switch-case

  } // End main
} // End class


