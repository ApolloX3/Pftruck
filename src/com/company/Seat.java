package com.company;

import java.util.ArrayList;
/*
Seat class allows access to create a new seat
see style class for annotations of classes objects that are passed into truck
*/
public class Seat {

    private ArrayList<String> seatList;
    private String seatChoice;

    Seat() {
        seatList = buildSeatList();
    }

    private ArrayList buildSeatList() {
        ArrayList<String> seatList = new ArrayList<String>();
        seatList.add("Smitty-built Seat");
        seatList.add("Bostrom Seat");
        seatList.add("Black Talon Seat");
        seatList.add("Air Ride Seat");

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

    @Override
    public String toString() {
        return seatChoice;
    }
}

