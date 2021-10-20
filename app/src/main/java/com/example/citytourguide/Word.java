package com.example.citytourguide;

public class Word {

    private String mcityName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String CityName)
    {
        mcityName=CityName;
    }

    public Word(String CityName, int imageResourceId)
    {
        mcityName=CityName;
        mImageResourceId=imageResourceId;
    }


    public String getCityName() {
        return mcityName;
    }

    public int getmImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
