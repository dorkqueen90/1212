package javalab2;
/* activity 7
 * @amber and alex
 * 1/28/19
 * debugging
 */
import java.util.Scanner; //added this

public class Activity7 {
	public static void main(String[] args){
		int numPets1;
		double numPets2;
		int total; //added semicolon
		
		Scanner input = new Scanner(System.in); //changed scan to input
		
		System.out.println("How many pets do you own?");
		numPets1 = input.nextInt(); //changed scan to input
		
		System.out.print("How many pets does your partner own?");
		numPets2 = input.nextInt(); //changes scan to input
		
		total = numPets1 + (int)numPets2; //got rid of a space and casted int to pets2
		
		System.out.println("Together, you both have " + total + " pets"); //added space
		
	}
}

