import java.util.Scanner;

/* This is lab 3 of lab09
@author amber
@version 4/16/19
This program will be a 5x6 array with random int's between 1-1000. using several methods.
 */
public class lab3 {
    public static void main(String[] args){
        //create array
        int[][] matrix = new int[5][6];
        //put in random values between 1-1000
        for(int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) ((Math.random() * 1000) + 1);
            }
        }
            //create scanner
            Scanner input = new Scanner(System.in);
            // show highest number
            int num = 0;
            System.out.println("Highest: " + getHighest(matrix));
            // show lowest number
            System.out.println("Lowest: " + getLowest(matrix));
            // show average of all elements
            System.out.println("Average: " + getAverage(matrix, num));
            // show all elements above the average
            System.out.println("Choose a value:");
            num = input.nextInt();
            System.out.println("Elements above value: ");
            above(matrix, num);
        }



    private static void above(int[][] a, int b) {
        // find and display all elements above user input
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > b) {
                System.out.print(a[i][i] + " ");
            }
        }

    }

    private static int getAverage(int[][] a, int b) {
        // find average of all elements
        b = a.length - 1;
        // sum all elements
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i][i];
        }
        int average = total / b;
        return average;
    }

    private static int getLowest(int[][] a) {
        // find lowest in array and display index
        int low = a[0][0];
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] < low) {
                low = a[i][i];
            }
        }
        return low;
    }

    private static int getHighest(int[][] a) {
        // find highest in array
        int max = a[0][0];
        for (int i = 1; i < a.length; i++) {
            if (a[i][i] > max) {
                max = a[i][i];
            }
        }
        return max;
    }
}
