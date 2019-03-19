package activity3_3;
/* Question 1 in Activity 5.3
 * @author amber
 * @version 3/13/19
 * This program should show the sum of the integers between 10 and 200
 */
public class Demo_code {
	
	public static void main(String[] args) {
		//variables
		int sum = 0;
		int i = 10;
		
		for(i=10; i <= 200; i+=2) { 
			sum += i;
		System.out.println(sum);
		}
	}

}
