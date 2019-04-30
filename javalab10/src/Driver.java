/* This is lab 1
@author amber
@version 4/29/19
This program uses classes, constructors, and methods to get information and display it.
The compare method displays a -1 if employee1 makes less than employee 2.
 */
import java.util.Scanner;

public class Driver {

    public static void main(String[] args){
        //create scanner
        Scanner input = new Scanner(System.in);

        //get info from user
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Age: ");
        int age = input.nextInt();
        System.out.println("ID number:");
        int id = input.nextInt();
        System.out.println("Salary: ");
        double salary = input.nextDouble();
        System.out.println("Department: ");
        String dep = input.next();

        //create employee using input
        Employee employee1 = new Employee(name, age, id, salary, dep);

        //display employee's salary
        System.out.println(employee1.getName() + "'s salary is $" + employee1.getSalary());
        //change salary
        double newSalary = 65000.0;
        employee1.setSalary(newSalary);
        //display new salary
        System.out.println(employee1.getName() + "'s salary is $" + employee1.getSalary());
        //display all info using toString()
        System.out.println(employee1.toString());

        //create another employee
        Employee employee2 = new Employee("Nick", 25, 45678, 70000, "Compsci");
        //compare employees
        System.out.println(employee1.compareTo(employee2));
    }
}
