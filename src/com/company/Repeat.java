package com.company;

import java.util.Scanner;

public class Repeat {

    public void repeatItem() {
        String answerString = "y";
        while (answerString.equalsIgnoreCase("y")) {

            Menu menu = new Menu();
            menu.displayMenu();

            System.out.println("Would you like to continue with your selections y/n ?");
            Scanner scan = new Scanner(System.in);
            answerString = scan.next();
        }
        System.out.println("GoodBye");
    }
}
