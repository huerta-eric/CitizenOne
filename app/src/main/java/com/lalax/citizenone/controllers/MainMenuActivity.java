package com.lalax.citizenone.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import citizenone.lalax.com.citizenone.R;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Created the button which will open QuestionnaireActivity
        Button questionnaireBtn = (Button) findViewById(R.id.questionnaireBtn);

        //Created the button which will open ProgressActivity. Haven't created activity yet
        Button progressBtn = (Button) findViewById(R.id.progressBtn);

        //Created the button which will open DifficultyActivity. Haven't created activity yet
        Button difficultyBtn = (Button) findViewById(R.id.difficultyBtn);


        //Method launched when questionnaireBtn is clicked
        questionnaireBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), QuestionnaireActivity.class);
                startActivity(startIntent);
            }
        });

    }


}
