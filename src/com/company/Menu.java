package com.company;

import java.util.Scanner;

public class Menu {

    private Truck truck;
    Scanner scan = new Scanner(System.in);
    int intChoice = 0;

    Menu(Truck truck) {
        this.truck = truck;
    }

    public void printMenu() {
        System.out.println(" Enter a part of truck to choose:");
        System.out.println("1. Chassis");
        intChoice = scan.nextInt();

        switch (intChoice) {
            case 1:
                // choose wheel base
                Chassis chassis = new Chassis();

                Printer.printOptions(chassis.getWheelBaseList());
                int wheelBaseNum = scan.nextInt();

                Printer.printOptions(chassis.getBrakeList());
                int brakeChoice = scan.nextInt();

                chassis.setWheelBaseChoice(wheelBaseNum);
                chassis.setBrakeChoice(brakeChoice);

                System.out.println("You chose: ");
                System.out.println(chassis.getWheelBaseChoice());
                System.out.println(chassis.getBrakeChoice());

                // assign chosen chassis specs to the chassis parameter of the truck
                truck.setYourChassis(chassis);
                // print out menu to allow user to choose the rest of the truck attributes
                printMenu();
            case 2:
                Accessories accChoices = new Accessories();

                Printer.printOptions(accChoices.accessories);
                // scan for user selection
                // add user selections into new arraylist
                // print menu at end

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                truck.printAttributes();
            default:
                throw new AssertionError();
        } // END OF SWITCH.
    } // END OF processChoice() METHOD.
} // END OF Menu CLASS.



