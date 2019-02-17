package javalab3;
/**
 * Description - This code is supposed to be the best.
 * 				 It is a part of my job so I have to do it. Just writing these
 *               comments because I have to. smh .. 
 *               Should hire someone to do it for me pls
 * @version 1.0
 * @author Devansh Desai 
 * @date July 16, 2016
 */
public class LabQuestion5 {
	public static void main(String[] args){
		int a, b;
		a = 100;
		b = 0;
		
		//if statement so error (b=0) isn't received
		if(b != 0) {
			int c = a/b;
			System.out.println("The division is : " + c);
		}
		else {
			System.out.println("You cannot divide by 0!");
		}
	}
}

