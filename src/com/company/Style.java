package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Style {

    private String yourStyleChoice;
    private ArrayList<String> styleList;

    Style() {
        styleList = buildStyleList();
    }
    public ArrayList<String> buildStyleList() {
        ArrayList<String> styleList = new ArrayList<String>();
        styleList.add("Long Flat Nose ");
        styleList.add("Slant Nose");

        return styleList;
    }
    public String getYourStyleChoice() {
        return yourStyleChoice;
    }
    public void setYourStyle(int styleChoice) {
        this.yourStyleChoice = styleList.get(styleChoice - 1);
    }
    public ArrayList<String> getStyleList() {
        return styleList;
    }
}
