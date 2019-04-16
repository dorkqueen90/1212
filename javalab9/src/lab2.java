import java.util.Scanner;

/* This is lab 2 in lab09.
@author amber
@version 4/15/19
This program will display a multiplication table based on lengths that the user gets to input.
 */
public class lab2 {

    public static void main(String[] args){
    //create scanner
    Scanner input = new Scanner(System.in);
    //ask how many rows they want
        System.out.println("How many rows do you want in your table?");
        int row = input.nextInt();
        //ask how many columns
        System.out.println("How many columns do you want in your table?");
        int col = input.nextInt();
        //create array based on input
        int[][] table = new int[row+1][col+1];
        //nested for loop for table
        for(int i =1; i < table.length; i++){
            for(int j = 1; j < table.length; j++){
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
