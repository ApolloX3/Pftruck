/*
The Truck aggregate class, it takes in the values of the parts of the truck.
*/

package com.company;

import java.util.ArrayList;

public class Truck {
    //declare variables, "parts of truck"
    private Chassis chassis;
    private ArrayList<String> accessories;
    private PowerTrain powertrain;
    private Seat seat;
    private Transmission transmission;
    private Style style;
    // get and set the values of the objects that make up the attributes truck object in class truck
    public void setChassis(Chassis chassis1) {
        this.chassis = chassis1;
    }

    public Chassis getChassis() {
        return this.chassis;
    }

    public ArrayList<String> getAccessories() {
        return accessories;
    }

    public void setAccessories(ArrayList<String> accessories) {
        this.accessories = accessories;
    }

    public PowerTrain getPowerTrain() {
        return powertrain;
    }

    public void setPowerTrain(PowerTrain powertrain) {
        this.powertrain = powertrain;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}