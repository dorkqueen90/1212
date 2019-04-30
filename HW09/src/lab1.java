import java.util.Scanner;

/* This is the card game lab from HW09
@author amber
@version 4/13/19
This program has two parts. In part one, there will be a card game that asks the user to pick a
number from a normal shuffled 52 card deck. It will then pick a random number between 0-51.
Whichever card is the highest will be displayed.
In part two, there will be two computers playing against each other for 100 turns.
At the end of their game, the winner will be displayed.
 */
public class lab1 {

    public static void main(String[] args) {
        //lab ID
        System.out.println("ID001");
        //create scanner
        Scanner input = new Scanner(System.in);
        //create loop
        for(int i = 0; i < 500; i++){
            //ask user which part they'd like to do
            int choice;
            do {
                System.out.println("Which part would you like to do? (1 or 2)");
                while (!input.hasNextInt()) {
                    System.out.println("Please insert number 1 or 2.");
                    input.next();
                }
                choice = input.nextInt();
            } while(choice != 1 && choice != 2 && choice != -1);
            if(choice == -1){
                System.out.println("Goodbye.");
                break;
            }
            switch(choice){
                case 1: //part 1
                    String[] sdeck = shuffleDeck(makeDeck());
                    int player1;
                    do {
                        System.out.println("Enter a card location from 0 to 51: ");
                        while (!input.hasNextInt()) {
                            System.out.println("Please make sure you're entering an integer between 0 and 51.");
                            input.next();
                        }
                        player1 = input.nextInt();
                    } while(!(player1 >= 0) && !(player1 <= 51));
                    //get computers choice
                    int player2 = (int)(Math.random() * 51);
                    //display player1's card
                    System.out.println("You had a " + sdeck[player1]);
                    //display player2's card
                    System.out.println("Computer has a " + sdeck[player2]);
                    //display winner
                    int winner = determineWinner(sdeck, player1, player2);
                    if(winner == 1){
                        System.out.println("You had a higher card!");
                    }
                    else
                        System.out.println("Computer had a higher card.");
                    break;
                case 2: //part 2
                    sdeck = shuffleDeck(makeDeck());
                    int counter1 = 0;
                    int counter2 = 0;
                    //make loop
                    for(int k = 0; k < 100; k++) {
                        //get player1 index
                        player1 = (int) (Math.random() * 51);
                        //get player2 index
                        player2 = (int) (Math.random() * 51);
                        //display winner
                         winner = determineWinner(sdeck, player1, player2);
                        if (winner == 1) {
                            System.out.println("Computer 1 had a higher card: " + sdeck[player1]);
                            counter1++;
                        } else if (winner == 2) {
                            System.out.println("Computer 2 had a higher card: " + sdeck[player2]);
                            counter2++;
                        } else
                            System.out.println("Tie");
                    }
                    //display player1 wins
                    System.out.println("Computer 1 had " + counter1 + " wins.");
                    //display player2 wins
                    System.out.println("Computer 2 had " + counter2 + " wins.");
                    //display winner
                    if(counter1 > counter2)
                        System.out.println("Computer 1 won the game.");
                    else
                        System.out.println("Computer 2 won the game.");
                    break;
            }
        }
    }


    public static String[] makeDeck() {
        String[] deck = new String[52];
        String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        //initiate
        int counter = 0;
        for (int k = 0; k < suits.length; k++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[counter] = ranks[j] + " of " + suits[k];
                counter++;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        //shuffle cards
        for (int i = 0; i < deck.length; i++) {
            //generate index at random
            int index = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        return deck;
    }
    public static int determineWinner(String[] shuffleDeck, int player1, int player2){
        //create winner
        int winner = 0;
        //bring in suits and ranks
        String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        //players cards
        String card1 = shuffleDeck[player1];
        String card2 = shuffleDeck[player2];
        //card 1 stuff (player 1)
        String c1rank = card1.split(" ")[0];
        String c1suit = card1.split(" ")[2];
        //card 2 stuff (player2)
        String c2rank = card2.split(" ")[0];
        String c2suit = card2.split(" ")[2];
        //linear search
        int index1 = 0;
        int index2 = 0;
        //find index of card1
        for(int i = 0; i < ranks.length; i++){
            if(c1rank.equals(ranks[i])) {
                index1 = i;
            }
        }
        //find index of card2
        for(int i = 0; i < ranks.length; i++){
            if(c2rank.equals(ranks[i])) {
                index2 = i;
            }
        }
        if(index1 < index2){
            winner = 2;
        }
        else if(index1 > index2){
            winner = 1;
        }
        else if(index1 == index2){
            //check suit
            for(int i = 0; i < suits.length; i++){
                if(c1suit.equals(suits[i])){
                    index1 = i;
                }
            }
            for(int i = 0; i < suits.length; i++){
                if(c2suit.equals(suits[i])){
                    index2 = i;
                }
            }
            if(index1 < index2){
                winner = 1;
            }
            else{
                winner = 2;
            }
        }
        return winner;
    }

}
