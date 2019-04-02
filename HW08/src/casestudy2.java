/* This is HW08, casestudy2 - Deck of Cards
 * @author amber
 * @version 4/2/19
 * This program will randomly select 4 cards from a deck of cards
 */
public class casestudy2 {

	public static void main(String[] args) {
		// ID
		System.out.println("ID002");
		// create deck array
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		// initiate cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		// shuffle cards
		for (int i = 0; i < deck.length; i++) {
			// generate random index
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		// display first four cards
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}

}
