package com.company;

import java.util.Scanner;

public class Assembler {

    Truck truck;
    Run runBuild = new Run();
    Chassis chassis = new Chassis();
    Printer printer = new Printer();

    Assembler(Truck truck){
        this.truck = truck;
    }

    public void assembleChassis() {
        printer.printMainMenu();
        runBuild.runChassis();
    }
}
