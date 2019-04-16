import java.util.Scanner;
public class activity8_2 {
    static String[] shoppingList ;


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        shoppingList = new String[5]; // part A


        for (int i = 0; i<shoppingList.length;i++){
            System.out.print("Input an item to your shopping list: ");
            shoppingList[i]=sc.next();
        }

        //uncomment me part A
        for (int i =0; i<shoppingList.length;i++){
        System.out.print(shoppingList[i]+" ");

        }
        System.out.println();

        //uncomment me: part B

        for (int i =0; i<shoppingList.length;i++){
        System.out.print(shoppingList[i].length()+" ");

        }
        System.out.println();




        shoppingList[0]="shampoo";

        System.out.println("Making a new variable with same name:");
        String [] shoppingList= {"chips","coke","milk","cheese","notebook"};

        // uncomment me : part C
        int i=0;
        for (i =0; i<shoppingList.length;i++){
        System.out.print(shoppingList[i]+" ");
        }
        System.out.println("\n array length is "+i);



        // part D: uncomment me
        myMethod();


            }


    public static void myMethod() {
        for (int i =0; i<shoppingList.length;i++){
            System.out.print(shoppingList[i]+" ");
        }
    }


}
/*
Part A
1.	5
2.	The user input of shopping list array
3.	Syntax
4.	The scope of I is in the loops, the scope of shoppinglist is in main
Part B
1.	The length of each input (in array)
2.	No
Part C
1.	Prints the array with the new input, then the length of the array
2.	No
3.	They’re both in the main and in the loop
Part D
1.	0 index (shampoo) and then the rest of our input from the beginning
2.	No
3.	I is in the method, shoppinglist is in both the method and the main

 */

