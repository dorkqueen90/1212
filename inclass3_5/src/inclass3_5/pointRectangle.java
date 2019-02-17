package inclass3_5;
/* this is assignment 3.8 in class 'is a point in a rectangle?'
 * @amber sibel
 * @ 2/13/19
 * this program should take a range from the user and generate a random number from that range
 * then check to see if it's in the given rectangle
 */
import java.util.Scanner;

public class pointRectangle {
	
	public static void main(String[] args) {
		//ask for random numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Insert range for x (min to max): ");
		int min = input.nextInt();
		int max = input.nextInt();
		System.out.println("Insert range for y (min to max): ");
		int min2 = input.nextInt();
		int max2 = input.nextInt();
		//generate random numbers
		int randomX = (int)(Math.random() * ((max - min) + 1) + min);
		int randomY = (int)(Math.random() * ((max2 - min2) + 1) + min2);
		//calculate if it's in rectangle: x(-3, 3) y(-5, 5)
		if(randomX < 3 && randomX > -3 && randomY < 5 && randomY > -5) {
			//display results
			System.out.println("The point ( " + randomX + " , " + randomY + " ) is in the rectangle!");	
		}
		else {
			//display other results
			System.out.println("The point ( " + randomX + " , " + randomY + " ) is NOT in the rectangle!");
		}
		
	}

}
/* analysis from paper:
 * you're checking the numbers in their range to see if it's in a rectangle with given points
 * ---
 * steps include:
 * getting their range of numbers
 * generating the random numbers
 * checking the numbers to see if the range is within the rectangle (given points)
 * displaying results depending on if it's inside or not inside the rectangle
 * ---
 * before writing the code you could test it just by using numbers outside of the range given
 * i tested numbers other than the ones given just to be sure it worked
 */
