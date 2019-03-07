import java.util.Scanner;

/*  This is case study 5.2.1 -> "Guessing Numbers"
    @author amber sibel
    @version 3/7/19
    This program should randomly generate an int between 0-100. The program asks the user for input until their
    input matches the random number. It tells user if input is too low/high.
 */
public class Guessing_Numbers {

    public static void main(String[] args){
        //id for lab
        System.out.println("ID001");
        //generate random number between 0-100
        int number = (int)(Math.random() * 101);
        //get user guess
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;
        while(guess != number){
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }

    }
}
