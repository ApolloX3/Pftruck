package com.company;

public class Main {

    public static void main(String[] args) {
        Title title = new Title("Truck Buying Software", "Let's Build Your Truck!");
        title.printTitle();

        Repeat callMenu = new Repeat();
        callMenu.repeatItem();

    }
}
