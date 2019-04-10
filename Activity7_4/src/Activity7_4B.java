import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* This is the code for Activity 7.3
@author amber
@version 4/9/19
This program should allow the user to create usernames and passwords, which will be stored in a txt file.
Part B will ask them to use the username and password, accessing it from the file, then verifying if it's correct.
 */
public class Activity7_4B {

    public static void main(String[] args) throws IOException {
        //create file
        java.io.File file = new java.io.File("accounts.txt");
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        //create scanner
        Scanner input = new Scanner(System.in);
        //create array lists
        ArrayList<String> un = new ArrayList<>();
        ArrayList<String> pw = new ArrayList<>();
        //create loop
        for (int i = 0; i < 100; i++) {
            //ask for username
            System.out.println("Enter a username: ");
            String username = input.nextLine();
            //update array list
            un.add(username);

            //ask for password
            System.out.println("Enter a password: ");
            String password = input.nextLine();
            //update array list
            pw.add(password);

            //ask to continue
            System.out.println("Would you like to enter another?");
            String c = input.nextLine();
            c = c.toLowerCase();
            char choice = c.charAt(0);
            if(choice == 'n') {
                System.out.println("Goodbye.");
                break;
            }

        }
        //store in file
        for(int i = 0; i < un.size(); i++) {
            output.println(un.get(i) + " " + pw.get(i));
        }
        //ask user to login
        System.out.println("Please enter your username: ");
        String name = input.nextLine();
        //see if it matches
        if(un.contains(name)){
            int index = un.indexOf(name);
            System.out.println("Please enter your password: ");
            String word = input.nextLine();
            if(pw.indexOf(word) == index){
                System.out.println("Success!");
            }
            else
                System.out.println("That account does not exist.");
        }

        input.close();
        output.close();

    }

}
