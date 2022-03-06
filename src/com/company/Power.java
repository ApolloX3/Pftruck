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
        engine.add("300 HP Mack Engine");
        engine.add("350 Cummins Engine");
        engine.add("DD 15 Engine");
        engine.add("1693 Cat Engine");
        engine.add("60 Series Detroit Engine");
        engine.add("C15 Cat Engine");

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
