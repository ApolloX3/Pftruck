package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Seat {

    private String yourSeat;
    private int seatChoice;

    public void getSeat(int val) {
        this.seatChoice = val;
//
//        System.out.println("Welcome to our Seats");
//
//        System.out.println(" \t Choose from 6 chassis types: \n " +
//                " 1. Smittybilt " + "\t 2.Bostrom\" \n " +
//                " 3. Black Talon  " + " 4.\t Air Ride");
//
//        System.out.println("Enter your choice of chassis here: ");

        Scanner scan = new Scanner(System.in);
        int seatChoice = scan.nextInt();

        ArrayList<String> seat = new ArrayList<String>();

        seat.add(" Smittybilt ");
        seat.add("Bostrom");
        seat.add(" Black Talon ");
        seat.add("Air Ride");

        yourSeat = seat.get(seatChoice - 1);

        System.out.println(yourSeat);

    }

    public String getYourSeat() {
        return yourSeat;
    }
}

