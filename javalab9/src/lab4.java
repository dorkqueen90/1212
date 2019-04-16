import java.util.Scanner;

/* This is lab 4 from lab09
@author amber
@version 4/15/19
This program holds 4 students test grades. 3 tests per student. 1 col for id.
*/
public class lab4 {
        public static void main(String[] args){
            //create scanner
            Scanner input = new Scanner(System.in);
            //create array
            int[][] grades = new int[4][4];
            //get id
            for(int m = 0; m < grades[0].length; m++){
                System.out.println("Please insert your student ID:");
                grades[m][0] = input.nextInt();
                //populate with grades
                    for (int k = 1; k < 4; k++) {
                        System.out.println("Please insert your grades:");
                        grades[m][k] = input.nextInt();
                    }

                }

            //display grades and id
            for(int i = 0; i < grades.length; i++){
                for(int k = 0; k < grades[i].length; k++){
                    System.out.print(grades[i][k] + " ");
                }
                System.out.println();
            }
        }
}
