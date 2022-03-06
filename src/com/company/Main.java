package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        // TODO: remove title class
        Title title = new Title("Truck Buying Software", "Let's Build Your Truck!");
        title.printTitle();

        Truck truck = new Truck();
        Menu menu = new Menu(truck);

        Scanner scan = new Scanner(System.in);

        printer.printMainMenu();

        int choice;
        choice = scan.nextInt();

        menu.chooseOption(choice);
    }
}
