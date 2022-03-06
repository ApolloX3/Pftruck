package com.company;


import java.util.Scanner;

public class Menu {

    Choices chose = new Choices();
    Printer printer = new Printer();
    Scanner scan = new Scanner(System.in);
    public int choice;

    public void displayMenu() {
        printer.printMainMenu();
        choice = scan.nextInt();
        chose.setAssembler(choice);
    }
}



