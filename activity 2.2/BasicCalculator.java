	import java.util.Scanner;

	public class BasicCalculator {
	    public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        // Variable Declaration
       int  y, x, z, z2;
       double dy, dx, dz;
       float f = 7.12f;
       System.out.print("Enter a Double Number: ");
      //Take user input and store it in dy
      dy = input.nextDouble();
      //Prompt the user for another number
      System.out.print("Enter another Double Number: ");
	dx = input.nextDouble();
      y = ((int)dy); // What do you think will happen now? 
      x = ((int)dx); //  
      System.out.println(y + " , " + dy);
      // What is the output in Line #18?
      System.out.println(x + " , " + dx);
     //What is the output in Line #20?
      dz = dx + dy;
       z = ((int)dx + (int)dy);
       f = ((int)z);
       z2 = x + y;
       System.out.println(z + " , " + z2 + " , " + f);
      //What is the output in Line #26?
      //Are they the same? If different, explain why are they different? (Write your answer in the Table below for Line #28.)
	System.out.println(x / y + " , " + dx / dy);
     //What is the output in Line #29?
      System.out.println(x % y + " , " + (int)dx % (int)dy);
      //What is the output in Line #31?
	    }
	}