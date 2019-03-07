/*  This is case study "Displaying Prime Numbers" from the book.
    @author amber sibel
    @version 3/7/19
    This program should display the first 50 prime numbers in 5 lines, each containing 10 numbers.
 */
public class Prime_Numbers {

    public static void main(String[] args){
        //lab id
        System.out.println("ID002");
        //constants and variables
        final int NUMBER_OF_PRIMES = 50; //num of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; //10 per line
        int count = 0; //count num of prim nums
        int number = 2; //num to be tested for primeness

        System.out.println("The first 50 prime numbers are \n");

        //repeatedly find prime numbers
        while(count < NUMBER_OF_PRIMES) {
            //assume num is prime
            boolean isPrime = true; //is the num prime?

            //test if num is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { //if true, not prime
                    isPrime = false; //set to false
                    break;
                }
            }
            //display prime num and increase count
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //display num and advance to new line
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }
            //check if next number is prime
            number++;
        }
    }
}
