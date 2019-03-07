import java.util.Scanner;

/*  This is lab 2 of hw 4 -> Palindrome Number
    @author amber
    @version 2/23/19
    This program should get a 3 digit num from user and decide if it's a palindrome num.
 */
public class javaLab2 {

    public static void main(String[] args){
        //id for assignment
        System.out.println("ID002");
        //get number from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a palindrome: ");
        int num = input.nextInt();
        //decide if num is palindrome
        int firstDigit = num / 100;
        num = num % 10;
        if(firstDigit == num){
            System.out.println("This was a palindrome.");
        }
        else{
            System.out.println("This was not a palindrome.");
        }

    }
}
