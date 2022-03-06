package com.company;

import java.util.Scanner;

public class Menu {

    Truck truck = new Truck();
    Printer printer = new Printer();
    Run runBuild = new Run();

    public void printMenu(Truck truck) {
        this.truck = truck;
        //print main menu
        printer.printMainMenu();
        // Scan for menu choice
        Scanner scan = new Scanner(System.in);
        int menuChoice = scan.nextInt();
        // create new chassis object
        if (menuChoice != 0) {
            if (menuChoice > 0 & menuChoice < 7) {
                if (menuChoice == 1) {
                    runBuild.runChassis();
                    
                } else if (menuChoice == 2) {
                    runBuild.runAcc();

                } else if (menuChoice == 3) {
                    runBuild.runPower();

                } else if (menuChoice == 4) {
                    runBuild.runSeat();

                } else if (menuChoice == 5) {
                    runBuild.runTran();

                } else if ( menuChoice == 6) {
                    runBuild.runStyle();

                } else if (menuChoice == 7) {
                    truck.printAttributes();
                }
                else {
                    System.out.println("Enter a valid choice 1 - 6");
                    printMenu(truck);
                }
            }
        }
    }
}



