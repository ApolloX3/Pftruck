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
            PowerTrain powertrain = new PowerTrain();
            truck.setPowerTrain(powertrain);
            menuPrompt();
        }
//        if (choice == 4) {
//            assembler.assembleSeat();
//        }
//        if (choice == 5) {
//            assembler.assembleTran();
//        }
//        if (choice == 6) {
//            assembler.assembleStyle();
//        }
        if (choice == 7) {
            truck.printAttributes();
        }
    }

    private void menuPrompt() {
        printer.printMainMenu();

        chooseOption(scan.nextInt());
    }
}