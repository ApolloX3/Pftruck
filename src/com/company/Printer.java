package com.company;

import java.util.ArrayList;

public class Printer {

    public static void printOptions(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            int counter = i + 1;
            System.out.println(
                    String.format(counter + ". " + list.get(i))
            );
        }
    }
}
