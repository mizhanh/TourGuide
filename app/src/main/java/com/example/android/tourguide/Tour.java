package com.example.android.tourguide;

public class Tour {

    private String mTourName;
    private String mTourBriefDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Tour(String vTourName, String vTourBriefDescription) {
        mTourName = vTourName;
        mTourBriefDescription = vTourBriefDescription;
    }

    public Tour(String vTourName, String vTourBriefDescription, int vImageResourceId) {
        mTourName = vTourName;
        mTourBriefDescription = vTourBriefDescription;
        mImageResourceId = vImageResourceId;

    }

    public String getTourName(){
        return mTourName;
    }

    public String getTourBriefDescription(){
        return mTourBriefDescription;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}


