package com.example.android.tourguide;

/**
 * {@link Location} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Location {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource ID for the name of the place
     */
    private int mName;
    /**
     * String resource ID for the Description of the place
     */
    private int mDescription;
    /**
     * String resource ID for the Schedule of the place
     */
    private int mTime;
    /**
     * String resource ID for the Google map Location of the place
     */
    private String mCoordinates;
    /**
     * String resource ID for the Rating of the place
     */
    private int mRate;
    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /**
     * Create a new Location object.
     *
     * @param name            is the string resource ID for the name of the place
     * @param description     is the string resource Id for the description of the place
     * @param imageResourceId is the resource ID for the image file associated with this place
     * @param coordinates     is the resource ID for the location of the place
     * @param rate            is the resource ID for the rating of the place
     */
    public Location(int name, int description, int imageResourceId, int time, int rate, String coordinates) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
        mTime = time;
        mCoordinates = coordinates;
        mRate = rate;
    }


    /**
     * Create a new Location object without contact.
     *
     * @param name            is the string resource ID for the name of the place
     * @param description     is the string resource Id for the description of the place
     * @param imageResourceId is the resource ID for the image file associated with this place
     * @param rate            is the resource ID for the rating of the place
     */
    public Location(int name, int description, int imageResourceId, int time, int rate) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
        mTime = time;
        mRate = rate;
    }


    /**
     * Get the string resource ID for the name of the Location.
     */
    public int getNameId() {
        return mName;
    }

    /**
     * Get the string resource ID for the Description of the place.
     */
    public int getDescriptionId() {
        return mDescription;
    }

    /**
     * Return the image resource ID of the Location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the string resource ID for the Schedule of the place.
     */
    public int getTimeId() {
        return mTime;
    }

    /**
     * Get the string resource ID for the Location co-ordinates of the place.
     */
    public String getcoordinatesId() {
        return mCoordinates;
    }

    /**
     * Get the string resource ID for the Contact of the place.
     */
    public int getRateId() {
        return mRate;
    }
}