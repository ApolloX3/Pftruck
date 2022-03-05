package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Power {

    private String engineChoice;
    private ArrayList<String> engine;

    Power() {
        this.engine = buildEngineList();
    }

    private ArrayList<String> buildEngineList() {
        ArrayList<String> engine = new ArrayList<>();
        engine.add(" 300 HP Mack ");
        engine.add("350 Cummins");
        engine.add("DD 15");
        engine.add("1693 Cat");
        engine.add("60 Series Detroit");
        engine.add("C15 Cat");

        return engine;
    }

    public ArrayList<String> getEngine() {
        return engine;
    }

    public void setEngineChoice(int engineChoice) {
        this.engineChoice = engine.get(engineChoice - 1);
    }

    public String getEngineChoice() {
        return engineChoice;
    }
}
