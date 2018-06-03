package com.example.android.tourguide;

public class Tour {

    private int mTourName;
    private int mTourBriefDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Tour(int vTourName, int vTourBriefDescription) {
        mTourName = vTourName;
        mTourBriefDescription = vTourBriefDescription;
    }

    public Tour(int vTourName, int vTourBriefDescription, int vImageResourceId) {
        mTourName = vTourName;
        mTourBriefDescription = vTourBriefDescription;
        mImageResourceId = vImageResourceId;

    }

    public int getTourname(){
        return mTourName;
    }

    public int getTourBriefDescription(){
        return mTourBriefDescription;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}


