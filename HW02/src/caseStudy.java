/*
 * @author amber
 * @version 2/1/19
 * 
 * Description:
 * This program should program to play lottery
 * 
 * Pseudocode:
 * import and create scanner
 * generate a lottery number
 * prompt user to enter a guess
 * get digits from lottery
 * get digits from guess
 * check guess
 */
import java.util.Scanner;

public class caseStudy {
	
	public static void main(String[] args) {
		
		//insert assignment id
		System.out.println("ID001");
		
		//generate a lottery number
		int lottery = (int)(Math.random() * 100);
		
		//prompt user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		//get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		//get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		//display information
		System.out.println("The lottery number is " + lottery);
		
		//check guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		
		else if (guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit2)
			System.out.println("Math all digits: you win $3,000");
		
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		
		else
			System.out.println("Sorry, no match");
		
	}

}
