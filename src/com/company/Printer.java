package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Printer {

    Printer printer;

    public void printOptions(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            int counter = i + 1;
            System.out.println(
                    String.format(counter + ". " + list.get(i))
            );
        }
    }
    public void printMainMenu() {
        String menu = String.format(
                "\tPlease choose from the options below: \n" +
                "1. Chassis  2. Accessories\n" +
                "3. Power    4. Transmission\n" +
                "5. Seat     6. Style");
        System.out.println(menu);
    }
    public void buildChassis() {
        // choose wheel base
        Scanner scan = new Scanner(System.in);
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
    }
    public ArrayList<String> buildAcc() {
        //choose accessories
        Accessories accessories = new Accessories();

        printer.printOptions(accessories.getAccessories());

        ArrayList<String> accList = accessories.getAccessories();
        ArrayList<String> accChoices = new ArrayList<String>();

        boolean repeat = true;
        while (repeat == true) {
            System.out.println("Enter an Accessorie:");
            Scanner scan = new Scanner(System.in);
            int accNum = scan.nextInt();
            accChoices.add(accList.get(accNum - 1));
            System.out.println("You Chose: " + accChoices.get(accNum - 1));

            System.out.println("would you like another Accessorie? y/n");
            String answerString = scan.next();
            if (answerString.equalsIgnoreCase("y")) {
                repeat = true;
            } else {
                repeat = false;
            }
        }
        System.out.println("You chose:");
        for (int i = 0; i < accChoices.size(); ++i) {
            System.out.println(accChoices.get(i));
        }
        return accChoices;
    }
    public void buildPower() {
        Scanner scan = new Scanner(System.in);
        Power power = new Power();

        printer.printOptions(power.getEngine());
        int engineChoice = scan.nextInt();

        power.setEngineChoice(engineChoice);
        System.out.println("You chose:");
        System.out.println(power.getEngineChoice());
    }
    public void buildSeat() {
        Scanner scan = new Scanner(System.in);
        Seat seat = new Seat();

        printer.printOptions(seat.getSeatList());
        int seatChoice = scan.nextInt();

        seat.setSeatChoice(seatChoice);
        System.out.println("You Chose:");
        System.out.println(seat.getSeatChoice());
    }
    public void buildTransmission() {
        Scanner scan = new Scanner(System.in);
        Transmission tran = new Transmission();

        printer.printOptions(tran.getTranList());
        int tranChoice = scan.nextInt();

        tran.setTranChoice(tranChoice);
        System.out.println("You Chose:");
        System.out.println(tran.getTranChoice());
    }
    public void buildStyle() {
        Scanner scan = new Scanner(System.in);
        Style style = new Style();

        printer.printOptions(style.getStyleList());
        int styleChoice = scan.nextInt();

        style.setYourStyle(styleChoice);

        System.out.println("You Chose:");
        System.out.println(style.getYourStyleChoice());
    }
}

