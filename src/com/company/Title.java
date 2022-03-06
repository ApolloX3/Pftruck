package com.company;

public class Title {


    private String strTitle, strTagline;

    public Title(String title, String tagline) {
        this.strTitle = title;
        this.strTagline = tagline;
    }

    public void printTitle() {
        System.out.println(strTitle + "\n" + "\t" + strTagline);
    }
}
