package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Style {

    private String yourStyle;


    public void getStyle() {


        System.out.println("Welcome to our Seats");

        System.out.println(" \t Choose from 6 chassis types: \n " +
                " 1. Long Flat Nose" + "\t 2.Slant Nose\n");

        System.out.println("Enter your choice of chassis here: ");

        Scanner scan = new Scanner(System.in);
        int styleChoice = scan.nextInt();

        ArrayList<String> style = new ArrayList<String>();

        style.add(" Long Flat Nose ");
        style.add("Slant Nose");


        String yourStyle = style.get(styleChoice - 1);

        System.out.println(yourStyle);
    }

    public String getYourStyle() {
        return yourStyle;
    }

    public void setYourStyle(String yourStyle) {
        this.yourStyle = yourStyle;
    }
}
