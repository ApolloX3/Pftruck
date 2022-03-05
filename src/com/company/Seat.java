package com.company;

import java.util.ArrayList;

public class Seat {

    private ArrayList<String> seatList;
    private String seatChoice;

    Seat() {
        seatList = buildSeatList();
    }

    private ArrayList buildSeatList() {
        ArrayList<String> seatList = new ArrayList<String>();
        seatList.add(" Smitty-built ");
        seatList.add("Bostrom");
        seatList.add(" Black Talon ");
        seatList.add("Air Ride");

        return seatList;
    }

    public String getSeatChoice() {
        return seatChoice;
    }

    public void setSeatChoice(int seatNum) {
        this.seatChoice = seatList.get(seatNum - 1);
    }

    public ArrayList<String> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<String> seatList) {
        this.seatList = seatList;
    }
}

