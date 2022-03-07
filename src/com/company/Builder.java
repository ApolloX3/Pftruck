package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Builder {
    Scanner scan = new Scanner(System.in);

    Printer printer = new Printer();

    public Chassis buildChassis() {
        Chassis chassis = new Chassis();

        printer.printOptions(chassis.getWheelBaseList());
        int wheelBaseNum = scan.nextInt();

        printer.printOptions(chassis.getBrakeList());
        int brakeChoice = scan.nextInt();

        chassis.setWheelBaseChoice(wheelBaseNum);
        chassis.setBrakeChoice(brakeChoice);

        System.out.println("You chose:");
        System.out.println(chassis.getWheelBaseChoice());
        System.out.println(chassis.getBrakeChoice());

        return chassis;
    }

    public ArrayList<String> buildAccessories() {
        Accessories accessories = new Accessories();
        printer.printOptions(accessories.getAccessories());

        ArrayList<String> accList = accessories.getAccessories();
        ArrayList<String> accChoices = new ArrayList<>();

        String answerString = "y";

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

        for (int i = 0; i < accChoices.size(); ++i) {
            System.out.println(accChoices.get(i));
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

    public Seat buildSeat() {
        Seat seat = new Seat();

        printer.printOptions(seat.getSeatList());
        int seatChoice = scan.nextInt();

        seat.setSeatChoice(seatChoice);
        System.out.println("You Chose:");
        System.out.println(seat.getSeatChoice());

        return seat;
    }

    public Transmission buildTransmission() {
        Transmission transmission = new Transmission();

        printer.printOptions(transmission.getTranList());
        int tranChoice = scan.nextInt();

        transmission.setTranChoice(tranChoice);
        System.out.println("You Chose:");
        System.out.println(transmission.getTranChoice());

        return transmission;
    }

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
