package com.lalax.citizenone.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * The purpose of this class is to create a list with 100 problem numbers. When this class is called
 * a random problem number will be removed from the list and returned to the QuestionnaireActivity.
 * The list will shrink until all problem numbers have been used.
 */

public class ProblemSelector {
    private int randomProblemNumber;

    // Initial immutable numbers list
    static List<Integer> numbersList =
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,
                    10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                    20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                    30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
                    40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                    50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
                    60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
                    70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                    80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
                    90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);

    // Modifiable static list with all elements from numbersList added
    static List<Integer> problemNumbersList = new ArrayList<Integer>(numbersList);

    /* This method returns the random problem number pulled from the problemNumbersList and deletes
     * the element that was pulled from problemNumbersList */
    public int getRandomProblemNumber(){

        Random random = new Random();
        int  randomNum = random.nextInt(problemNumbersList.size());
        randomProblemNumber = problemNumbersList.get(randomNum);
        problemNumbersList.remove(randomNum);

        return randomProblemNumber;
    }


}
