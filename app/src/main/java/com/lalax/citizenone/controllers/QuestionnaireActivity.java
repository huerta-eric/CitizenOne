package com.lalax.citizenone.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lalax.citizenone.models.Problem;
import com.lalax.citizenone.models.ProblemCreator;
import com.lalax.citizenone.models.ProblemSelector;

import citizenone.lalax.com.citizenone.R;

public class QuestionnaireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

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

                //Object created which will return randomly ordered questions from 1-100
                ProblemSelector problemNumber = new ProblemSelector();
                int randomProblemNumber = problemNumber.getRandomProblemNumber();

                //Creating Object in charge of accessing the database with questions
                ProblemCreator problemTest = new ProblemCreator(randomProblemNumber);

                //Object storing problem
                Problem userProblem = ProblemCreator.getTestProblem();

                //Question is sent to the questionTextView
                questionTextView.setText(userProblem.getQuestion());
                //Option A is sent to the optionATextView
                optionATextView.setText(userProblem.getCorrectAnswer());
                //Option B is sent to the optionBTextView
                optionBTextView.setText(userProblem.getIncorrectAnswer());


                //String randomNumberOutput = Arrays.toString(problemSelectorList.toArray());
                randomNumberMethodTestTextView.setText("" + randomProblemNumber);
            }
        });
    }
}
