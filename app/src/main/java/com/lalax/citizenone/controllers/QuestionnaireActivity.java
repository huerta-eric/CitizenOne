package com.lalax.citizenone.controllers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lalax.citizenone.models.Problem;
import com.lalax.citizenone.models.ProblemCreator;
import com.lalax.citizenone.models.ProblemSelector;

import java.util.Random;

import citizenone.lalax.com.citizenone.R;
//
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


        // Method launched when nextQuestionBtn is clicked
        nextQuestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Created the text box where the question will be displayed
                TextView questionTextView = (TextView) findViewById(R.id.questionTextView);
//-------------------------------------------------------------------------------------------------
                // Created the buttons which will change text upon clicking of the nextQuestionBtn
                aOptionButton = (Button) findViewById(R.id.aOptionButton);
                /* Set button's background to purple. I did this to revert the color back to purple
                * because it's set to either green or red whenever the user selects an option in
                * the previous problem*/
                aOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));

                bOptionButton = (Button) findViewById(R.id.bOptionButton);
                // Set button's background to purple
                bOptionButton.setBackgroundColor(getResources().getColor(R.color.purplish));
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
//-------------------------------------------------------------------------------------------------
                /* Random integer of value 0 or 1 created. If value is 0 then option A button is set
                 * incorrect answer and option B button is set to correct answer. If value is 1 then
                  * option A button is set to the correct answer ad option B button is set to the
                   * incorrect answer*/

                Random random = new Random();
                int  randomNum = random.nextInt(2);
                if(randomNum == 0){
                    aOptionButton.setText(" A. " + userProblem.getIncorrectAnswer() + " ");
                    bOptionButton.setText(" B. " + userProblem.getCorrectAnswer() + " ");

                    aOptionButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            /* If button A is clicked the button's background will be changed to red
                            * which indicates the wrong answer was chosen*/
                            aOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                        }
                    });

                    bOptionButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            /* If button B is clicked the button's background will be changed to
                             * green which indicates the right answer was chosen*/
                            bOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                        }
                    });
                }
                else{
                    aOptionButton.setText(" A. " + userProblem.getCorrectAnswer() + " ");
                    bOptionButton.setText(" B. " + userProblem.getIncorrectAnswer() + " ");

                    aOptionButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            /* If button A is clicked the button's background will be changed to
                             * green which indicates the right answer was chosen*/
                            aOptionButton.setBackgroundColor(getResources().getColor(R.color.green));
                        }
                    });

                    bOptionButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            /* If button B is clicked the button's background will be changed to red
                            * which indicates the wrong answer was chosen*/
                            bOptionButton.setBackgroundColor(getResources().getColor(R.color.red));
                        }
                    });


                }




            }
        });
    }
}
