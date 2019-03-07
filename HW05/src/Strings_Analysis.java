import java.util.Scanner;

/*  This is from HW04 - lab 2 -> "String Analysis"
    @author amber sibel
    @version 3/7/19
    This program should get a string from the user, let them enter a letter, an index #, then test the string legnth,
    index of the letter, and letter at the index number.
    Steps include:
    - Displaying the lab ID
    - Getting input (string, letter, number)
    - Testing string (length, letter, number)
    - Add safeguard for indexes larger than string ("Not Valid")
 */
public class Strings_Analysis {

    public static void main(String[] args){
        //display lab ID
        System.out.println("ID002");
        //get a string from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String s1 = input.nextLine();
        //get a letter from user
        System.out.println("Enter a letter: ");
        String letter = input.nextLine();
        char let = letter.charAt(0);
        //get a number from user
        System.out.println("Enter a slot number: ");
        int num = input.nextInt();

        //variables
        int length = s1.length();
        int letIndex;
        char numIndex;

        //display the string length
        System.out.println("The string length is: " + length);

        //check out of bounds
        boolean doesItWork = s1.contains(letter);
        if(doesItWork == true){
            letIndex = s1.indexOf(let);
            //display the index of letter
            System.out.println("The slot number of letter " + let + " is: " + letIndex);
        }
        else{
            System.out.println("The slot number of letter " + let + " is: Not Valid");
        }

        if(num < length){
            numIndex = s1.charAt(num);
            //display the index of number
            System.out.println("The letter at slot " + num + " is: " + numIndex);
        }
        else{
            System.out.println("The letter at slot " + num + " is: Not Valid");
        }

    }
}
