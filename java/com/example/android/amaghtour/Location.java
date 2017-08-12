package com.example.android.amaghtour;

public class Location {
    /**
     * String resource ID for the name of the location
     */
    private String mText1;
    /**
     * String resource ID for the preview of the location which includes the functions and address
     */
    private String mText2;
    /**
     * Image resource ID for the location
     */
    private int mImage1;

    public Location(String title, String description, int image1) {
        mText1 = title;
        mText2 = description;
        mImage1 = image1;
    }

    /**
     * Get the string resource ID for the default translation of the location.
     */
    public String getText1() {
        return mText1;
    }

    /**
     * Get the string resource ID for  location.
     */
    public String getText2() {
        return mText2;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImage1() {
        return mImage1;
    }

}