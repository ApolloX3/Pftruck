package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Printer {
    public void printOptions(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            int counter = i + 1;
            System.out.println(
                    String.format(counter + ". " + list.get(i)));
        }
    }

    public void printMainMenu() {
        String menu = String.format(
                "\tPlease choose from the options below: \n" +
                        "1. Chassis         2. Accessories\n" +
                        "3. Power           4. Seat\n" +
                        "5. Transmission    6. Style\n" +
                        "\t---When finished press 7.---");
        System.out.println(menu);
    }

    public void printTruckAttributes(Truck truck) {
        String text = String.format(
                "Truck Specifications\n" +
                        "____________________\n" +
                        "Chassis: \n" +
                        "Wheelbase: %s\n" +
                        "Power train: %s\n"
        );
        System.out.println(text);
    }

    public void printTitle(String title, String tagline) {
        System.out.println(title + "\n" + "\t" + tagline);
    }
}

