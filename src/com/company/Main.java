package com.company;

public class Main {

    public static void main(String[] args) {
        Title title = new Title("Truck Buying Software", "Let's Build Your Truck!");
        title.printTitle();

        Menu menu = new Menu();
        Truck truck = new Truck();

        menu.printMenu(truck);

        System.out.println(truck.printAttributes());
    }
}
