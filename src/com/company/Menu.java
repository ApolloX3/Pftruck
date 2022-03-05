package com.company;

import java.util.Scanner;

public class Menu {

    Truck truck;

    public void printMenu(Truck truck) {
        this.truck = truck;
        //print main menu
        Printer.printMainMenu();
        // Scan for menu choice
        Scanner scan = new Scanner(System.in);
        int menuChoice = scan.nextInt();
        // create new chassis object
        if (menuChoice != 0) {
            if (menuChoice > 0 & menuChoice < 7) {
                if (menuChoice == 1) {
                    Chassis chassis = new Chassis();
                    Printer.buildChassis();
                    truck.setYourChassis(chassis);
                    Printer.printMainMenu();
                } else if (menuChoice == 2) {
                    Accessories accessories = new Accessories();
                    Printer.buildAcc();
                    truck.setYourAccessories(Printer.buildAcc());
                    Printer.printMainMenu();
                }  ///// continue work here
            }
        }
    }
}



