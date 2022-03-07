/*
The printer class allows  the user the option to print data to console
*/

package com.company;

import java.util.ArrayList;

public class Printer {
    //print options method takes any arraylist and formats it into a numbered list for the user
    public void printOptions(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            int counter = i + 1;
            System.out.println(
                    String.format(counter + ". " + list.get(i)));
        }
    }

    public void printMainMenu() {
        // prints the main menu to console
        String menu = String.format(
                "\tPlease choose from the options below: \n" +
                        "1. Chassis         2. Accessories\n" +
                        "3. Power           4. Seat\n" +
                        "5. Transmission    6. Style\n" +
                        "\t---When finished press 7.---");
        System.out.println(menu);
    }

    public void printTruckAttributes(Truck truck) {
    // had trouble formatting here... takes finished truck object ans prints components to user
        System.out.println("Truck Specifications \n" + "____________________\n" + "Chassis:\n");
        System.out.println("Wheelbase: \n" + truck.getChassis().getWheelBaseChoice());
        System.out.println("Brakes:\n" + truck.getChassis().getBrakeChoice());
        System.out.println("_____________________");
        System.out.println("Power Train:\n" + truck.getPowerTrain());
        System.out.println("______________________");
        System.out.println("Transmission: \n" + truck.getTransmission());
        System.out.println("_______________________");
        System.out.println("Style: \n" + truck.getStyle());
        System.out.println("_______________________");
        System.out.println("Seat: \n" + truck.getSeat());
        System.out.println("_______________________");
        System.out.println("Accessories \n" + truck.getAccessories());
    }
    // prints our greeting
    public void printTitle(String title, String tagline) {
        System.out.println(title + "\n" + "\t" + tagline);
    }
}

