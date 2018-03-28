package com.lalax.citizenone.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
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
    private Button dOptionButton;
    private Button nextQuestionButton;

    private ProgressBar progressBar;

    private int answeredCorrectly = 0;
    private int currentQuestion = 0;

    private Problem userProblem;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);




        // Created the text box where the score will be displayed
        scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        // Created progress bar that will fill up as the user goes through the 100 questions
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        // Created the text box where the question will be displayed
        questionTextView = (TextView) findViewById(R.id.questionTextView);

        // Created the buttons which will change text upon clicking of the nextQuestionBtn
        aOptionButton = (Button) findViewById(R.id.aOptionButton);
        bOptionButton = (Button) findViewById(R.id.bOptionButton);
        cOptionButton = (Button) findViewById(R.id.cOptionButton);
        dOptionButton = (Button) findViewById(R.id.dOptionButton);
        nextQuestionButton = (Button) findViewById(R.id.nextQuestionButton);
        //finishedButton = (Button) findViewById(R.id.finishedButton);

        updateQuestion();

        aOptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    /* If button A is clicked a pop-up stating whether the
                    *  "correct" or "wrong" answer is clicked will appear.
                    *  The user's score will be updated.*/
                if (aOptionButton.getText() == userProblem.getCorrectAnswer()) {
                    Toast.makeText(QuestionnaireActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    aOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                    answeredCorrectly = answeredCorrectly + 1;
                    updateScore(answeredCorrectly);

                    /* This method is triggered once the user has selected an answer. Buttons
                    * are enabled in the updateQuestion method
                    * once the nextQuestionButton is pressed.*/
                    enableAndDisableButtons();

                } else {
                   Toast.makeText(QuestionnaireActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    aOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                    updateScore(answeredCorrectly);

                    enableAndDisableButtons();
                }

            }
        });

        bOptionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    /* If button B is clicked a pop-up stating whether the
                    *  "correct" or "wrong" answer is clicked will appear.
                    *  The user's score will be updated.*/
                if (bOptionButton.getText() == userProblem.getCorrectAnswer()) {
                    Toast.makeText(QuestionnaireActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    bOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                    answeredCorrectly = answeredCorrectly + 1;
                    updateScore(answeredCorrectly);

                    enableAndDisableButtons();

                } else {
                    Toast.makeText(QuestionnaireActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    bOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                    updateScore(answeredCorrectly);

                    enableAndDisableButtons();
                }
            }
                      });

        cOptionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    /* If button C is clicked a pop-up stating whether the
                     *  "correct" or "wrong" answer is clicked will appear.
                     *  The user's score will be updated.*/
                if (cOptionButton.getText() == userProblem.getCorrectAnswer()) {
                    Toast.makeText(QuestionnaireActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    cOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                    answeredCorrectly = answeredCorrectly + 1;
                    updateScore(answeredCorrectly);

                    enableAndDisableButtons();

                } else {
                    Toast.makeText(QuestionnaireActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    cOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                    updateScore(answeredCorrectly);

                    enableAndDisableButtons();
                }
                    }
        });

        dOptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    /* If button D is clicked a pop-up stating whether the
                     *  "correct" or "wrong" answer is clicked will appear.
                     *  The user's score will be updated.*/
                if (dOptionButton.getText() == userProblem.getCorrectAnswer()) {
                    Toast.makeText(QuestionnaireActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    dOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                    answeredCorrectly = answeredCorrectly + 1;
                    updateScore(answeredCorrectly);

                    enableAndDisableButtons();

                } else {
                    Toast.makeText(QuestionnaireActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    dOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                    updateScore(answeredCorrectly);

                    enableAndDisableButtons();
                }
            }
        });

        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                updateQuestion();
            }
        });



            }

    private void updateQuestion(){

                /* Created object which will return randomly ordered questions from 1-100 using a
                 list from the ProblemSelector Class. This object will be created on click and
                 destroyed after nextQuestionBtn is clicked again*/
        ProblemSelector problemNumber = new ProblemSelector();
        int randomProblemNumber = problemNumber.getRandomProblemNumber();
//-------------------------------------------------------------------------------------------------
        /* Set button's background to purple. I did this to revert the color back to purple
                * because it's set to either green or red whenever the user selects an option in
                * the previous problem*/
        aOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
        bOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
        cOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
        dOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
//-------------------------------------------------------------------------------------------------
       // disables button used to go to the next question
        nextQuestionButton.setEnabled(false);
//-------------------------------------------------------------------------------------------------
        //Re-enable buttons
        aOptionButton.setEnabled(true);
        bOptionButton.setEnabled(true);
        cOptionButton.setEnabled(true);
        dOptionButton.setEnabled(true);
//-------------------------------------------------------------------------------------------------
                /*COME BACK AND SEE WHY NEED THIS OBJECT Created Object in charge of accessing
                * the database with questions*/
        ProblemCreator problemTest = new ProblemCreator(randomProblemNumber);
//-------------------------------------------------------------------------------------------------
        //Created object storing problem
        userProblem = ProblemCreator.getProblem();
//-------------------------------------------------------------------------------------------------
        //Question is sent to the questionTextView
        questionTextView.setText(userProblem.getQuestion());
//-------------------------------------------------------------------------------------------------
                /*A list is created and assigned the strings from the userProblem object. These
                * strings are in order*/
        List<String> orderedOptionsList =
                Arrays.asList(userProblem.getCorrectAnswer(),
                        userProblem.getIncorrectAnswerOne(),
                        userProblem.getIncorrectAnswerTwo(),
                        userProblem.getIncorrectAnswerThree());

                /*The orderedOptionsList list is sent to the randomOrderedList method.
                 * A list with the strings in random order is returned and assigned to randomList */
        List<String> randomList = new ArrayList<String>(randomOrderedList(orderedOptionsList));

        // Each button's text is assigned a string from the randomList list
        aOptionButton.setText(randomList.get(0));
        bOptionButton.setText(randomList.get(1));
        cOptionButton.setText(randomList.get(2));
        dOptionButton.setText(randomList.get(3));

    }

    private List<String> randomOrderedList(List<String> primeList){

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
        currentQuestion = currentQuestion + 1;
        progressBar.setProgress(currentQuestion);
        scoreTextView.setText("" + answeredCorrectly + " / " + currentQuestion);

    }

    /* This method turns off all option buttons and turns on the button to go to the next question*/
    private void enableAndDisableButtons(){
        nextQuestionButton.setEnabled(true);

        aOptionButton.setEnabled(false);
        bOptionButton.setEnabled(false);
        cOptionButton.setEnabled(false);
        dOptionButton.setEnabled(false);
    }



    }

