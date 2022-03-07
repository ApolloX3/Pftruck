/*
allows access to the list of styles available to the user
*/
package com.company;

import java.util.ArrayList;

public class Style {
    //declares private fields
    private String yourStyleChoice;
    private ArrayList<String> styleList;

    Style() {
        // constructor sets the arraylist style list to the value of build style list method, maybe didn't need separate method for this...
        styleList = buildStyleList();
    }

    //creates style list
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

    // Overides to string functionality in java.Lang to print the object to a String
    @Override
    public String toString() {
        return yourStyleChoice;
    }
}
