import java.util.Scanner;

/* Fortune Teller
 * 
 * @author amber sibel
 * @version 2/18/19
 * Lab section: ITSC1212-005
 * 
 * Purpose: This program should tell the person's fortune by asking basic questions 
 */
public class test {
	
	public static void main(String[] args){
		
		//ask user for name and birth date
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		System.out.println("What year were your born (enter 4 digits for the year)?");
		int birthYear = input.nextInt();
		System.out.println("What month were you born (enter 1-12)?");
		int birthMonth = input.nextInt();
		System.out.println("What day of the month were you born (enter 1-31)?");
		int birthDay = input.nextInt();
		
		//menu with options
		System.out.println("Here are your options to play with: ");
		System.out.println("1. Lucky Number");
		System.out.println("2. Magic Number");
		System.out.println("3. Horoscope");
		//ask for their choice
		System.out.println("Which would you like to see?");
		int choice = input.nextInt();
		
		//create zodiac
		String zodiac = "zodiac";
		switch(birthMonth){
		case 1:
			if(birthDay <= 19){
				zodiac = "Capricorn";
			}
			else{
				zodiac = "Aquarius";
			}
		break;
		
		case 2:
			if(birthDay <= 18){
				zodiac = "Aquarius";
			}
			else{
				zodiac = "Pisces";
			}
		break;
		
		case 3:
			if(birthDay <= 20){
				zodiac = "Pisces";
			}
			else{
				zodiac = "Aries";
			}
		break;
		
		case 4:
			if(birthDay <= 19){
				zodiac = "Aries";
			}
			else{
				zodiac = "Taurus";
			}
		break;
		
		case 5:
			if(birthDay <= 20){
				zodiac = "Taurus";
			}
			else{
				zodiac = "Gemini";
			}
		break;
		
		case 6:
			if(birthDay <=20){
				zodiac = "Gemini";
			}
			else{
				zodiac = "Cancer";
			}
		break;
		
		case 7:
			if(birthDay <= 22){
				zodiac = "Cancer";
			}
			else{
				zodiac = "Leo";
			}
		break;
		
		case 8:
			if(birthDay <= 22){
				zodiac = "Leo";
			}
			else{
				zodiac = "Virgo";
			}
		break;
		
		case 9:
			if(birthDay <= 22){
				zodiac = "Virgo";
			}
			else{
				zodiac = "Libra";
			}
		break;
		
		case 10:
			if(birthDay <= 22){
				zodiac = "Libra";
			}
			else{
				zodiac = "Scorpio";
			}
		break;
		
		case 11:
			if(birthDay <= 21){
				zodiac = "Scorpio";
			}
			else{
				zodiac = "Sagittarius";
			}
		break;
		
		case 12:
			if(birthDay <= 21){
				zodiac = "Sagittarius";
			}
			else{
				zodiac = "Capricorn";
			}
		}
		
		//switch statement based on choice
		switch(choice){
		//lucky number program
		case 1:
			int random = (int)((Math.random() * 8) + 1);
			//if statement based on number
			if(random == 8 || random == 2){
				System.out.println(firstName + " " + lastName + ", you are extremely unlucky.");
			}
			else if(random > 3){
				System.out.println(firstName + " " + lastName + ", you are a very lucky person.");
			}
			else{
				System.out.println(firstName + " " + lastName + ", you are just barely lucky.");
			}
		
		break;
		//magic number program
		case 2:
			//create constant variable MAGIC_RANGE
			int MAGIC_RANGE = 110;
			//calculate magic number
			int magicNumber = birthYear % MAGIC_RANGE;
			//display results
			System.out.println("Your magic number is: " + magicNumber);
		break;
		
		case 3:
			//horoscope program
			if(zodiac == "Aries"){
				System.out.println(zodiac + ", you're going to have a great year!");
			}
			if(zodiac == "Taurus"){
				System.out.println(zodiac + ", be careful in your future endeavors.");
			}
			if(zodiac == "Gemini"){
				System.out.println(zodiac + ", you're going to meet someone special soon.");
			}
			if(zodiac == "Cancer"){
				System.out.println(zodiac + ", be wary of who you trust.");
			}
			if(zodiac == "Leo"){
				System.out.println(zodiac + ", be mindful of your surroundings.");
			}
			if(zodiac == "Virgo"){
				System.out.println(zodiac + ", this is going to be a good year for you!");
			}
			if(zodiac == "Scorpio"){
				System.out.println(zodiac + ", patience will get you far this year.");
			}
			if(zodiac == "Sagittarius"){
				System.out.println(zodiac + ", remember that people need you as much as you need them");
			}
			if(zodiac == "Capricorn"){
				System.out.println(zodiac + ", someone close to you will die soon.");
			}
			if(zodiac == "Aquarius"){
				System.out.println(zodiac + ", money is on it's way to you.");
			}
			if(zodiac == "Pisces"){
				System.out.println(zodiac + ", something terrible is going to happen soon.");
			}
		}	
		
	}

}

/*
Steps of this include:
getting user's first name, last name, birth date
making a menu for their lucky number
showing them their  magic number if they choose to see it
printing out their horoscope if they ask to see it
*/