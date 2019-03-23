import java.util.Scanner;

/* This is lab 3 in HW07 for POST06
 * @author amber
 * @version 3/22/19
 * This program should replace all incidents of a string
 */
public class javalab3 {

	public static void main(String[] args) {
		// lab id
		System.out.println("ID003");
		// get string from user
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a string: ");
		String s1 = input.nextLine();
		System.out.println("Insert a word: ");
		String word1 = input.nextLine();
		// ask for replacement word
		System.out.println("Insert a replacement word: ");
		String word2 = input.nextLine();
		// locate word and replace with second word IN ALL PLACES
		int wordInString = s1.indexOf(word1);
		if (wordInString < s1.length() && wordInString >= 0) {
			System.out.println("Part 1: ");
			System.out.println(s1.replaceAll(word1, word2));
		} else // word not found option
			System.out.println("Your word is not found in the sentence.");
		// part 2
		boolean isItThere = s1.contains(word1);
		System.out.println("Part 2: ");
		// if word is in string
		if (isItThere == true) {
			while (isItThere == true) {
				int m = s1.indexOf(word1);
				if (m >= 0) {
					// variables for replacing word
					String before = s1.substring(0, m);
					String after = s1.substring(m + word1.length());
					// new string with replacements
					s1 = before + word2 + after;
					// see if word's still in string
					isItThere = s1.contains(word1);
				}
			}
			System.out.println(s1);
		} else // if word is not in string
			System.out.println("Your word is not found in the sentence.");

		input.close();
	}

}
