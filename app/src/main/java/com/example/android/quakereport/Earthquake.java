package com.example.android.quakereport;

public class Earthquake {
    private final String mDate;
    private final String mMagnitude;
    private final String mLocation;
    private final String mTime;
    private final String uri;


    public Earthquake(String mDate, String mMagnitude, String mLocation, String mTime, String uri) {
        this.mDate = mDate;
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTime = mTime;
        this.uri = uri;
    }


    public String getmDate() {
        return mDate;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getUri() {
        return uri;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTime() {
        return mTime;
    }
}
