package com.company;

import java.util.ArrayList;

public class Accessories {

    private ArrayList<String> accessories;

    Accessories() {
        this.accessories = buildAccList();
    }

    private ArrayList<String> buildAccList() {
        ArrayList<String> accessories = new ArrayList<String>();
        accessories.add("Curved Top Truck Exhaust");
        accessories.add("Step Truck Tool Box");
        accessories.add("Stainless Steel Truck Fenders");
        accessories.add("GPS");
        accessories.add("Custom Print Floor Mats");
        accessories.add("Noise Canceling Headset");
        accessories.add("Steering Wheel Cover");
        accessories.add("TV");
        accessories.add("Air Horns");
        accessories.add("Jump-Start Kit");

        return accessories;
    }

    public ArrayList<String> getAccessories() {
        return accessories;
    }
}

