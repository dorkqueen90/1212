package javalab2;
/* this is part 2 of activity 6
 * @amber and alex
 * 1/28/19
 * this program should calculate how many weeks are in the days of her vacation
 */
import java.util.Scanner;

public class activity6part2 {
	
	public static void main(String[] args) {
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//ask her how many days of vacation she took
		System.out.println("How many days of vacation did you take?");
		double days = input.nextDouble();
		
		//calculate how many weeks that is
		double weeks = ((int)days) / 7;
		
		//calculate how many weeks and days there are
		double vacation = days % 7;
		
		//display results
		System.out.println("Your vacation was " + weeks + " weeks and " + vacation + " days!");
		
	}

}
