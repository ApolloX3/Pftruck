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
        switch (choice) {
            case 1:
                Chassis chassis = builder.buildChassis();
                truck.setChassis(chassis);
                menuPrompt();
                break;
            case 2:
                ArrayList<String> accessories = builder.buildAccessories();
                truck.setAccessories(accessories);
                menuPrompt();
                break;
            case 3:
                PowerTrain powertrain = builder.buildPowerTrain();
                truck.setPowerTrain(powertrain);
                menuPrompt();
                break;
            case 4:
                Seat seat = builder.buildSeat();
                truck.setSeat(seat);
                menuPrompt();
                break;
            case 5:
                Transmission transmission = builder.buildTransmission();
                truck.setTransmission(transmission);
                menuPrompt();
                break;
            case 6:
                Style style = builder.buildStyle();
                truck.setStyle(style);
                menuPrompt();
                break;
            case 7:
                try {
                    printer.printTruckAttributes(truck);
                } catch (Exception e) {
                    System.out.println("You're not finished filling out all the values in your form, please try again.\n");
                    menuPrompt();
                }
            default:
                System.out.println("Please enter valid number...");
                menuPrompt();
        }
    }

    public void menuPrompt() {
        printer.printMainMenu();
        chooseOption(scan.nextInt());
    }
}