package com.lalax.citizenone.models;

/**
 * Created by Eric on 3/2/2018.
 */

public class Problem {
    private String question;
    private String correctAnswer;
    private String incorrectAnswer;

    //Questions attribute is passed from ProblemDatabase method. Other attributes need to be
    //passed through the constructor
    Problem(String ques, String corrAns, String incoAns){
        question = ques;
        correctAnswer = corrAns;
        incorrectAnswer = incoAns;
    }

    //question is fetched by ProblemDatabase
    public String getQuestion() {

        return question;
    }

    public String getCorrectAnswer() {

        return correctAnswer;
    }

    public String getIncorrectAnswer() {

        return incorrectAnswer;
    }



}
