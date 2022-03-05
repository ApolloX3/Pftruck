package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Printer {

    public static void printOptions(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            int counter = i + 1;
            System.out.println(
                    String.format(counter + ". " + list.get(i))
            );
        }
    }

    public static void printMainMenu() {
        String menu = String.format("\tPlease choose from the options below: \n" +
                "1. Chassis  2. Accessories\n" +
                "3. Power    4. Transmission\n" +
                "5. Seat     6. Style");
        System.out.println(menu);
    }

    public static void buildChassis() {
        // choose wheel base
        Scanner scan = new Scanner(System.in);

        Chassis chassis = new Chassis();

        Printer.printOptions(chassis.getWheelBaseList());
        int wheelBaseNum = scan.nextInt();

        Printer.printOptions(chassis.getBrakeList());
        int brakeChoice = scan.nextInt();

        chassis.setWheelBaseChoice(wheelBaseNum);
        chassis.setBrakeChoice(brakeChoice);

        System.out.println("You chose:");
        System.out.println(chassis.getWheelBaseChoice());
        System.out.println(chassis.getBrakeChoice());
    }

    public static ArrayList<String> buildAcc() {
        //choose accessories
        Accessories accessories = new Accessories();

        Printer.printOptions(accessories.getAccessories());

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
}

