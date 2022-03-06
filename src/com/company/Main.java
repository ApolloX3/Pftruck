package com.company;

public class Main {

    public static void main(String[] args) {
        Title title = new Title("Truck Buying Software", "Let's Build Your Truck!");
        title.printTitle();

        Menu menu = new Menu();
        menu.displayMenu();

        Truck truck = new Truck();
        truck.printAttributes();
        // move to choices class?
    }
}
