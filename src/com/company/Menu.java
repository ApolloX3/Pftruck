package com.company;

import java.util.Scanner;

public class Menu {

    Truck truck;
    com.company.printer printer = new printer();

    public void printMenu(Truck truck) {
        this.truck = truck;
        //print main menu
        com.company.printer.printMainMenu();
        // Scan for menu choice
        Scanner scan = new Scanner(System.in);
        int menuChoice = scan.nextInt();
        // create new chassis object
        if (menuChoice != 0) {
            if (menuChoice > 0 & menuChoice < 7) {
                if (menuChoice == 1) {
                    Chassis chassis = new Chassis();
                    printer.buildChassis();
                    truck.setYourChassis(chassis);
                    printer.printMainMenu();
                } else if (menuChoice == 2) {
                    //Accessories accessories = new Accessories();
                    printer.buildAcc();
                    truck.setYourAccessories(com.company.printer.buildAcc());
                    com.company.printer.printMainMenu();
                    /// fix index out of bounds exception
                } else if (menuChoice == 3) {
                    Power power = new Power();
                    printer.buildPower();
                    truck.setYourEngine(power);
                    printer.printMainMenu();
                } else if (menuChoice == 4) {
                    Seat seat = new Seat();
                    printer.buildSeat();
                    truck.setSeat(seat);
                    com.company.printer.printMainMenu();
                } else if (menuChoice == 5) {
                    Transmission tran = new Transmission();
                    printer.

                }
            }
        }
    }
}



