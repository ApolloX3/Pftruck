package com.company;

public class Truck {
    private Chassis chassis;

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
}