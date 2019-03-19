import java.util.Scanner;

/* HW06 - Program 1
 * @author amber
 * @version 3/12/19
 * This program should test a number to see if it's prime.
 * Part 2 should let user enter a max and show all prime numbers leading to that max.
 * 
 * Steps include:
 * - enter assignment ID
 * - allow user to enter a number
 * - decide if it's prime
 * - display results
 * - allow exiting by putting in -1
 * - continue to part 2, allowing user to enter max number
 * - print out all numbers that are prime up until that max number
 */
public class Program1 {
	
	public static void main(String[] args) {
		//insert assignment ID
			System.out.println("ID001");
		//import scanner
		Scanner input = new Scanner(System.in);
		//variables
		int num = 0;
		boolean isPrime = false;
		//create loop
		while(true) {
			//ask for number
			System.out.println("Please insert a number: ");
			num = input.nextInt();
			//create exit
			if(num == -1) {
				break;
			}
			//check prime
			for(int i = 2; i <= num / 2; i++) {
				isPrime = (num % i == 0);
			}
			if(!isPrime) 
				System.out.println(num + " is prime.");
			else 
				System.out.println(num + " is not prime.");
		}
		//reset back to false
		isPrime = false;
		
		//ask user for max number
		System.out.println("Enter max number: ");
		int max = input.nextInt();
		//new loop, check prime, display all primes until max
		for(int i2 = 1; i2 <= max; i2++) {
			for(int i = 2; i <= i2 / 2; i++) {
				isPrime = (i2 % i == 0);
			}
			if(!isPrime) 
				System.out.println(i2 + " is prime.");
			else 
				System.out.println(i2 + " is not prime.");
		}
		input.close();
	}
}
