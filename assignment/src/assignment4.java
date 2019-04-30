import java.util.Arrays;
import java.util.Scanner;

/* This is long assignment 4 for 1212.
@author amber
@version 4/17/19
This program creates a wild jungle for the user to navigate around and explore animals, adding
them to the observed animal list.
Steps include:
- Introduce program and explain how it works
- get dimensions for the world
- create string array to create world user navigates in
- get what animal they want to enter in the world
- get the coordinates of the animal
- create string array to keep track of animals
- create boolean array to keep track of if area was explored yet or not
- create string array to keep track of observed animals (length of world)
- method for making the world, for the menu, adding animals to the world and removing them
- method for checking if the animal is in a spot or not
- method to update the animals being observed
- method to move, explore, print observed animals, see what's explored, to print the world
- explore the world
- display the world
*/
public class assignment4 {

    private static boolean[][] isItExplored;

        public static void main(String[] args){
            //create scanner
            Scanner input = new Scanner(System.in);
            //introduce program and explain how game works
            System.out.println("Welcome to the jungle world creator!\nIn this  game, you will be inserting" +
                    " animals in certain places in the world that you create! \nYou will also be allowed to remove" +
                    " animals from certain locations before you start exploring!\nOnce you start exploring," +
                    " you will navigate around the world to observe the animals that you have inserted.\nThe" +
                    " game will keep track of all the animals you have observed!");
            //variables
            int x = 0;
            int y = 0;
            String animal;
            //create arrays
            String[][] animalLocations;
            String[] observedAnimals;
            String[][] world;

            //get dimensions for world
            System.out.println("Please enter the dimensions of your jungle!");
            System.out.println("Enter length:");
            int length = input.nextInt();
            System.out.println("Enter width:");
            int width = input.nextInt();
            //update arrays
            observedAnimals = new String[length * width];
            world = new String[length][width];
            animalLocations = new String[length][width];
            isItExplored = new boolean[length][width];
            //set everything to false
            for(int i = 0; i < isItExplored.length; i++){
                for(int k = 0; k < isItExplored[0].length; k++){
                    isItExplored[i][k] = false;
                }
            }
            //display main menu
            printMainMenu();
            int choice = input.nextInt();

            //switch case for choice
            switch(choice){
                case 1:
                    //insert animal into world
                    insertAnimalToWorld(animalLocations);
                    break;
                case 2:
                    //remove animal from world
                    removeAnimalFromWorld(animalLocations);
                    break;
                case 3:
                    //explore world
                    explore(world, animalLocations, observedAnimals);
                    break;
            }

        }

        public static String[][] makeWorld(String[][] world, int x, int y){
            //sets up visible world
            //isItExplored[x][y] = isExplored(world, x, y);
            //assign * to unexplored areas and O to explored areas
            for(int i = 0; i < world.length; i++){
                for(int k = 0; k < world[0].length; k++){
                    if(isItExplored[i][k]){
                        world[i][k] = "O";
                    }
                    else {
                        world[i][k] = "*";
                    }
                }
            }
            //set users current position (x, y) to "X"
            world[x][y] = "X";
            //create world[][]
            return world;
        }

        public static void printMainMenu(){
            //prints menu
            System.out.println("1. Insert an animal into the world\n2. Remove an animal from the world" +
                    "\n3. Explore the world");
        }

        public static void printMoveMenu(){
            //prints moving options menu
            System.out.println("W. Move Forward");
            System.out.println("A. Move Left");
            System.out.println("X. Move Back");
            System.out.println("D. Move Right");
            System.out.println("I. Display observed animals");
            System.out.println("E. Exit");
        }

        public static void insertAnimalToWorld(String[][] animalLocations){
            //insert scanner
            Scanner input = new Scanner(System.in);
            int x;
            int y;
            String animal;
            do {
                //prompt user for x and y coords and desired animal name
                System.out.println("Please insert x coordinate of desired location:");
                x = input.nextInt();
                System.out.println("Please insert y coordinate if desired location:");
                y = input.nextInt();
                System.out.println("Enter animal name:");
                animal = input.nextLine();
                //make sure location is in world's boundaries
                //if conditions are not met, prompt for coords and name again until it works
                //make sure location is not already occupied by another animal
            } while(!(x <= animalLocations.length) && !(y <= animalLocations[0].length) &&
                    !(animalLocations[x][y].equals("")));
            //insert animal to world at location
            animalLocations[x][y] = animal;
        }

        public static void removeAnimalFromWorld(String[][] animalLocations){
            //insert scanner
            Scanner input = new Scanner(System.in);
            int x;
            int y;
            String animal;
            do {
                //prompt user for x and y coords and desired animal name
                System.out.println("Please insert x coordinate of desired location:");
                x = input.nextInt();
                System.out.println("Please insert y coordinate if desired location:");
                y = input.nextInt();
                System.out.println("Enter animal name:");
                animal = input.nextLine();
                //make sure location is in world's boundaries
                //if conditions are not met, prompt for coords and name again until it works
                //make sure location is already occupied
            } while(!(x <= animalLocations.length) && !(y <= animalLocations[0].length) &&
                    !(isEmptyBlock(animalLocations, x, y) == true));
            //remove animal from world at location
            animalLocations[x][y] = "";
        }

        public static boolean isEmptyBlock(String[][] animalLocations, int x, int y){
            //returns false if array has animal at location
            //returns true if location is empty
            //create boolean
            boolean occupied = false;
            if(animalLocations[x][y].contains("")){
             occupied = true;
            }
            return occupied;
        }

        public static String[] updateObservedAnimals(String[] observedAnimals, String animal){
            //adds animal into observedAnimals array into first occurrence of empty string ""
            for(int i = 0; i < observedAnimals.length; i ++){
                if(observedAnimals[i].contains("")){
                    observedAnimals[i] = animal;
                    break;
                }
            }
            //returns observedAnimals array
            return observedAnimals;
        }

        public static void printWorld(String[][] world){
            //prints world in grid/tabular format
            for(int i = 0; i < world.length; i++) {
                for(int k = 0; k < world[0].length; k++) {
                    System.out.print(world[i][k] + " ");
                }
                System.out.println();
            }
        }

        public static String[][] move(String[][] world, int x, int y, String[] observedAnimals, String[][] animalLocations){
            //calls makeWorld to create new world with new user position
            makeWorld(world, x, y);
            //sets 2D boolean array at location to be true, setting area to explored
            isItExplored[x][y] = true;
            //if location has an animal, display animal name and add it to observed animals list
            if(isEmptyBlock(animalLocations, x, y) == true) {
                System.out.println("You encountered " + animalLocations[x][y]);
                String animal = animalLocations[x][y];
                updateObservedAnimals(observedAnimals, animal);
            }
            //if no animal at location, display you didn't encounter anything :(
            else
                System.out.println("We didn't encounter anything :(");
            //print observed animals list
            printObservedAnimals(observedAnimals);

            return world;
        }

        public static void explore(String[][] world, String[][] animalLocations, String[] observedAnimals){
            //starts exploration!
            Scanner input = new Scanner(System.in);
            //declare x and y that keep track of users position
            int x = 0;
            int y = 0;
            //print world
            world = makeWorld(world, x,y);
            printWorld(world);
            do {
                //print move menu
                printMoveMenu();
                //get choice
                System.out.println("Enter your choice:");
                String mc = input.next();
                mc.toLowerCase();
                char moveChoice = mc.charAt(0);
                //case for path
                while (moveChoice != 'e') {
                    switch (moveChoice) {
                        case 'w': //up
                            //if not in bounds, reset position to 0,0 and tell user they went off bounds
                            if (((y + 1) > world[0].length) || ((y + 1) < 0)) {
                                System.out.println("Sorry, you've gone out of bounds");
                                world[x][y] = world[0][0];
                            } else {
                                world[x][y] = world[x][y + 1];
                                isItExplored[x][y] = true;
                            }
                            break;
                        case 'a': //left
                            if (((y - 1) > world.length) || ((y - 1) < 0)) {
                                System.out.println("Sorry, you've gone out of bounds");
                                world[x][y] = world[0][0];
                            } else {
                                world[x][y] = world[x][y-1];
                                isItExplored[x][y] = true;
                            }
                            break;
                        case 'x': //down
                            if (((x - 1) > world[0].length) || ((x - 1) < 0)) {
                                System.out.println("Sorry, you've gone out of bounds");
                                world[x][y] = world[0][0];
                            } else {
                                world[x][y] = world[x-1][y];
                                isItExplored[x][y] = true;
                            }
                            break;
                        case 'd': //right
                            if (((x + 1) > world[0].length) || ((x + 1) < 0)) {
                                System.out.println("Sorry, you've gone out of bounds");
                                world[x][y] = world[0][0];
                            } else {
                                world[x][y] = world[x + 1][y];
                                isItExplored[x][y] = true;
                            }
                            break;
                        case 'i':
                            printObservedAnimals(observedAnimals);
                            break;
                    }
                    //if moves are in bounds, call move method and print world
                    move(world, x, y, observedAnimals, animalLocations);
                    printWorld(world);
                }
                //make sure when user moves, they're not out of bounds
            }while(!(x <= world.length) && !(y <= world[0].length));
            System.out.println("Exiting world.");
        }

        public static void printObservedAnimals(String[] observedAnimals){
            //prints observedAnimals list by printing each animal on one line, separated by a space
            for(int i = 0; i < observedAnimals.length; i++){
                System.out.print(observedAnimals[i] + " ");
            }
        }

        public static boolean isExplored(String[][] world, int x, int y){
            boolean explored = false;
            //returns true if location is explored
            if(world[x][y].equals("*")) {
                explored = true;
            }
            //returns false if not explored
            return explored;
        }
}
