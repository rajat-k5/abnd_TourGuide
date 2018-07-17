package com.example.android.tourguide;

public class Item {

    // City Name
    private String mCityName;

    // Drawable resource ID
    private int mImageResourceId;


    /*
     * Create a new Item object.
     *
     * @param vName is the name of the City (e.g. Jaipur)
     * @param image is drawable reference ID that corresponds tothe city
     * */
    public Item(String vName, int imageResourceId) {
        mCityName = vName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Song
     */
    public String getCityName() {
        return mCityName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
