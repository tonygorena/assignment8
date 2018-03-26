/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.util.Scanner;

/**
 * @author tonygorena
 */
public class a8main {

    public static void main(String[] args) {
        int size = 23;
        int choice;                                  //Choice variable for options
        boolean stop = false;                        //variable to stop program
        Scanner keyboard = new Scanner(System.in);   //Creates scanner for user input

        //User menu
        System.out.println("MENU");
        System.out.println("___________________________________");
        System.out.println("1) INSERT item");
        System.out.println("2) DELETE item");
        System.out.println("3) FIND item");
        System.out.println("4) SHOW Hash table");
        System.out.println("5) QUIT \n");



        HashDictionary userHash = new HashDictionary<String>(size);         //Creates new hash object

        System.out.print("Enter Choice: ");         //Prompt user for choice

        //Loop until user enter 7 to quit
        while (stop == false) {
            choice = keyboard.nextInt();            //Sets choice to next int entered

            if (choice <= 0 || choice > 5) //reports error if choice is not in range
            {
                error(3);
            }

            //Inserts item to hash table
            if (choice == 1) {
                System.out.print("Enter item to INSERT: ");
                String item = keyboard.next();
                error(userHash.insert(item));
                System.out.print("Enter Choice: ");
            }

            //Delete an item from hash table
            if (choice == 2) {
                System.out.print("Enter item to DELETE: ");
                String item = keyboard.next();
                error(userHash.delete(item));
                System.out.print("Enter Choice: ");
            }

            //Find item in hash table
            if (choice == 3) {
                System.out.print("Enter item to FIND: ");
                String item = keyboard.next();
                error(userHash.find(item));
                System.out.print("Enter Choice: ");
            }

            //
            if (choice == 4) {
                userHash.show();
                System.out.print("Enter Choice: ");
            }

            //Quit the program
            if (choice == 5) {
                stop = true;
            }

        }

    }

    /**
     * Reports errors from program
     *
     * @param error the error value associated with error
     */
    public static void error(int error) {
        if (error == 0) //No error has occured
        {
            return;
        }

        //initialize string and reports unknown error if value is null;
        String errorString = "unknown error";

        //Switch statement to report errors
        switch (error) {
            case -1:
                errorString = "Hash table is full";
                break;
            case -2:
                errorString = "Hash Table is empty";
                break;
            case -3:
                errorString = "Not in range";
                break;
            case -4:
                errorString = "Not in table";

        }
        System.out.println(errorString);            //Prints error message
    }
}
