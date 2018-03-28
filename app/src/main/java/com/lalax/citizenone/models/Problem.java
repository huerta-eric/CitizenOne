package com.lalax.citizenone.models;

/**
 * Created by Eric on 3/2/2018.
 */

public class Problem {
    private String question;
    private String correctAnswer;
    private String incorrectAnswerOne;
    private String incorrectAnswerTwo;
    private String incorrectAnswerThree;

    //Questions attribute is passed from ProblemDatabase method. Other attributes need to be
    //passed through the constructor
    Problem(String ques, String corrAns, String incoAnsOne, String incoAnsTwo, String incoAnsThree){
        question = ques;
        correctAnswer = " " + corrAns  + " ";
        incorrectAnswerOne = " " + incoAnsOne + " ";
        incorrectAnswerTwo = " " + incoAnsTwo + " ";
        incorrectAnswerThree = " " + incoAnsThree + " ";
    }

    //question is fetched by ProblemDatabase
    public String getQuestion() {

        return question;
    }

    public String getCorrectAnswer() {

        return correctAnswer;
    }

    public String getIncorrectAnswerOne() {

        return incorrectAnswerOne;
    }

    public String getIncorrectAnswerTwo() {

        return incorrectAnswerTwo;
    }

    public String getIncorrectAnswerThree() {

        return incorrectAnswerThree;
    }



}
