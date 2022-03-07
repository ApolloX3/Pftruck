package com.company;

import java.util.Scanner;

public class Main {
// TODO: stop menu from running after case: 7 is chosen
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printTitle("Truck Buying Software","Let's Build Your Truck!");

        Truck truck = new Truck();
        Menu menu = new Menu(truck);

        printer.printMainMenu();

        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        menu.chooseOption(choice);
    }
}
