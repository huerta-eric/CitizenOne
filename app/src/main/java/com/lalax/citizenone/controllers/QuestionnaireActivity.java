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
    private Button aOptionButton;
    private Button bOptionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        /*Created the button which will trigger the creation of the next question being displayed
          in the TextView*/
        Button nextQuestionBtn = (Button) findViewById(R.id.nextQuestionBtn);


        //Method launched when nextQuestionBtn is clicked
        nextQuestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Created the text box where the question will be displayed
                TextView questionTextView = (TextView) findViewById(R.id.questionTextView);
//-------------------------------------------------------------------------------------------------
                //Created the buttons which will change text upon clicking of the nextQuestionBtn
                aOptionButton = (Button) findViewById(R.id.aOptionButton);
                bOptionButton = (Button) findViewById(R.id.bOptionButton);
//-------------------------------------------------------------------------------------------------
                /* Created object which will return randomly ordered questions from 1-100 using a
                 list from the ProblemSelector Class*/
                ProblemSelector problemNumber = new ProblemSelector();
                int randomProblemNumber = problemNumber.getRandomProblemNumber();
//-------------------------------------------------------------------------------------------------
                //Created Object in charge of accessing the database with questions
                ProblemCreator problemTest = new ProblemCreator(randomProblemNumber);
//-------------------------------------------------------------------------------------------------
                //Created object storing problem
                Problem userProblem = ProblemCreator.getTestProblem();
//-------------------------------------------------------------------------------------------------
                //Question is sent to the questionTextView
                questionTextView.setText(userProblem.getQuestion());
                // Button text is changed
                aOptionButton.setText(" A. " + userProblem.getCorrectAnswer() + " ");
                bOptionButton.setText(" B. " + userProblem.getIncorrectAnswer() + " ");



            }
        });
    }
}
