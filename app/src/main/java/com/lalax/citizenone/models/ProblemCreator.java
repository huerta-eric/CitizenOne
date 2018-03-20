package com.lalax.citizenone.models;

/**
 * Created by Eric on 3/2/2018.
 */

public class ProblemCreator {

    private static Problem userProblem;

    public ProblemCreator(int randomNumber){

        //Object created to initialize problems
        ProblemDatabase firstObject = new ProblemDatabase(randomNumber);
        //Problem from ProblemDatabase stored here
        userProblem = firstObject.getProblem();
    }

    //method accessed by the QuestionnaireActivity to retrieve problem Object
    public static Problem getProblem(){

        return userProblem;
    }

}
