/* This is Activity 5.3 from class, problem 3
 * @author amber
 * @version 3/13/19
 * This is utilizing the java detector, asking user for shapes and using a loop for it
 */
import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		//ask user for title, width, height
		Scanner input = new Scanner(System.in);
		System.out.println("What title, width, and height do you want? Answer respectively.");
		String title = input.nextLine();
		int width = input.nextInt();
		int height = input.nextInt();
		//create window
		Detector d = new Detector(title, width, height);
		//create loop
		for(int i = 0; i < 300; i++) {
		//ask which shape to add
		System.out.println("Select which shape you would like to add: "
				+ "\n0. Triangle\n1. Square\n2. Rectangle\n3. Circle\n4. Quit ");
		int shape = input.nextInt();
		//exit case
		if(shape == 4) {
			break;
		}
		//ask for location of shape
		System.out.println("What location would you like the shape? (x then y) ");
		int locX = input.nextInt();
		int locY = input.nextInt();
		//ask for size of shape
		System.out.println("What size would you like your shape? (width then height)");
		int shapeW = input.nextInt();
		int shapeH = input.nextInt();
		//create case for shapes
		switch(shape) {
		case 0:
			d.addShape(Detector.TRIANGLE, locX, locY, shapeW, shapeH); break;
		case 1:
			d.addShape(Detector.SQUARE, locX, locY, shapeW, shapeH); break;
		case 2:
			d.addShape(Detector.RECTANGLE, locX, locY, shapeW, shapeH); break;
		case 3:
			//ask for radius
			System.out.println("What would you like your radius to be?");
			int radius = input.nextInt();
			d.addShape(Detector.CIRCLE, locX, locY, radius); break;
		}
		//ask if they'd like a point
		System.out.println("Would you like to add a point? (Y/N)");
		String c = input.next();
		c = c.toLowerCase();
		char choice = c.charAt(0);
		//determine choice
		if(choice == 'y') {
			System.out.println("Please insert a point location: (x then y)");
			int pointX = input.nextInt();
			int pointY = input.nextInt();
			//add point
			d.addPoint(pointX, pointY);
			//check if point is in shape and display message
			System.out.println("Is the point in the shape? : " + d.isPointInShapes(pointX, pointY));
		}
		else 
			System.out.println("Okay.");
			//remove all shapes
			d.removeAllShapes();
		}
		//display done
		System.out.println("Done :)");
		d.exit();
		
	}

}
