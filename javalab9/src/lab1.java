/* This is lab 1 in lab09.
@author amber
@version 4/15/19
This program creates a two dimensional array with 4 rows and 5 columns and displays it.
 */
public class lab1 {

    public static void main(String[] args){
        //create array
        int[][] matrix = new int[4][5];
        //put in random values between 1-10
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)((Math.random() * 10) + 1);
                //display array
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
}
