/*
The builder class has fields that allow the program to " build out " each part that the user selects
builder is where most of the function of the program is, when builder is called in the menu class it instantiates
the objects that will be fed into the Truck object.
*/
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Builder {
    Scanner scan = new Scanner(System.in);

    Printer printer = new Printer();
    public Chassis buildChassis() {
        // build chassis field instantiates a new chassis
        Chassis chassis = new Chassis();
        //printer prints the list of options for wheelbase type user
        printer.printOptions(chassis.getWheelBaseList());
        //scan for choice
        int wheelBaseNum = scan.nextInt();
        //print list for brake choice
        printer.printOptions(chassis.getBrakeList());
        int brakeChoice = scan.nextInt();
        // sets the choices for wheelbase and brakes using a mutator method on the chassis object
        chassis.setWheelBaseChoice(wheelBaseNum);
        chassis.setBrakeChoice(brakeChoice);
        //prints users choice back to them
        System.out.println("You chose:");
        System.out.println(chassis.getWheelBaseChoice());
        System.out.println(chassis.getBrakeChoice());
        // this method returns the chassis object when finished allowing the object to be passed into other methods
        return chassis;
    }
    //same as chassis
    public ArrayList<String> buildAccessories() {
        Accessories accessories = new Accessories();
        printer.printOptions(accessories.getAccessories());

        ArrayList<String> accList = accessories.getAccessories();
        ArrayList<String> accChoices = new ArrayList<>();

        String answerString = "y";
        // here we allow the user to choose multiple options which will be loaded into a list
        while (answerString.equalsIgnoreCase("y")) {
            System.out.println("Enter an Accessory:");

            int accessoryNum = scan.nextInt();
            String selection = accList.get(accessoryNum - 1);

            accChoices.add(selection);

            System.out.println("You Chose: " + selection);
            System.out.println("would you like another Accessory? y/n");

            answerString = scan.next();
        }

        System.out.println("You chose:");
        // we print back the users choice to the console
        for (String selection : accChoices){
            System.out.println(selection);
        }
        return accChoices;
    }

    public PowerTrain buildPowerTrain() {
        PowerTrain powertrain = new PowerTrain();

        printer.printOptions(powertrain.getEngine());
        int engineChoice = scan.nextInt();

        powertrain.setEngineChoice(engineChoice);

        System.out.println("You chose:");
        System.out.println(powertrain.getEngineChoice());

        return powertrain;
    }
    //same as chassis
    public Seat buildSeat() {
        Seat seat = new Seat();

        printer.printOptions(seat.getSeatList());
        int seatChoice = scan.nextInt();

        seat.setSeatChoice(seatChoice);
        System.out.println("You Chose:");
        System.out.println(seat.getSeatChoice());

        return seat;
    }
    //same as chassis
    public Transmission buildTransmission() {
        Transmission transmission = new Transmission();

        printer.printOptions(transmission.getTranList());
        int tranChoice = scan.nextInt();

        transmission.setTranChoice(tranChoice);
        System.out.println("You Chose:");
        System.out.println(transmission.getTranChoice());

        return transmission;
    }
    //same as chassis
    public Style buildStyle() {
        Style style = new Style();

        printer.printOptions(style.getStyleList());
        int styleChoice = scan.nextInt();

        style.setYourStyle(styleChoice);

        System.out.println("You Chose:");
        System.out.println(style.getYourStyleChoice());

        return style;
    }
}
