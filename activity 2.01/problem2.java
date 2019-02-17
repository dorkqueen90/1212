/** Problem 2 in activity 2.01
 * 1/16/19
 * @author amber
 * This program should display the area and perimeter
 * of a rectangle with the width of 4.5
 * and the height of 7.9
 */
public class problem2 {
	
	public static void main(String[] args) {
		// variables
		double width = 4.5;
		double height = 7.9;
		double area;
		double perimeter;
		
		// make things happen
		area = width * height;
		perimeter = (width + height) * 2;
		
		// tell people things
		System.out.println("The area of a rectangle is " + area);
		System.out.println("The perimeter of a rectangle is " + perimeter);
		
	}

}
