package com.company;

import java.util.ArrayList;

public class Truck {
    private Chassis chassis;
    private ArrayList<String> accessories;
    private PowerTrain powertrain;

    public void printAttributes() {
        String text = String.format(
                "Truck Specifications\n" +
                        "____________________\n" +
                        "Chassis: \n" +
                        "Wheelbase: %s\n", getChassis().getWheelBaseChoice() +
                        "Power train: %s\n", getPowerTrain()
        );

        System.out.println(text);
    }

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
}