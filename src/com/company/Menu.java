/*
The Menu class is made up of fields that allow the user to choose options from a menu of truck parts
*/
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // declares a truck object (from main"
    private Truck truck;
    //instantiates the object builder which will build out the users truck part
    Builder builder = new Builder();
    Scanner scan = new Scanner(System.in);
    // instantiates a new instance of printer which will interact with the user based on their choices
    Printer printer = new Printer();
    // Menu class constructor which takes in a truck from main and sets that truck to our encapsulated truck
    Menu(Truck truck) {
        this.truck = truck;
    }
    //method that allows a user to choose an option from a list; options to build truck
    public void chooseOption(int choice) {
        switch (choice) {
            case 1:
                //case 1 builds a new chassis, instantiating a new chassis object for the first time and sets the chassis objec to build.chassis, which builds chassus out
                Chassis chassis = builder.buildChassis();
                //we then pass the newly constructed chassis into our truck using the truck.setChassis method.
                truck.setChassis(chassis);
                System.out.println();
                //we then prompt the user to select more choices
                menuPrompt();
                break;
            case 2:
                //same as chassis but with an ArrayList
                ArrayList<String> accessories = builder.buildAccessories();
                truck.setAccessories(accessories);
                System.out.println();
                menuPrompt();
                break;
            case 3:
                // same as above
                PowerTrain powertrain = builder.buildPowerTrain();
                truck.setPowerTrain(powertrain);
                menuPrompt();
                break;
            case 4:
                // same as above
                Seat seat = builder.buildSeat();
                truck.setSeat(seat);
                System.out.println();
                menuPrompt();
                break;
            case 5:
                // same as above
                Transmission transmission = builder.buildTransmission();
                truck.setTransmission(transmission);
                System.out.println();
                menuPrompt();
                break;
            case 6:
                // same as above
                Style style = builder.buildStyle();
                truck.setStyle(style);
                System.out.println();
                menuPrompt();
                break;
            case 7:
                // in the final case the the summary of all the choices is printed to the console
                // try catch to make user fill out all fields on form
                try {
                    printer.printTruckAttributes(truck);
                } catch (Exception e) {
                    System.out.println("You're not finished filling out all the values in your form, please try again.\n");
                    menuPrompt();
                }
                // if user doesnt select and numbber 1 -7...
            default:
                System.out.println("Please enter valid number...");
                menuPrompt();
        }
    }
    public void menuPrompt() {
        // menu prompt calls printer to print main menu
        printer.printMainMenu();
        // once menu is printed we recall the choose option method which will wait for user input " under " the menu
        chooseOption(scan.nextInt());
    }
}