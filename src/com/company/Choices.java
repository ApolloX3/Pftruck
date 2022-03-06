package com.company;

import java.util.Scanner;

public class Choices {

    Truck truck = new Truck();
    Assembler assembler;

    public Choices() {
        assembler = new Assembler(truck);
    }

    public void setAssembler(int choice) {
        if (choice == 1) {
            assembler.assembleChassis();
        }
        if (choice == 2) {
            assembler.assembleAcc();
        }
        if (choice == 3) {
            assembler.assemblePower();
        }
        if (choice == 4) {
            assembler.assembleSeat();
        }
        if (choice == 5) {
            assembler.assembleTran();
        }
        if (choice == 6) {
            assembler.assembleStyle();
        }
        if (choice == 7) {
            truck.printAttributes();
        }
    }
}
