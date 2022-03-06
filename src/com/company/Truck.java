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
                        "Wheelbase: %s\n",chassis.getWheelBaseChoice() +
                        "Brakes: %s\n",chassis.getBrakeChoice() +
                        "_____________________\n" +
                        "Accessories: \n" +
                        "%s\n",accessories +
                        "______________________\n" +
                        "Power Train:\n" +
                        "Engine: %s\n",engine.getEngine() +
                        "_______________________\n" +
                        "Seat:\n" +
                        "Seat Type: %s\n",seat.getSeatChoice() +
                        "_______________________\n" +
                        "Transmission:\n" +
                        "Transmission Type:%s\n",tran.getTranChoice() +
                        "_______________________\n" +
                        "Style:\n" +
                        "Truck Style: %s\n",style.getYourStyleChoice() +
                        "________________________\n" +
                        " Thank you for your Purchase!");
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