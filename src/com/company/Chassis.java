package com.company;

import java.util.ArrayList;

public class Chassis {

    private String brakeChoice;
    private String wheelBaseChoice;
    private ArrayList<String> wheelBaseList;
    private ArrayList<String> brakeList;

    Chassis() {
        wheelBaseList = buildWheelBaseList();
        brakeList = buildBrakeList();
    }

    public String getWheelBaseChoice() {
        return wheelBaseChoice;
    }

    public void setWheelBaseChoice(int wheelNum)
    {
        wheelBaseChoice = wheelBaseList.get(wheelNum - 1);
    }

    private ArrayList buildWheelBaseList() {
        ArrayList<String> wheelList = new ArrayList<>(3);
        wheelList.add("1st wheelbase choice");
        wheelList.add("2nd wheelbase choice");
        wheelList.add("3rd wheelbase choice");

        return wheelList;
    }

    public ArrayList<String> getBrakeList() {
        return brakeList;
    }

    public ArrayList<String> getWheelBaseList() {
        return wheelBaseList;
    }

    private ArrayList buildBrakeList() {
        ArrayList<String> brakeList = new ArrayList<>();
        brakeList.add("1st brake choice");
        brakeList.add("2nd brake choice");
        brakeList.add("3rd brake choice");

        return brakeList;
    }
    public String getBrakeChoice() {
        return brakeChoice;
    }

    public void setBrakeChoice(int brakeNum) {
        this.brakeChoice = brakeList.get(brakeNum - 1);
    }
}