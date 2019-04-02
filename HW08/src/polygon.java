import java.util.Scanner;

/* This is from HW08, the Area of a Polygon
 * @author amber
 * @version 4/2/19
 * This program should use a method to return the area of a polygon.
 * It should ask the user for the num of sides and the side of the reg polygon.
 */
public class polygon {

	public static void main(String[] args) {
		// show ID
		System.out.println("ID001");
		// create scanner
		Scanner input = new Scanner(System.in);
		// get info from user
		System.out.println("Enter the number of sides: ");
		int sides = input.nextInt();
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		double polygon = 0;
		polygon = area(sides, side);
		System.out.println("The area of the polygon is: " + polygon);
	}

	public static double area(int a, double b) {
		// find area of polygon
		double polygon;
		polygon = (a * Math.pow(b, 2)) / (4 * Math.tan(Math.PI / a));
		return polygon;
	}

}
