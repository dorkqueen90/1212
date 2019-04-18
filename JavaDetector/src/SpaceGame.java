import java.util.Scanner;

/* This is the space game from activity 8.3 in class.
@author amber
@version 4/17/19
This program is a simple intelligent program that drives a spaceship back to homebase.
 */
public class SpaceGame {

    public static void main(String[] main){
        //create scanner
        Scanner input = new Scanner(System.in);
        //create window
        Detector d = new Detector("Spaceship", 500, 500);

        //create spaceship
        UserShape spaceShip = new UserShape(Detector.TRIANGLE, 250, 250, 150, 150);
        d.addShape(spaceShip);

        //create arrays
        int[] x = new int[5];
        int[] y = new int[5];

        for(int m=0; m < x.length; m++) {
            //place point representing homebase
            UserShape point = new UserShape(d.CIRCLE, 100, 100, 10, 10);
            d.addShape(point);

            //move ship to point
            for (int i = 0; i < 75; i++) {

                d.moveUp(1, 1, spaceShip);
                d.moveLeft(1, 1, spaceShip);
                x[m] = i + 1;
                y[m] = i + 1;
            }
            //loop until user wants to exit
            for (int k = 1; k < 500; k++) {
                //ask user if they want to go again
                System.out.println("Do you want to do that again?");
                String res = input.nextLine();
                res.toLowerCase();
                char response = res.charAt(0);
                //exit option
                if (response == 'n') {
                    break;
                } //new point
                d.removeShape(point);
                point = new UserShape(d.CIRCLE, 400, 400, 10, 10);
                d.addShape(point);
                //go to new point
                for (int i = 0; i < 225; i++) {
                    d.moveDown(1, 1, spaceShip);
                    d.moveRight(1, 1, spaceShip);
                    x[k] = i + 1;
                    y[k] = i + 1;
                }
            }
            //display moves
            display(x, y);

            //close window
            d.exit();
        }

    }


    public static void display(int[] x, int[] y) {

        for(int i = 0; i < x.length; i++) {
            if(x[i] == 0){
                break;
            }
            System.out.print("(" + x[i] + " , " + y[i] + ")");
        }
        System.out.println();
    }
}
//close enough...