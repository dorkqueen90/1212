/* This is casestudy 3 in HW08 - Counting the Occurrences of Each Letter
 * @author Amber
 * @version 4/2/19
 * This program should count the occurrences of each letter in an array of characters.
 */
public class casestudy3 {

	public static void main(String[] args) {
		// ID
		System.out.println("ID003");
		// declare array
		char[] chars = createArray();
		// display array
		System.out.println("The lowercase letters are: ");
		displayArray(chars);
		// count occurrences of each letter
		int[] counts = countLetters(chars);
		// display counts
		System.out.println();
		System.out.println("The occurrences of each letter are: ");
		displayCounts(counts);
	}

	// create array of characters
	public static char[] createArray() {
		// declare array and create it
		char[] chars = new char[100];

		// create lowercase letters randomly and assign to array
		for (int i = 0; i < chars.length; i++)
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		// return array
		return chars;
	}

	// display array of characters
	public static void displayArray(char[] chars) {
		// display 20 on each line
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0)
				System.out.println(chars[i]);
			else
				System.out.println(chars[i] + " ");
		}
	}

	// count occurrences of letters
	public static int[] countLetters(char[] chars) {
		// declare and count array pf 26 int
		int[] counts = new int[26];
		// for each lowercase, count
		for (int i = 0; i < chars.length; i++)
			counts[chars[i] - 'a']++;

		return counts;
	}

	// display counts
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char) (i + 'a'));
			else
				System.out.println(counts[i] + " " + (char) (i + 'a') + " ");
			;
		}
	}

	public class RandomCharacter {

		/** Generate a random lowercase letter */
		public static char getRandomLowerCaseLetter() {
			return getRandomCharacter('a', 'z');
		}

		/** Generate a random uppercase letter */
		public static char getRandomUpperCaseLetter() {
			return getRandomCharacter('A', 'Z');
		}

		/** Generate a random digit character */
		public static char getRandomDigitCharacter() {
			return getRandomCharacter('0', '9');
		}

		/** Generate a random character */
		public static char getRandomCharacter() {
			return getRandomCharacter('\u0000', '\uFFFF');
		}
	}

}
