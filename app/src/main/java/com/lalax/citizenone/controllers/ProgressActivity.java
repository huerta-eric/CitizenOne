package com.lalax.citizenone.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lalax.citizenone.models.MyApp;

import citizenone.lalax.com.citizenone.R;

public class ProgressActivity extends AppCompatActivity {

    private TextView progressScoreTextView;
    private String progressScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        // Created the text box where the score will be displayed
        progressScoreTextView = (TextView) findViewById(R.id.progressScoreTextView);

        MyApp appState = ((MyApp)getApplicationContext());
        String state = appState.getScore();


        progressScoreTextView.setText(state);

    }


}
