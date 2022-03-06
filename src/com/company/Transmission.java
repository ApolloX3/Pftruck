package com.company;
import java.util.ArrayList;

public class Transmission {
    private String tranChoice;
    private ArrayList<String> tranList;
    
    Transmission() {
        this.tranList = buildGearList();
    }
    private ArrayList<String> buildGearList() {
        ArrayList<String> tranList = new ArrayList<String>();
        tranList.add("19 gear transmission");
        tranList.add("18 gear transmission");
        tranList.add("17 gear transmission");
        tranList.add("16 gear transmission");

        return tranList;
    }
    public String getTranChoice() {
        return tranChoice;
    }
    public void setTranChoice(int tranChoice) {
        this.tranChoice = tranList.get(tranChoice - 1);
    }
    public ArrayList<String> getTranList() {
        return tranList;
    }
}
