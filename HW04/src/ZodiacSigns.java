import java.util.Scanner;

/*  This is lab 3 in hw 4 -> Zodiac
    @author amber sibel
    @version 2/23/19
    This program should  get the birthday from the user then show their zodiac sign, w/ 1 fact about it
    Then it should randomly generate a month and day, and show the same.
    Steps include:
    - getting user's birthday
    - decide their zodiac with a switch case
    - display their zodiac
    - create if statements based on a fact of their zodiac
    - display their zodiac characteristic
    - generate a random date and month
    - create a random zodiac
    - create new switch case for random zodiac
    - display the random zodiac
    - create new if statement attached to random zodiac
    - display random zodiac characteristic
 */
public class ZodiacSigns {

    public static void main(String[] args) {
        //assignment ID
        System.out.println("ID003");

        //get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month you were born(1-12): ");
        int month = input.nextInt();
        System.out.println("Enter the day you were born: ");
        int day = input.nextInt();

        //decide their zodiac
        String zodiac = "zodiac";
        switch(month){
            case 1:
                if(day <= 19){
                    zodiac = "Capricorn";
                }
                else{
                    zodiac = "Aquarius";
                }
                break;

            case 2:
                if(day <= 18){
                    zodiac = "Aquarius";
                }
                else{
                    zodiac = "Pisces";
                }
                break;

            case 3:
                if(day <= 20){
                    zodiac = "Pisces";
                }
                else{
                    zodiac = "Aries";
                }
                break;

            case 4:
                if(day <= 19){
                    zodiac = "Aries";
                }
                else{
                    zodiac = "Taurus";
                }
                break;

            case 5:
                if(day <= 20){
                    zodiac = "Taurus";
                }
                else{
                    zodiac = "Gemini";
                }
                break;

            case 6:
                if(day <=20){
                    zodiac = "Gemini";
                }
                else{
                    zodiac = "Cancer";
                }
                break;

            case 7:
                if(day <= 22){
                    zodiac = "Cancer";
                }
                else{
                    zodiac = "Leo";
                }
                break;

            case 8:
                if(day <= 22){
                    zodiac = "Leo";
                }
                else{
                    zodiac = "Virgo";
                }
                break;

            case 9:
                if(day <= 22){
                    zodiac = "Virgo";
                }
                else{
                    zodiac = "Libra";
                }
                break;

            case 10:
                if(day <= 22){
                    zodiac = "Libra";
                }
                else{
                    zodiac = "Scorpio";
                }
                break;

            case 11:
                if(day <= 21){
                    zodiac = "Scorpio";
                }
                else{
                    zodiac = "Sagittarius";
                }
                break;

            case 12:
                if(day <= 21){
                    zodiac = "Sagittarius";
                }
                else{
                    zodiac = "Capricorn";
                }
        }
        //display results
        System.out.print("Your Zodiac Sign is " + zodiac + "! ");
        //fact about zodiac
        if(zodiac.equals("Aries")){
            System.out.println("People born under the sign of Aries are forceful and ambitious.");
        }
        if(zodiac.equals("Taurus")){
            System.out.println("The worst punishment for Taurus is undoubtedly to destroy what he or she has built for months or years.");
        }
        if(zodiac.equals("Gemini")){
            System.out.println("Gemini have a brilliant sense of humor and diplomacy.");
        }
        if(zodiac.equals("Cancer")){
            System.out.println("Cancers are prone to frequent mood swings that emanate from their unconscious mind.");
        }
        if(zodiac.equals("Leo")){
            System.out.println("Leo is a bright and proud ruler.");
        }
        if(zodiac.equals("Virgo")){
            System.out.println("Virgos are reliable and accurate.");
        }
        if(zodiac.equals("Libra")) {
            System.out.println("Moderateness and peacefulness are simply characteristic features of Libra.");
        }
        if(zodiac.equals("Scorpio")){
            System.out.println("Scorpio people have a mesmeric glance.");
        }
        if(zodiac.equals("Sagittarius")){
            System.out.println("Sagittarius' tend to wear their heart on their sleeve.");
        }
        if(zodiac.equals("Capricorn")){
            System.out.println("The genuine Capricorn is able to climb the social ladder as skilfully as his four-legged relative in the mountains.");
        }
        if(zodiac.equals("Aquarius")){
            System.out.println("Aquarians are often the great visionaries and dreamers who do not acknowledge the values and lessons of the past with the proper respect.");
        }
        if(zodiac.equals("Pisces")){
            System.out.println("Pisces are spiritually and emotionally based, governed mostly by intuition");
        }
        //randomly generated month and date
        int randomMonth = (int)((Math.random() * 12) + 1);
        int randomDay = (int)((Math.random() * 28) + 1); //? not all months have the same days
        //display random output
        System.out.println("Generating random month and day: " + randomMonth + " " + randomDay);
        //recreate zodiac for random
        String randomZodiac = "string";
        switch(randomMonth){
            case 1:
                if(randomDay <= 19){
                    randomZodiac = "Capricorn";
                }
                else{
                    randomZodiac = "Aquarius";
                }
                break;

            case 2:
                if(randomDay <= 18){
                    randomZodiac = "Aquarius";
                }
                else{
                    randomZodiac = "Pisces";
                }
                break;

            case 3:
                if(randomDay <= 20){
                    randomZodiac = "Pisces";
                }
                else{
                    randomZodiac = "Aries";
                }
                break;

            case 4:
                if(randomDay <= 19){
                    randomZodiac = "Aries";
                }
                else{
                    randomZodiac = "Taurus";
                }
                break;

            case 5:
                if(randomDay <= 20){
                    randomZodiac = "Taurus";
                }
                else{
                    randomZodiac = "Gemini";
                }
                break;

            case 6:
                if(randomDay <=20){
                    randomZodiac = "Gemini";
                }
                else{
                    randomZodiac = "Cancer";
                }
                break;

            case 7:
                if(randomDay <= 22){
                    randomZodiac = "Cancer";
                }
                else{
                    randomZodiac = "Leo";
                }
                break;

            case 8:
                if(randomDay <= 22){
                    randomZodiac = "Leo";
                }
                else{
                    randomZodiac = "Virgo";
                }
                break;

            case 9:
                if(randomDay <= 22){
                    randomZodiac = "Virgo";
                }
                else{
                    randomZodiac = "Libra";
                }
                break;

            case 10:
                if(randomDay <= 22){
                    randomZodiac = "Libra";
                }
                else{
                    randomZodiac = "Scorpio";
                }
                break;

            case 11:
                if(randomDay <= 21){
                    randomZodiac = "Scorpio";
                }
                else{
                    randomZodiac = "Sagittarius";
                }
                break;

            case 12:
                if(randomDay <= 21){
                    randomZodiac = "Sagittarius";
                }
                else{
                    randomZodiac = "Capricorn";
                }
        }
        //display random zodiac
        System.out.print("Your Zodiac Sign is " + randomZodiac + "! ");
        //fact about random zodiac
        if(randomZodiac.equals("Aries")){
            System.out.print("People born under the sign of Aries are forceful and ambitious.");
        }
        if(randomZodiac.equals("Taurus")){
            System.out.print("The worst punishment for Taurus is undoubtedly to destroy what he or she has built for months or years.");
        }
        if(randomZodiac.equals("Gemini")){
            System.out.print("Gemini have a brilliant sense of humor and diplomacy.");
        }
        if(randomZodiac.equals("Cancer")){
            System.out.print("Cancers are prone to frequent mood swings that emanate from their unconscious mind.");
        }
        if(randomZodiac.equals("Leo")){
            System.out.print("Leo is a bright and proud ruler.");
        }
        if(randomZodiac.equals("Virgo")){
            System.out.print("Virgos are reliable and accurate.");
        }
        if(randomZodiac.equals("Libra")) {
            System.out.print("Moderateness and peacefulness are simply characteristic features of Libra.");
        }
        if(randomZodiac.equals("Scorpio")){
            System.out.print("Scorpio people have a mesmeric glance.");
        }
        if(randomZodiac.equals("Sagittarius")){
            System.out.print("Sagittarius' tend to wear their heart on their sleeve.");
        }
        if(randomZodiac.equals("Capricorn")){
            System.out.print("The genuine Capricorn is able to climb the social ladder as skilfully as his four-legged relative in the mountains.");
        }
        if(randomZodiac.equals("Aquarius")){
            System.out.print("Aquarians are often the great visionaries and dreamers who do not acknowledge the values and lessons of the past with the proper respect.");
        }
        if(randomZodiac.equals("Pisces")){
            System.out.print("Pisces are spiritually and emotionally based, governed mostly by intuition");
        }
    }
}
