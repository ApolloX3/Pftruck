package com.company;
import java.util.ArrayList;

public class Transmission {
    private String tranChoice;
    private ArrayList<String> gearList;
    
    Transmission() {
        this.gearList = buildGearList();
    }
    private ArrayList<String> buildGearList() {
        ArrayList<String> gearList = new ArrayList<String>();
        gearList.add("19");
        gearList.add("18");
        gearList.add("17");
        gearList.add("16");

        return gearList;
    }
    public String getTranChoice() {
        return tranChoice;
    }
    public void setTranChoice(int tranChoice) {
        this.tranChoice = gearList.get(tranChoice - 1);
    }
}
