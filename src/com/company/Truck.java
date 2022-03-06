package com.company;

import java.util.ArrayList;

public class Truck {
    private Chassis chassis = new Chassis();
    private ArrayList<String> accessories = new ArrayList<String>();
    private Power engine = new Power();
    private Seat seat = new Seat();
    private Transmission tran = new Transmission();
    private Style style = new Style();

    public Truck() {
    }

    public String printAttributes() {
        String text = String.format(
                "Truck Specifications\n" +
                        "____________________\n" +
                        "Chassis: \n" +
                        "Wheelbase: %s" +
                        "Brakes: %s" +
                        "_____________________\n" +
                        "Accessories: \n" +
                        "%s \n" +
                        "______________________\n" +
                        "Power Train:\n" +
                        "Engine: %s\n" +
                        "_______________________\n" +
                        "Seat:\n" +
                        "Seat Type: %s\n" +
                        "_______________________\n" +
                        "Transmission:\n" +
                        "Transmission Type:%s\n" +
                        "_______________________\n" +
                        "Style:\n" +
                        "Truck Style: %s\n" +
                        "________________________\n" +
                        " Thank you for your Purchase!"

                , chassis.getWheelBaseChoice(), chassis.getBrakeChoice(),accessories
                , engine.getEngine(), seat.getSeatChoice(),
                tran.getTranChoice(), style.getYourStyleChoice());
        return text;
    }
    public void setYourChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Power setYourEngine(Power power) {
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

    public void setYourAccessories(ArrayList<String> buildAcc) {
        this.accessories = buildAcc;
    }
}