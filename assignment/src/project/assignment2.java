package project;

import java.util.Scanner;

/* This is assignment 2.
 * @author amber
 * @version 3/14/19
 * This program should give a menu of options that allows the user to use multiple times until
 * they choose to exit the program.
 * 
 * Steps include:
 * - Creating a loop for the menu
 * - Get default string from user
 * - Displaying menu to user and getting their input
 * - Enter a new main sentence
 * - Find a String 
 * - Find all incidents of a String
 * - Find and Replace a String 
 * - Replace all the incidents of a String 
 * - Count the number of words 
 * - Count a letter’s occurrences
 * - Count the total number of letters
 * - Delete all the occurrences of a word
 * - Exit (Goodbye)
 */
public class assignment2 {
	
	public static void main(String[] args) {
		//get default String
		Scanner input = new Scanner(System.in); //create scanner
		System.out.println("Please insert a sentence: ");
		String s1 = input.nextLine();
		//create loop
		for(int i = 0; i < 500; i++) {
		//display menu and get choice
		System.out.println("Here are the menu options:"
				+ "\nA. Enter a new main sentence \nB. Find a String"
				+ "\nC. Find all incidents of a String\nD. Find and Replace a String" + 
				"\nE. Replace all the incidents of a String \nF. Count the number of words"
				+ "\nG. Count a letter’s occurrences \nH. Count the total number of letters"
				+ "\nI. Delete all the occurrences of a word \nJ. Exit");
		String c = input.nextLine(); //store as string
		c = c.toLowerCase(); //force lower-case for switch case
		char choice = c.charAt(0); //convert to char
		//exit option
		if(choice == 'j') { //exit loop option
			break;
		}
		//create switch case
		switch(choice) {
		case 'a': //enter a new main string
			System.out.println("Enter a new main sentence: ");
			s1 = input.nextLine();
			break;
		case 'b': //find a string
			System.out.println("Please insert a word: ");
			String word = input.nextLine();
			//find word in sentence, if not found, display so
			int wordInString = s1.indexOf(word);
			if(wordInString < s1.length() && wordInString >= 0)
				System.out.println("Your word is found first at: " + wordInString);
			else //in case not found
				System.out.println("Your word is not found in the sentence.");
			break;
		case 'c': //find all incidents of a string
			System.out.println("Please insert a word: ");
			word = input.nextLine();
			//display index of every occurrence in sentence
			wordInString = s1.indexOf(word);
			if(wordInString < s1.length() && wordInString >= 0)
				for(int j = 0; j < s1.length(); j++) {
				System.out.println("Your word is found at: " + wordInString);
				}
			else //in case not found
				System.out.println("Your word is not found in the sentence.");
			break;
		case 'd': //find and replace a string
			//ask for word to find
			System.out.println("Insert a word: ");
			String word1 = input.nextLine();
			//ask for another word to replace first word with
			System.out.println("Insert a replacement word: ");
			String word2 = input.nextLine();
			//locate first word and replace with second word
			wordInString = s1.indexOf(word1);
			if(wordInString < s1.length() && wordInString >= 0) {
				System.out.println(s1.replaceFirst(word1, word2));
			}
			else //word not found option
				System.out.println("Your word is not found in the sentence.");
			break;
		case 'e': //replace all incidents of a string
			//ask for word
			System.out.println("Insert a word: ");
			word1 = input.nextLine();
			//ask for replacement word
			System.out.println("Insert a replacement word: ");
			word2 = input.nextLine();
			//locate word and replace with second word IN ALL PLACES
			wordInString = s1.indexOf(word1);
			if(wordInString < s1.length() && wordInString >= 0) {
				System.out.println(s1.replaceAll(word1, word2));
			}
			else //word not found option
				System.out.println("Your word is not found in the sentence.");
			break;
		case 'f': //count the number of words
			System.out.println("There are " + s1.split(" ").length + " words in your sentence.");
			break;
		case 'g': //count a letter's occurrences
			//get letter from user
			System.out.println("Enter a letter: ");
			String let = input.nextLine();
			//see how many times the letter occurs in sentence
			wordInString = s1.indexOf(let);
			if(s1.contains(let)) {
				int counter = 0; //create counter
				for(int k = 0; k < s1.length(); k++) {
					if(s1.charAt(k)== let.charAt(0)) {
						counter++;
					}
				}
			System.out.println("This letter is represented " + counter + " times in this sentence.");
			}
			else //in case it doesn't contain it
				System.out.println("This letter is not in the string.");
			break;
		case 'h': //count the total number of letters
			//store main variable in temp variable
			String s2 = s1;
			//trim spaces
			s2.trim();
			//count length
			int length = s2.length();
			//display
			System.out.println("There are " + length + " letters in your sentence.");
			break;
		case 'i': //delete all occurrences of a word
			//ask for a word
			System.out.println("Enter a word.");
			word = input.nextLine();
			//delete word everywhere in string
			wordInString = s1.indexOf(word);
			word2 = "";
			if(wordInString < s1.length() && wordInString >= 0) {
				//display new sentence
				System.out.println(s1.replaceFirst(word, word2));
			}
			else //word not found option
				System.out.println("Your word is not found in the sentence.");
			break;
			}
		
		}
		//bye 
		System.out.println("Goodbye.");
		input.close();
	}
	
}
