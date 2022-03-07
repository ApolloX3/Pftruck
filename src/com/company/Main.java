/*
Pf_Truck is a program that allows a user to customize the purchase of a semi-truck
it welcomes the user and presents them with a list of options for picking out various
parts of the truck i.e. building the truck.
Then it prints the formatted invoice back to user so they can see their selesctions.
*/
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instantiates an object of the printer class
        Printer printer = new Printer();
        //calls the "printTitle" Method on printer object to print out a greeting
        printer.printTitle("Truck Buying Software", "Let's Build Your Truck!");
        //instantiates an object of the truck class - this is our aggregator
        Truck truck = new Truck();
        //instantiates on object the menu class which takes our newly created truck object
        Menu menu = new Menu(truck);
        //call print mainMenu method on printer to display menu optios to user
        printer.printMainMenu();
        // calls chooseOption method on menu, choose option method takes in a user given choice from Scanner
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        menu.chooseOption(choice);
    }
}
