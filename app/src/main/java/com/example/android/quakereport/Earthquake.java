package com.example.android.quakereport;

public class Earthquake {
    private final String mDate;
    private final String mMagnitude;
    private final String mLocation;
    private final String mTime;



    public Earthquake(String mDate, String mMagnitude, String mLocation,String mTime) {
        this.mDate = mDate;
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTime = mTime;
    }


    public String getmDate() {
        return mDate;
    }
    public String getmMagnitude() {
        return mMagnitude;
    }


    public String getmLocation() {
        return mLocation;
    }

    public String getmTime() {
        return mTime;
    }
}
