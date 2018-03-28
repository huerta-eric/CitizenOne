package com.lalax.citizenone.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import citizenone.lalax.com.citizenone.R;

public class DifficultyActivity extends AppCompatActivity {

    private TextView difficultyScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        // Created the text box where the score will be displayed
        difficultyScoreTextView = (TextView) findViewById(R.id.difficultyScoreTextView);



       difficultyScoreTextView.setText("");
    }
}
