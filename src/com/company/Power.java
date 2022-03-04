package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Power {

    private int powerChoice;
    private String yourEngine;

    public void getEngine(int val) {
        this.powerChoice = val;

//        System.out.println("Welcome to our Engines");
//
//        System.out.println(" \t Choose from 6 engine types: \n " +
//                " 1. 300 HP Mack  " + "\t 2. 350 Cummins \n " +
//                " 3. DD 15 " + " 4.\t 1693 Cat  \n" +
//                " 5. 60 Series Detroit " + "\t 6. C15 Cat \n ");
//
//        System.out.println(" Enter your choice of engine here: ");

        Scanner scan = new Scanner(System.in);
        int powerChoice = scan.nextInt();

        ArrayList<String> engine = new ArrayList<String>();

        engine.add(" 300 HP Mack ");
        engine.add("350 Cummins");
        engine.add("DD 15");
        engine.add("1693 Cat");
        engine.add("60 Series Detroit");
        engine.add("C15 Cat");

        yourEngine = engine.get(powerChoice - 1);

        System.out.println(yourEngine);

    }

    public String getYourEngine() {
        return yourEngine;
    }
}
