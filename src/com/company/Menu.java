package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Truck truck;

    Builder builder = new Builder();
    Scanner scan = new Scanner(System.in);
    Printer printer = new Printer();

    Menu(Truck truck) {
        this.truck = truck;
    }

    public void chooseOption(int choice) {
        if (choice == 1) {
            Chassis chassis = builder.buildChassis();
            truck.setChassis(chassis);
            menuPrompt();
        }
        if (choice == 2) {
            ArrayList<String> accessories = builder.buildAccessories();
            truck.setAccessories(accessories);
            menuPrompt();
        }
        if (choice == 3) {
            PowerTrain powertrain = builder.buildPowerTrain();
            truck.setPowerTrain(powertrain);
            menuPrompt();
        }
        if (choice == 4) {
            Seat seat = builder.buildSeat();
            truck.setSeat(seat);
            menuPrompt();
        }
        if (choice == 5) {
            Transmission transmission = builder.buildTransmission();
            truck.setTransmission(transmission);
            menuPrompt();
        }
        if (choice == 6) {
            Style style = builder.buildStyle();
            truck.setStyle(style);
            menuPrompt();
        }
        if (choice == 7) {
            try {
                printer.printTruckAttributes(truck);
            } catch (Exception e) {
                menuPrompt();
            }
        }
    }

    public void menuPrompt() {
        printer.printMainMenu();
        chooseOption(scan.nextInt());
    }
}