package com.company;

import java.util.Scanner;

public class Choices {

    Truck truck = new Truck();
    Assembler assembler = new Assembler(truck);

    public void setAssembler (int choice) {
        if (choice == 1) {
            assembler.assembleChassis();
        }
    }
}
