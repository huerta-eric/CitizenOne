package com.lalax.citizenone.controllers;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lalax.citizenone.models.DatabaseHelper;
import com.lalax.citizenone.models.MyApp;

import citizenone.lalax.com.citizenone.R;

public class ProgressActivity extends AppCompatActivity {

    private TextView progressScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        // Created the text box where the score will be displayed
        progressScoreTextView = (TextView) findViewById(R.id.progress_score_text_view);

        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("sid", 2);
        values.put("sname", "Vivike");
        values.put("marks", "89");

        long row = db.insert("lalax", null, values);


        MyApp appState = ((MyApp)getApplicationContext());
        String state = appState.getScore();


        progressScoreTextView.setText("row number is" + row);

    }


}
