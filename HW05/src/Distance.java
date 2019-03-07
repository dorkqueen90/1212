import java.util.Scanner;

/*  This is from HW05, lab1 -> "Distance"
    @author amber sibel
    @version 3/7/19
    This program should ask the user for an x and y value and then display the distance between those points.
    Steps include:
    - Enter ID for lab
    - Ask user for x1, y1, x2, y2
    - compute distance using math.pow(a , 0.5)
    - Make sure answer is accurate to 1 decimal place
    - Display distance to user
 */
public class Distance {

    public static void main(String[] args){
        //ID for lab
        System.out.println("ID001");
        //ask for input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 points: ");
        System.out.println("Enter x1: "); //double
        double x1 = input.nextDouble();
        System.out.println("Enter y1: "); //double
        double y1 = input.nextDouble();
        System.out.println("Enter x2: "); //double
        double x2 = input.nextDouble();
        System.out.println("Enter y2: "); //double
        double y2 = input.nextDouble();

        //calculate distance.. (Math.pow(a , 0.5) for square root
        double distance = (Math.pow((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))) ,0.5));
        //round
        double round = Math.round(distance * 10.0)/10.0;
        String.format("%.1f", round);
        //display results
        System.out.println("The distance is: " + round);
    }
}
