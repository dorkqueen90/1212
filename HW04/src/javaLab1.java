import java.util.Scanner;

/*  This is for HW04, lab 1 - Pick a card
    @author amber sibel
    @version 2/23/19
    This program should simulate picking a card from a deck of 52 cards. It should display the rank and suit
    Steps include:
    - getting user input if they'd like to play
    - create if statement regarding their decision
    - create random numbers tied to rank and suit
    - create if statement tied to rank and suit
    - display their card
 */
public class javaLab1 {

    public static void main(String[] args){
        //show ID for assignment
        System.out.println("ID001");
        //ask if user would like to pick a card
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick a card? Y/N");
        String c = input.nextLine().toLowerCase();
        char choice = c.charAt(0);
        //if statement regarding choice
        //if yes -> random # between 1-13 -> faceValue
        if(choice == 'y'){
            System.out.print("You got a ");
            int faceValue = (int)((Math.random()*13)+1);
            //random # between 0-3 -> suit
            int suit = (int)(Math.random()*3);
            //if statement with ranks
            if(faceValue == 1){
                System.out.print("Ace");
            }
            else if(faceValue == 11){
                System.out.print("Jack");
            }
            else if(faceValue == 12){
                System.out.print("Queen");
            }
            else if(faceValue == 13){
                System.out.print("King");
            }
            else{
                System.out.print(faceValue);
            }
            if(suit == 0){
               System.out.print(" of Hearts");
            }
            else if(suit == 1){
                System.out.print(" of Diamonds");
            }
            else if(suit == 2){
                System.out.print(" of Clubs");
            }
            else if(suit == 3){
                System.out.print(" of Spades");
            }

        }
        else {
            System.out.println("Your loss.");
        }

        //display result
    }
}
