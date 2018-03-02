package com.lalax.citizenone.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lalax.citizenone.models.Problem;
import com.lalax.citizenone.models.ProblemCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import citizenone.lalax.com.citizenone.R;

// Importing Package models so classes are accessible
//Not sure what the .R is accessing?

public class MainMenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Created the button which would trigger the question being displayed in the TextView
        Button problemTestButton = (Button) findViewById(R.id.problemTestButton);



        //Method launched when problemTestButton is clicked
        problemTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //This is where the question will be displayed
                TextView questionTextView = (TextView) findViewById(R.id.questionTextView);
                //Where option A is displayed
                TextView optionATextView = (TextView) findViewById(R.id.optionATextView);
                //Where option B is displayed
                TextView optionBTextView = (TextView) findViewById(R.id.optionBTextView);

                //Where randomNumberMethodTestTextView is displayed
                TextView randomNumberMethodTestTextView = (TextView) findViewById(R.id.randomNumberMethodTestTextView);

                //Need to create a way to ask randomly ordered questions. And randomly ordered answers
                Random rand = new Random();
                int  randomNumber = rand.nextInt(100) + 1;

                //Creating Object in charge of accessing the database with questions
                ProblemCreator problemTest = new ProblemCreator(randomNumber);

                //Object storing problem
                Problem userProblem = ProblemCreator.getTestProblem();

                //Question is sent to the questionTextView
                questionTextView.setText(userProblem.getQuestion());
                //Option A is sent to the optionATextView
                optionATextView.setText(userProblem.getCorrectAnswer());
                //Option B is sent to the optionBTextView
                optionBTextView.setText(userProblem.getIncorrectAnswer());

                int randomNumberMethodTest = RandomNumberMethod();
                //Can't output integer to TextView
                String randomNumberOutput = Integer.toString(randomNumberMethodTest);
                randomNumberMethodTestTextView.setText(randomNumberOutput);

                int testInteger = 1;


            }
        });


    }

    public int RandomNumberMethod(){

        List<Integer> problemNumber2Array =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,
                        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                        20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                        30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
                        40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                        50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
                        60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
                        70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                        80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
                        90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);

        List<Integer> myList = new ArrayList<Integer>();
        myList.addAll(problemNumber2Array);
        int randomNumberWithinListRange;
        int count = 0;


        Random randTwo = new Random();
        int  randomNumberTwo = randTwo.nextInt(myList.size());


        randomNumberWithinListRange = myList.get(randomNumberTwo);



        return randomNumberWithinListRange;
    }



}
