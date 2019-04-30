/* This is lab test 3
@author amber sibel
@version 4/22/19
Lab Section: 005
This program should keep track of a pet store's customers and pets. It will deal with records including names and
the type of pet.
Steps include:
- create menu (add new record(name, pet name, pet type)
- display menu
- search records
- exit option
- be sure to track the number of customers
- display customers name, pets name, pets type(dog, cat, fish, etc)
 */

import java.util.Scanner;

public class labTest3 {

    public static void main(String[] args){
        //create scanner
        Scanner input = new Scanner(System.in);
        //create arrays
        String[] customerName = new String[20];
        String[] petName = new String[20];
        String[] petType = new String[20];
        for(int i = 0; i < 500; i++) {

            //display menu for them to add their info
            maniMenu();
            int choice = input.nextInt();
            if(choice == 4){
                break;
            }
            //switch case for choices
            switch(choice){
                case 1:
                    //Add new record
                    inputName(customerName);
                    inputPetName(petName);
                    inputType(petType);
                    break;
                case 2:
                    //display existing customers
                    display(customerName, petName, petType);
                    break;
                case 3:
                    //search records
                    for(int w = 0; w < 500; w++) {
                        searchMenu();
                        String c = input.next();
                        c.toLowerCase();
                        char searchChoice = c.charAt(0);
                        if (searchChoice == 'd') {
                            break;
                        }
                        //choices
                        if (searchChoice == 'a') {
                            //customer
                            //get customers name
                            System.out.println("Please enter customer name: ");
                            String cname = input.next();
                            if (searchName(cname, customerName) == -1) {
                                System.out.println("Unable to find customer with that name.");
                            } else {
                                int index = searchName(cname, customerName);
                                System.out.printf("%-15s", customerName[index]);
                                System.out.printf("%8s", petName[index]);
                                System.out.printf("%12s%n", petType[index]);
                            }
                        }
                        if (searchChoice == 'b') {
                            //pet
                            //get pets name
                            System.out.println("Please enter pet name: ");
                            String pname = input.next();
                            if (searchName(pname, petName) == -1) {
                                System.out.println("Unable to find pet with that name.");
                            } else {
                                int index = searchName(pname, petName);
                                System.out.printf("%-15s", customerName[index]);
                                System.out.printf("%8s", petName[index]);
                                System.out.printf("%12s%n", petType[index]);
                            }
                        }
                        if (searchChoice == 'c') {
                            //pet type counter
                            //get pet type
                            System.out.println("Please enter pet type: ");
                            String type = input.next();
                            int count = searchType(type, petType);
                            System.out.println("There are " + count + " " + type + ".");

                        }
                    }
                    break;
            }
        }
    }
    public static String[] inputName(String[] customerName){
        //create Scanner
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 1; i++) {
            //get customers name
            System.out.println("Please enter your name: ");
            customerName[i] = input.next();
        }
        return customerName;
    }
    public static String[] inputPetName(String[] petName){
        //create Scanner
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 1; i++) {
            //get pets name
            System.out.println("Enter your pet's name: ");
            petName[i] = input.next();

        }
        return petName;
    }
    public static String[] inputType(String[] petType){
        //create Scanner
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 1; i++) {
            //type of pet
            System.out.println("Enter the type of pet you have: ");
            petType[i] = input.next();
        }
        return petType;
    }

    public static int searchType(String name, String[] names){
        //count how many of a certain type there are
        int counter = 0;

        for(int i = 0; i < names.length; i++){
            if(names[i].contains(name)) {
                counter++;
            }
            return counter;
        }
        return counter;
    }

    public static int searchName(String name, String[] names){
        //search through array to find name
        int index = 0;
        for(int i = 0; i < names.length; i++){
            if(names[i].contains(name)){
                index = i;
                return index;
            }
            index = -1;
        }
        return index;
    }

    public static void display(String[] name, String[] petname, String[] type){
        System.out.printf("%-15s", "Customer Name");
        System.out.printf("%8s", "Pet Name");
        System.out.printf("%12s%n", "Pet Type");
        for(int i = 0; i < name.length; i++){
            if(name[i] == null){
                break;
            }
            System.out.printf("%-15s", name[i]);
            System.out.printf("%8s", petname[i]);
            System.out.printf("%12s%n", type[i]);
        }
    }

    public static void maniMenu(){
        //add new record
        //display existing customers
        //search records
        //exit
        System.out.println("Menu Options: ");
        System.out.println("1. Add New Record");
        System.out.println("2. Display Existing Customers");
        System.out.println("3. Search Records");
        System.out.println("4. Exit");

    }

    public static void searchMenu(){
        //display options
        System.out.println("Search Options: ");
        System.out.println("A. Search for Customer");
        System.out.println("B. Search for Pet");
        System.out.println("C. Pet Type Counter");
        System.out.println("D. Return to Main Menu");
    }
}
