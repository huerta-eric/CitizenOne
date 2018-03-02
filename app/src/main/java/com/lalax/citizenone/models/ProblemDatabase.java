package com.lalax.citizenone.models;

/**
 * Created by Eric on 3/2/2018.
 */

public class ProblemDatabase {

    private int problemNumber;
    private static Problem userProblem;

    ProblemDatabase(int probNum) {
        problemNumber = probNum;

        //The problem which the user requested is saved in this object
        userProblem = createProblemUsingSwitch(problemNumber);
    }

    //method accessed by the ProbemCreator Class
    public static Problem getTestProblem(){

        return userProblem;
    }

    /*Depending on the integer value passed to the method a new Problem will be instantiated. This
     way the app only creates a problem questions when it's needed by the user instead of creating
     all objects at the start of the program*/
    public Problem createProblemUsingSwitch(int problemNumber) {

        switch (problemNumber) {

            case 1:
                /*First problem is created. Here all the values will be stored and will only be
                created if the case is met.*/
                Problem problemOne = new Problem("1. What is the supreme law of the land?",
                        "The Constitution", "The Bill of Rights");
                return problemOne;
            case 2:
                Problem problemTwo = new Problem("2. What does the Constitution do?",
                        "Defines the government", "Eliminates the government");
                return problemTwo;
            case 3:
                Problem problemThree = new Problem("3. The idea of self-government is in the " +
                        "first three words of the Constitution. What are these words?",
                        "We the People", "One nation under");
                return problemThree;
            case 4:
                Problem problemFour = new Problem("4. What is an amendment?", "A change",
                        "A challenge");
                return problemFour;
            case 5:
                Problem problemFive = new Problem("5. What do we call the first ten amendments" +
                        " to the Constitution?", "The Bill of Rights", "The Founding Amendments");
                return problemFive;
            case 6:
                Problem problemSix = new Problem("6. What is one right or freedom from the First" +
                        " Amendment?*", "Speech", "Right to Bear Arms");
                return problemSix;
            case 7:
                Problem problemSeven = new Problem("7. How many amendments does the " +
                        "Constitution have? ", "27", "24");
                return problemSeven;
            case 8:
                Problem problemEight = new Problem("8. What did the Declaration of Independence" +
                        " do? ", "Announced our independence from Great Britain",
                        "Announced our independence from France");
                return problemEight;
            case 9:
                Problem problemNine = new Problem("9. What are two rights in the Declaration of" +
                        " Independence?", "Liberty and the Pursuit of Happiness", "Life and Death");
                return problemNine;
            case 10:
                Problem problemTen = new Problem("10. What is freedom of religion?",
                        "You can practice any religion, or not practice a religion.",
                        "All religion is banned");
                return problemTen;
            case 11:
                Problem problemEleven = new Problem("11. What is the economic system in" +
                        " the United States?*", "capitalist economy", "communist system");
                return problemEleven;
            case 12:
                Problem problemTwelve = new Problem("12. What is the “rule of law”?",
                        "Everyone must follow the law", "");
                return problemTwelve;
            case 13:
                Problem problemThirteen = new Problem("13. Name one branch or part of the" +
                        " government.*", "Congress", "");
                return problemThirteen;
            case 14:
                Problem problemFourteen = new Problem("14. What stops one branch of government" +
                        " from becoming too powerful?", "checks and balances", "");
                return problemFourteen;
            case 15:
                Problem problemFifteen = new Problem("15. Who is in charge of the" +
                        " executive branch?", "the President", "");
                return problemFifteen;
            case 16:
                Problem problemSixteen = new Problem("16. Who makes federal laws?",
                        "Congress", "");
                return problemSixteen;
            case 17:
                Problem problemSeventeen = new Problem("17. What are the two parts of the" +
                        " U.S. Congress?*", "the Senate and House", "");
                return problemSeventeen;
            case 18:
                Problem problemEighteen = new Problem("18. How many U.S. Senators are there?",
                        "one hundred", "");
                return problemEighteen;
            case 19:
                Problem problemNineteen = new Problem("19. We elect a U.S. Senator for how" +
                        " many years?", "six", "");
                return problemNineteen;
            case 20:
                Problem problemTwenty = new Problem("20. Who is one of your state’s U.S." +
                        " Senators now?*", "Ted Cruz", "");
                return problemTwenty;
            case 21:
                Problem problemTwentyOne = new Problem("21. The House of Representatives has" +
                        " how many voting members?", "four hundred thirty-five", "");
                return problemTwentyOne;
            case 22:
                Problem problemTwentyTwo = new Problem("22. We elect a U.S. Representative for" +
                        " how many years?", "two", "");
                return problemTwentyTwo;
            case 23:
                Problem problemTwentyThree = new Problem("23. Name your U.S. Representative.",
                        "Congressman Pete Olson", "");
                return problemTwentyThree;
            case 24:
                Problem problemTwentyFour = new Problem("24. Who does a U.S. Senator represent?",
                        "all people of the state", "");
                return problemTwentyFour;
            case 25:
                Problem problemTwentyFive = new Problem("25. Why do some states have more" +
                        " Representatives than other states?", "Because of the state’s population",
                        "");
                return problemTwentyFive;
            case 26:
                Problem problemTwentySix = new Problem("26. We elect a President for how many" +
                        " years?", "four", "");
                return problemTwentySix;
            case 27:
                Problem problemTwentySeven = new Problem("27. In what month do we vote for" +
                        " President?*", "November", "");
                return problemTwentySeven;
            case 28:
                Problem problemTwentyEight = new Problem("28. What is the name of the President" +
                        " of the United States now?*", "Donald J. Trump", "");
                return problemTwentyEight;
            case 29:
                Problem problemTwentyNine = new Problem("29. What is the name of the" +
                        " Vice President of the United States now?", "Michael R. Pence", "");
                return problemTwentyNine;
            case 30:
                Problem problemThirty = new Problem("30. If the President can no longer serve," +
                        " who becomes President?", "the Vice President", "");
                return problemThirty;
            case 31:
                Problem problemThirtyOne = new Problem("31. If both the President and the" +
                        " Vice President can no longer serve, who becomes President?",
                        "the Speaker of the House", "");
                return problemThirtyOne;
            case 32:
                Problem problemThirtyTwo = new Problem("32. Who is the Commander in Chief of" +
                        " the military?", "the President", "");
                return problemThirtyTwo;
            case 33:
                Problem problemThirtyThree = new Problem("33. Who signs bills to become laws?",
                        "the President", "");
                return problemThirtyThree;
            case 34:
                Problem problemThirtyFour = new Problem("34. Who vetoes bills?",
                        "the President", "");
                return problemThirtyFour;
            case 35:
                Problem problemThirtyFive = new Problem("35. What does the President’s Cabinet do?",
                        "advises the President", "");
                return problemThirtyFive;
            case 36:
                Problem problemThirtySix = new Problem("36. What are two Cabinet-level positions?",
                        "Secretary of Agriculture and Secretary of Commerce", "");
                return problemThirtySix;
            case 37:
                Problem problemThirtySeven = new Problem("37. What does the judicial branch do?",
                        "reviews laws", "");
                return problemThirtySeven;
            case 38:
                Problem problemThirtyEight = new Problem("38. What is the highest court in" +
                        " the United States?", "the Supreme Court", "");
                return problemThirtyEight;
            case 39:
                Problem problemThirtyNine = new Problem("39. How many justices are on the" +
                        " Supreme Court?", "nine", "");
                return problemThirtyNine;
            case 40:
                Problem problemForty = new Problem("40. Who is the Chief Justice of the" +
                        " United States now?", "John Roberts", "");
                return problemForty;
            case 41:
                Problem problemFortyOne = new Problem("41. Under our Constitution, some powers" +
                        " belong to the federal government. What is one power of the federal" +
                        " government?", "to declare war", "");
                return problemFortyOne;
            case 42:
                Problem problemFortyTwo = new Problem("42. Under our Constitution, some powers" +
                        " belong to the states. What is one power of the states?",
                        "provide schooling and education", "");
                return problemFortyTwo;
            case 43:
                Problem problemFortyThree = new Problem("43. Who is the Governor of your state" +
                        " now?", "Greg Abbott", "");
                return problemFortyThree;
            case 44:
                Problem problemFortyFour = new Problem("44. What is the capital of your state?*",
                        "Austin", "");
                return problemFortyFour;
            case 45:
                Problem problemFortyFive = new Problem("45. What are the two major political" +
                        " parties in the United States?*", "Democratic and Republican", "");
                return problemFortyFive;
            case 46:
                Problem problemFortySix = new Problem("46. What is the political party of the" +
                        " President now?", "Republican", "");
                return problemFortySix;
            case 47:
                Problem problemFortySeven = new Problem("47. What is the name of the Speaker of" +
                        " the House of Representatives now?", "Paul D. Ryan", "");
                return problemFortySeven;
            case 48:
                Problem problemFortyEight = new Problem("48. There are four amendments to the" +
                        " Constitution about who can vote. Describe one of them.",
                        "Citizens eighteen and older can vote", "");
                return problemFortyEight;
            case 49:
                Problem problemFortyNine = new Problem("49. What is one responsibility that is" +
                        " only for United States citizens?*", "serve on a jury", "");
                return problemFortyNine;
            case 50:
                Problem problemFifty = new Problem("50. Name one right only for United States" +
                        " citizens.", "run for federal office", "");
                return problemFifty;
            case 51:
                Problem problemFiftyOne = new Problem("51. What are two rights of everyone living" +
                        " in the United States?", "freedom of speech and freedom of religion", "");
                return problemFiftyOne;
            case 52:
                Problem problemFiftyTwo = new Problem("52. What do we show loyalty to when we say" +
                        " the Pledge of Allegiance?", "the United States", "");
                return problemFiftyTwo;
            case 53:
                Problem problemFiftyThree = new Problem("53. What is one promise you make when" +
                        " you become a United States citizen?",
                        "Give up loyalty to other countries", "");
                return problemFiftyThree;
            case 54:
                Problem problemFiftyFour = new Problem("54. How old do citizens have to be to" +
                        " vote for President?*", "eighteen and older", "");
                return problemFiftyFour;
            case 55:
                Problem problemFiftyFive = new Problem("55. What are two ways that Americans can" +
                        " participate in their democracy?", "vote and run for office", "");
                return problemFiftyFive;
            case 56:
                Problem problemFiftySix = new Problem("56. When is the last day you can send in" +
                        " federal income tax forms?*", "April 15", "");
                return problemFiftySix;
            case 57:
                Problem problemFiftySeven = new Problem("57. When must all men register for the" +
                        " Selective Service?", "at age eighteen", "");
                return problemFiftySeven;
            case 58:
                Problem problemFiftyEight = new Problem("58. What is one reason colonists came" +
                        " to America?", "religious freedom", "");
                return problemFiftyEight;
            case 59:
                Problem problemFiftyNine = new Problem("59. Who lived in America before the" +
                        " Europeans arrived?", "Native Americans", "");
                return problemFiftyNine;
            case 60:
                Problem problemSixty = new Problem("60. What group of people was taken to America" +
                        " and sold as slaves?", "Africans", "");
                return problemSixty;
            case 61:
                Problem problemSixtyOne = new Problem("61. Why did the colonists fight" +
                        " the British?", "because of high taxes", "");
                return problemSixtyOne;
            case 62:
                Problem problemSixtyTwo = new Problem("62. Who wrote the Declaration of" +
                        " Independence?", "Thomas Jefferson", "");
                return problemSixtyTwo;
            case 63:
                Problem problemSixtyThree = new Problem("63. When was the Declaration of" +
                        " Independence adopted?", "July 4, 1776", "");
                return problemSixtyThree;
            case 64:
                Problem problemSixtyFour = new Problem("64. There were 13 original states." +
                        " Name three.", "New Hampshire, Massachusetts, Rhode Island", "");
                return problemSixtyFour;
            case 65:
                Problem problemSixtyFive = new Problem("65. What happened at the Constitutional" +
                        " Convention?", "The Constitution was written", "");
                return problemSixtyFive;
            case 66:
                Problem problemSixtySix = new Problem("66. When was the Constitution written?",
                        "1787", "");
                return problemSixtySix;
            case 67:
                Problem problemSixtySeven = new Problem("67. The Federalist Papers supported the" +
                        " passage of the U.S. Constitution. Name one of the writers.",
                        "Alexander Hamilton", "");
                return problemSixtySeven;
            case 68:
                Problem problemSixtyEight = new Problem("68. What is one thing Benjamin Franklin" +
                        " is famous for?", "U.S. diplomat", "");
                return problemSixtyEight;
            case 69:
                Problem problemSixtyNine = new Problem("69. Who is the “Father of Our Country”?",
                        "George Washington", "");
                return problemSixtyNine;
            case 70:
                Problem problemSeventy = new Problem("70. Who was the first President?*",
                        "George Washington", "");
                return problemSeventy;
            case 71:
                Problem problemSeventyOne = new Problem("71. What territory did the United States" +
                        " buy from France in 1803?", "the Louisiana Territory", "");
                return problemSeventyOne;
            case 72:
                Problem problemSeventyTwo = new Problem("72. Name one war fought by the" +
                        " United States in the 1800s.", "Mexican-American War", "");
                return problemSeventyTwo;
            case 73:
                Problem problemSeventyThree = new Problem("73. Name the U.S. war between the" +
                        " North and the South.", "the Civil War", "");
                return problemSeventyThree;
            case 74:
                Problem problemSeventyFour = new Problem("74. Name one problem that led to the" +
                        " Civil War.", "slavery", "");
                return problemSeventyFour;
            case 75:
                Problem problemSeventyFive = new Problem("75. What was one important thing that" +
                        " Abraham Lincoln did?*", "freed the slaves", "");
                return problemSeventyFive;
            case 76:
                Problem problemSeventySix = new Problem("76. What did the Emancipation" +
                        " Proclamation do?", "freed the slaves", "");
                return problemSeventySix;
            case 77:
                Problem problemSeventySeven = new Problem("77. What did Susan B. Anthony do?",
                        "fought for civil rights", "");
                return problemSeventySeven;
            case 78:
                Problem problemSeventyEight = new Problem("78. Name one war fought by the" +
                        " United States in the 1900s.*", "World War I", "");
                return problemSeventyEight;
            case 79:
                Problem problemSeventyNine = new Problem("79. Who was President during" +
                        " World War I?", "Woodrow Wilson", "");
                return problemSeventyNine;
            case 80:
                Problem problemEighty = new Problem("80. Who was President during the " +
                        "Great Depression and World War II?", "Franklin Roosevelt", "");
                return problemEighty;
            case 81:
                Problem problemEightyOne = new Problem("81. Who did the United States fight in" +
                        " World War II?", "Japan, Germany, and Italy", "");
                return problemEightyOne;
            case 82:
                Problem problemEightyTwo = new Problem("82. Before he was President, Eisenhower" +
                        " was a general. What war was he in?", "World War II", "");
                return problemEightyTwo;
            case 83:
                Problem problemEightyThree = new Problem("83. During the Cold War, what was the" +
                        " main concern of the United States?", "Communism", "");
                return problemEightyThree;
            case 84:
                Problem problemEightyFour = new Problem("84. What movement tried to end racial" +
                        " discrimination?", "civil rights movement", "");
                return problemEightyFour;
            case 85:
                Problem problemEightyFive = new Problem("85. What did Martin Luther King, Jr. do?*",
                        "fought for civil rights", "");
                return problemEightyFive;
            case 86:
                Problem problemEightySix = new Problem("86. What major event happened on" +
                        " September 11, 2001, in the United States? ",
                        "Terrorists attacked the United States.", "");
                return problemEightySix;
            case 87:
                Problem problemEightySeven = new Problem("87. Name one American Indian tribe in" +
                        " the United States.", "Navajo", "");
                return problemEightySeven;
            case 88:
                Problem problemEightyEight = new Problem("88. Name one of the two longest rivers" +
                        " in the United States.", "Missouri River", "");
                return problemEightyEight;
            case 89:
                Problem problemEightyNine = new Problem("89. What ocean is on the West Coast of" +
                        " the United States?", "Pacific Ocean", "");
                return problemEightyNine;
            case 90:
                Problem problemNinety = new Problem("90. What ocean is on the East Coast of " +
                        "the United States?", "Atlantic Ocean", "");
                return problemNinety;
            case 91:
                Problem problemNinetyOne = new Problem("91. Name one U.S. territory.",
                        "Puerto Rico", "");
                return problemNinetyOne;
            case 92:
                Problem problemNinetyTwo = new Problem("92. Name one state that borders Canada.",
                        "Washington", "");
                return problemNinetyTwo;
            case 93:
                Problem problemNinetyThree = new Problem("93. Name one state that borders Mexico.",
                        "Texas", "");
                return problemNinetyThree;
            case 94:
                Problem problemNinetyFour = new Problem("94. What is the capital of the" +
                        " United States?*", "Washington, D.C.", "");
                return problemNinetyFour;
            case 95:
                Problem problemNinetyFive = new Problem("95. Where is the Statue of Liberty?*",
                        "New York Harbor", "");
                return problemNinetyFive;
            case 96:
                Problem problemNinetySix = new Problem("96. Why does the flag have 13 stripes?",
                        "because there were 13 original colonies", "");
                return problemNinetySix;
            case 97:
                Problem problemNinetySeven = new Problem("97. Why does the flag have 50 stars?*",
                        "because there are 50 states", "");
                return problemNinetySeven;
            case 98:
                Problem problemNinetyEight = new Problem("98. What is the name of the national" +
                        " anthem?", "The Star-Spangled Banner", "");
                return problemNinetyEight;
            case 99:
                Problem problemNinetyNine = new Problem("99. When do we celebrate" +
                        " Independence Day?*", "July 4", "");
                return problemNinetyNine;
            case 100:
                Problem problemOneHundred = new Problem("100. Name two national U.S. holidays.",
                        "Martin Luther King, Jr. Day and Presidents’ Day", "");
                return problemOneHundred;
            default:
                Problem defaultProblem = new Problem("", "", "");
                return defaultProblem;
        }
    }
}