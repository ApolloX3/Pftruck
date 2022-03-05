package com.company;

import java.util.ArrayList;

public class Truck {
    private Chassis chassis;
    private ArrayList<String> accChoices;
    private Power engine;
    private Seat seat;
    private Transmission tran;
    private Style style;

    public Truck() {
    }
    public void setYourChassis(Chassis chassis) {
        this.chassis = chassis;
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
    public void setYourAccessories(ArrayList<String> accChoices ) {
         this.accChoices = accChoices;
    }
    public Power setYourEngine (Power power) {
        return this.engine = power;
    }
    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    public void setTran(Transmission tran) {
        this.tran = tran;
    }
    public void setStyle(Style style) {
        this.style = style;
    }
}