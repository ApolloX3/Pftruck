package com.company;

import java.util.Scanner;

public class Repeat {

    public void repeatItem() {
        String answerString = "y";
        if (answerString.equalsIgnoreCase("y")) {



            System.out.println("Would you like to continue with your selections?");
            Scanner scan = new Scanner(System.in);
            answerString = scan.next();
        }
    }

}
