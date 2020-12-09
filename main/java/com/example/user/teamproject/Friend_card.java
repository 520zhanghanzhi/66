package com.example.user.teamproject;

import android.widget.ImageView;

public class Friend_card {
    private String mUsername;
    private String mUUINFO;
    private String mTime;

    public Friend_card(String username, String UUINFO, String time) {
        mUsername = username;
        mUUINFO = UUINFO;
        mTime = time;;
    }

    public String getUsername(){
        return mUsername;
    }

    public String getUUINFO(){
        return mUUINFO;
    }

    public String getTime(){
        return mTime;
    }
}
