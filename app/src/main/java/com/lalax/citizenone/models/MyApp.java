package com.lalax.citizenone.models;

import android.app.Application;

/**
 * Created by Eric on 3/28/2018.
 */

public class MyApp extends Application {

    private String myScore = "Current score";

    public String getScore(){
        return myScore;
    }

    public void setScore(String s){
        myScore = s;
    }
}
