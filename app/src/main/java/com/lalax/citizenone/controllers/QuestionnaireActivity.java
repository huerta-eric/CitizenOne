package com.lalax.citizenone.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.lalax.citizenone.models.Problem;
import com.lalax.citizenone.models.ProblemCreator;
import com.lalax.citizenone.models.ProblemSelector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import citizenone.lalax.com.citizenone.R;

public class QuestionnaireActivity extends AppCompatActivity {

    private TextView scoreTextView;
    private TextView questionTextView;
    private Button aOptionButton;
    private Button bOptionButton;
    private Button cOptionButton;

    private int answeredCorrectly = 0;
    private int currentQuestion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        // Created the text box where the score will be displayed
        scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        // Created the text box where the question will be displayed
        questionTextView = (TextView) findViewById(R.id.questionTextView);

        // Created the buttons which will change text upon clicking of the nextQuestionBtn
        aOptionButton = (Button) findViewById(R.id.aOptionButton);
        bOptionButton = (Button) findViewById(R.id.bOptionButton);
        cOptionButton = (Button) findViewById(R.id.cOptionButton);

        /*Created the button which will trigger the creation of the next question being displayed
          in the TextView*/
        Button nextQuestionBtn = (Button) findViewById(R.id.nextQuestionBtn);

        // Method launched when nextQuestionBtn is clicked
        nextQuestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* Set button's background to purple. I did this to revert the color back to purple
                * because it's set to either green or red whenever the user selects an option in
                * the previous problem*/
                aOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
                bOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
                cOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
//-------------------------------------------------------------------------------------------------
                /* Created object which will return randomly ordered questions from 1-100 using a
                 list from the ProblemSelector Class. This object will be created on click and
                 destroyed after nextQuestionBtn is clicked again*/
                ProblemSelector problemNumber = new ProblemSelector();
                int randomProblemNumber = problemNumber.getRandomProblemNumber();
//-------------------------------------------------------------------------------------------------
                /*COME BACK AND SEE WHY NEED THIS OBJECT Created Object in charge of accessing
                * the database with questions*/
                ProblemCreator problemTest = new ProblemCreator(randomProblemNumber);
//-------------------------------------------------------------------------------------------------
                //Created object storing problem
                final Problem userProblem = ProblemCreator.getTestProblem();
//-------------------------------------------------------------------------------------------------
                //Question is sent to the questionTextView
                questionTextView.setText(userProblem.getQuestion());
//-------------------------------------------------------------------------------------------------
                /*A list is created and assigned the strings from the userProblem object. These
                * strings are in order*/
                List<String> optionsListOne =
                        Arrays.asList(userProblem.getCorrectAnswer(),
                                userProblem.getIncorrectAnswerOne(),
                                userProblem.getIncorrectAnswerTwo());

                /*The ordered optionsListOne list is sent to the assignButtonText method.
                 * A list with the strings in random order is returned and assigned to randomList */
                List<String> randomList = new ArrayList<String>(assignButtonText(optionsListOne));

                // Each button's text is assigned a string from the randomList list
                aOptionButton.setText(randomList.get(0));
                bOptionButton.setText(randomList.get(1));
                cOptionButton.setText(randomList.get(2));


                aOptionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            /* If button A is clicked the button's background will change to either
                            *red, for incorrect, or green, for correct. A pop-up stating whether the
                             *  "correct" or "wrong" answer is clicked will appear.
                             *  The user's score will be updated.*/
                        if (aOptionButton.getText() == userProblem.getCorrectAnswer()) {
                            aOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                            Toast.makeText(QuestionnaireActivity.this, "correct", Toast.LENGTH_SHORT).show();

                            answeredCorrectly = answeredCorrectly + 1;
                            currentQuestion = currentQuestion + 1;
                            updateScore(answeredCorrectly);
                        } else {
                            aOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                            Toast.makeText(QuestionnaireActivity.this, "wrong", Toast.LENGTH_SHORT).show();

                            currentQuestion = currentQuestion + 1;
                            updateScore(answeredCorrectly);
                        }

                    }
                });

                bOptionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            /* If button B is clicked the button's background will change to either
                            *red, for incorrect, or green, for correct. A pop-up stating whether the
                             *  "correct" or "wrong" answer is clicked will appear.
                             *  The user's score will be updated.*/
                        if (bOptionButton.getText() == userProblem.getCorrectAnswer()) {
                            bOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                            Toast.makeText(QuestionnaireActivity.this, "correct", Toast.LENGTH_SHORT).show();

                            answeredCorrectly = answeredCorrectly + 1;
                            currentQuestion = currentQuestion + 1;
                            updateScore(answeredCorrectly);
                        } else {
                            bOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                            Toast.makeText(QuestionnaireActivity.this, "wrong", Toast.LENGTH_SHORT).show();

                            currentQuestion = currentQuestion + 1;
                            updateScore(answeredCorrectly);
                        }
                    }
                });

                cOptionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            /* If button C is clicked the button's background will change to either
                            *red, for incorrect, or green, for correct. A pop-up stating whether the
                             *  "correct" or "wrong" answer is clicked will appear.
                             *  The user's score will be updated.*/
                        if (cOptionButton.getText() == userProblem.getCorrectAnswer()) {
                            cOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                            Toast.makeText(QuestionnaireActivity.this, "correct", Toast.LENGTH_SHORT).show();

                            answeredCorrectly = answeredCorrectly + 1;
                            currentQuestion = currentQuestion + 1;
                            updateScore(answeredCorrectly);
                        } else {
                            cOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                            Toast.makeText(QuestionnaireActivity.this, "wrong", Toast.LENGTH_SHORT).show();

                            currentQuestion = currentQuestion + 1;
                            updateScore(answeredCorrectly);
                        }
                    }
                });

            }
        });

    }

    public List<String> assignButtonText(List<String> primeList){

        int listSize = primeList.size();

        // Modifiable list with all elements from primeList added
        List<String> betaTextList = new ArrayList<String>(primeList);
        List<String> returnTextList = new ArrayList<String>();

        for(int i = 0; i < listSize; i++) {

            Random randomNumber = new Random();
            int randNum = randomNumber.nextInt(betaTextList.size());

            returnTextList.add(betaTextList.get(randNum));
            betaTextList.remove(randNum);
        }

        return returnTextList;
    }

    private void updateScore(int point){
        scoreTextView.setText("" + answeredCorrectly + " / " + currentQuestion);
    }

    }

