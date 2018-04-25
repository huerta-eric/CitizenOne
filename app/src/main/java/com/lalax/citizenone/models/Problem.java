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

    //Questions argument is passed from ProblemDatabase method. Other arguments need to be
    //passed through the constructor
    Problem(String q, String corrAns, String incorrectOne, String incorrectTwo, String incorrectThree){
        question = q;
        correctAnswer = " " + corrAns  + " ";
        incorrectAnswerOne = " " + incorrectOne + " ";
        incorrectAnswerTwo = " " + incorrectTwo + " ";
        incorrectAnswerThree = " " + incorrectThree + " ";
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
