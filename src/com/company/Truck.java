package com.company;

import java.util.ArrayList;

public class Truck {
    private Chassis chassis;
    private ArrayList<String> accChoices;
    private Power engine;
    private Seat seat;

    public Truck() {
    }

    public Chassis setYourChassis(Chassis chassis) {
        return this.chassis = chassis;
    }

    public String printAttributes() {
        String text = String.format(
                "Truck Specifications\n" +
                        "____________________\n" +
                        "Chassis: \n" +
                        "Wheelbase: %s"
                , chassis.getWheelBaseChoice());
        return text;
    }

    public ArrayList<String> setYourAccessories(ArrayList<String> accChoices ) {
        return this.accChoices = accChoices;
    }

    public Power setYourEngine (Power power) {
        return this.engine = power;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}