package com.lalax.citizenone.models;

/**
 * Created by Eric on 3/2/2018.
 */

public class ProblemCreator {


    private static Problem userProblem;

    //Static counter which will pass a different int to the ProblemDatabase every time a ProblemCreator object is instantiated
    private static int problemCount = 0;





    public ProblemCreator(int randomNumber){   // Had to add public to my constructor so QuestionnaireActivity could access it



        problemCount = ++problemCount;

        //Object created to initialize problems
        ProblemDatabase firstObject = new ProblemDatabase(randomNumber);
        //Problem from ProblemDatabase stored here
        userProblem = firstObject.getTestProblem();
    }

    //method accessed by the QuestionnaireActivity to retrieve problem Object
    public static Problem getTestProblem(){

        return userProblem;
    }

}
