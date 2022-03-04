package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Transmission {

private String yourTran;
private int tranChoice;

    public void tranNum( int val) {
    this.tranChoice = val;

//        System.out.println("Welcome to our Transmissions");
//
//        System.out.println(" \t Choose from 4 Transmission types: \n " +
//                " 1. 19 " + "\t 2. 18 \n " +
//                " 3. 17" + " 4.\t 16  \n");
//
//        System.out.println(" Enter your choice of Transmission here: ");

        Scanner scan = new Scanner(System.in);
        int gearChoice = scan.nextInt();

        ArrayList<String> gear = new ArrayList<String>();

        gear.add("19");
        gear.add("18");
        gear.add("17");
        gear.add("16");

        yourTran = gear.get(tranChoice - 1);

        System.out.println(yourTran);

    }

    public String getYourTran() {
        return yourTran;
    }
}
