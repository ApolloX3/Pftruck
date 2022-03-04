package com.company;

import javax.accessibility.AccessibleRelation;
import java.util.ArrayList;



// specify attributes of a truck `
// print an invoice of truck sale



public class Main {

    public static void main(String[] args) {
        Title title = new Title("Truck Buying Software", "Let's Build Your Truck!");

        title.printTitle();

        Truck truck = new Truck();
        Menu menu = new Menu(truck);
        menu.printMenu();

        System.out.println(truck.printAttributes());
    }
}
