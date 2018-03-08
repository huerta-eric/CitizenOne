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

    //method accessed by the ProblemCreator Class
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
                created if the case is met. The first string passed is the question, the second
                string passed is the CORRECT answer, the third string passed is INCORRECT*/
                Problem problemOne = new Problem("1. What is the supreme law of the land?",
                        "The Constitution",
                        "The Bill of Rights");
                return problemOne;
            case 2:
                Problem problemTwo = new Problem("2. What does the Constitution do?",
                        "Defines the government",
                        "Eliminates the government");
                return problemTwo;
            case 3:
                Problem problemThree = new Problem("3. The idea of self-government is in the " +
                        "first three words of the Constitution. What are these words?",
                        "We the People",
                        "One nation under");
                return problemThree;
            case 4:
                Problem problemFour = new Problem("4. What is an amendment?",
                        "A change",
                        "A challenge");
                return problemFour;
            case 5:
                Problem problemFive = new Problem("5. What do we call the first ten amendments" +
                        " to the Constitution?",
                        "The Bill of Rights",
                        "The Founding Amendments");
                return problemFive;
            case 6:
                Problem problemSix = new Problem("6. What is one right or freedom from the First" +
                        " Amendment?*",
                        "Speech",
                        "Right to Bear Arms");
                return problemSix;
            case 7:
                Problem problemSeven = new Problem("7. How many amendments does the " +
                        "Constitution have? ",
                        "27",
                        "24");
                return problemSeven;
            case 8:
                Problem problemEight = new Problem("8. What did the Declaration of Independence" +
                        " do? ",
                        "Announced our independence from Great Britain",
                        "Announced our independence from France");
                return problemEight;
            case 9:
                Problem problemNine = new Problem("9. What are two rights in the Declaration of" +
                        " Independence?",
                        "Liberty and the Pursuit of Happiness",
                        "Life and Death");
                return problemNine;
            case 10:
                Problem problemTen = new Problem("10. What is freedom of religion?",
                        "You can practice any religion, or not practice a religion.",
                        "All religion is banned");
                return problemTen;
            case 11:
                Problem problemEleven = new Problem("11. What is the economic system in" +
                        " the United States?*",
                        "capitalist economy",
                        "communist system");
                return problemEleven;
            case 12:
                Problem problemTwelve = new Problem("12. What is the “rule of law”?",
                        "Everyone must follow the law",
                        "Certain people are exempt from following the law");
                return problemTwelve;
            case 13:
                Problem problemThirteen = new Problem("13. Name one branch or part of the" +
                        " government.*",
                        "Congress",
                        "Parliament");
                return problemThirteen;
            case 14:
                Problem problemFourteen = new Problem("14. What stops one branch of government" +
                        " from becoming too powerful?",
                        "checks and balances",
                        "public opinion");
                return problemFourteen;
            case 15:
                Problem problemFifteen = new Problem("15. Who is in charge of the" +
                        " executive branch?",
                        "the President",
                        "The military");
                return problemFifteen;
            case 16:
                Problem problemSixteen = new Problem("16. Who makes federal laws?",
                        "Congress",
                        "The supreme court");
                return problemSixteen;
            case 17:
                Problem problemSeventeen = new Problem("17. What are the two parts of the" +
                        " U.S. Congress?*",
                        "the Senate and House",
                        "The Senate and The President");
                return problemSeventeen;
            case 18:
                Problem problemEighteen = new Problem("18. How many U.S. Senators are there?",
                        "one hundred",
                        "fifty");
                return problemEighteen;
            case 19:
                Problem problemNineteen = new Problem("19. We elect a U.S. Senator for how" +
                        " many years?",
                        "six",
                        "four");
                return problemNineteen;
            case 20:  // This question depends on the location of the user
                Problem problemTwenty = new Problem("20. Who is one of your state’s U.S." +
                        " Senators now?*",
                        "Ted Cruz",
                        "Marco Rubio");
                return problemTwenty;
            case 21:
                Problem problemTwentyOne = new Problem("21. The House of Representatives has" +
                        " how many voting members?",
                        "four hundred thirty-five",
                        " one hundred");
                return problemTwentyOne;
            case 22:
                Problem problemTwentyTwo = new Problem("22. We elect a U.S. Representative for" +
                        " how many years?",
                        "two",
                        "six");
                return problemTwentyTwo;
            case 23:   // This question depends on the location of the user
                Problem problemTwentyThree = new Problem("23. Name your U.S. Representative.",
                        "Congressman Pete Olson",
                        "John Ratcliffe");
                return problemTwentyThree;
            case 24:
                Problem problemTwentyFour = new Problem("24. Who does a U.S. Senator represent?",
                        "all people of the state",
                        "all the people of their particular district");
                return problemTwentyFour;
            case 25:
                Problem problemTwentyFive = new Problem("25. Why do some states have more" +
                        " Representatives than other states?",
                        "Because of the state’s population",
                        "Because of the state's land area");
                return problemTwentyFive;
            case 26:
                Problem problemTwentySix = new Problem("26. We elect a President for how many" +
                        " years?",
                        "four",
                        "six");
                return problemTwentySix;
            case 27:
                Problem problemTwentySeven = new Problem("27. In what month do we vote for" +
                        " President?*",
                        "November",
                        "December");
                return problemTwentySeven;
            case 28:
                Problem problemTwentyEight = new Problem("28. What is the name of the President" +
                        " of the United States now?*",
                        "Donald J. Trump",
                        "Michael R. Pence");
                return problemTwentyEight;
            case 29:
                Problem problemTwentyNine = new Problem("29. What is the name of the" +
                        " Vice President of the United States now?",
                        "Michael R. Pence",
                        "Paul D. Ryan");
                return problemTwentyNine;
            case 30:
                Problem problemThirty = new Problem("30. If the President can no longer serve," +
                        " who becomes President?",
                        "the Vice President",
                        "the previous President");
                return problemThirty;
            case 31:
                Problem problemThirtyOne = new Problem("31. If both the President and the" +
                        " Vice President can no longer serve, who becomes President?",
                        "the Speaker of the House",
                        "the previous President");
                return problemThirtyOne;
            case 32:
                Problem problemThirtyTwo = new Problem("32. Who is the Commander in Chief of" +
                        " the military?",
                        "the President",
                        "the Vice President");
                return problemThirtyTwo;
            case 33:
                Problem problemThirtyThree = new Problem("33. Who signs bills to become laws?",
                        "the President",
                        "the states");
                return problemThirtyThree;
            case 34:
                Problem problemThirtyFour = new Problem("34. Who vetoes bills?",
                        "the President",
                        "the electoral college");
                return problemThirtyFour;
            case 35:
                Problem problemThirtyFive = new Problem("35. What does the President’s Cabinet do?",
                        "advises the President",
                        "protects the President from bodily harm");
                return problemThirtyFive;
            case 36:
                Problem problemThirtySix = new Problem("36. What are two Cabinet-level positions?",
                        "Secretary of Agriculture and Secretary of Commerce",
                        "Secretary of Defence and Secretary of Nuclear Energy");
                return problemThirtySix;
            case 37:
                Problem problemThirtySeven = new Problem("37. What does the judicial branch do?",
                        "reviews laws",
                        "vetoes laws");
                return problemThirtySeven;
            case 38:
                Problem problemThirtyEight = new Problem("38. What is the highest court in" +
                        " the United States?",
                        "the Supreme Court",
                        "the First Court");
                return problemThirtyEight;
            case 39:
                Problem problemThirtyNine = new Problem("39. How many justices are on the" +
                        " Supreme Court?",
                        "nine",
                        "seven");
                return problemThirtyNine;
            case 40:
                Problem problemForty = new Problem("40. Who is the Chief Justice of the" +
                        " United States now?",
                        "John Roberts",
                        "Andrew Johnson");
                return problemForty;
            case 41:
                Problem problemFortyOne = new Problem("41. Under our Constitution, some powers" +
                        " belong to the federal government. What is one power of the federal" +
                        " government?",
                        "to declare war",
                        "to review laws");
                return problemFortyOne;
            case 42:
                Problem problemFortyTwo = new Problem("42. Under our Constitution, some powers" +
                        " belong to the states. What is one power of the states?",
                        "provide schooling and education",
                        "establish international trade agreements");
                return problemFortyTwo;
            case 43:
                Problem problemFortyThree = new Problem("43. Who is the Governor of your state" +
                        " now?",
                        "Greg Abbott",
                        "Ted Cruz");
                return problemFortyThree;
            case 44:
                Problem problemFortyFour = new Problem("44. What is the capital of your state?*",
                        "Austin",
                        "Houston");
                return problemFortyFour;
            case 45:
                Problem problemFortyFive = new Problem("45. What are the two major political" +
                        " parties in the United States?*",
                        "Democratic and Republican",
                        "Green Party and Libertarian");
                return problemFortyFive;
            case 46:
                Problem problemFortySix = new Problem("46. What is the political party of the" +
                        " President now?",
                        "Republican",
                        "Democratic");
                return problemFortySix;
            case 47:
                Problem problemFortySeven = new Problem("47. What is the name of the Speaker of" +
                        " the House of Representatives now?",
                        "Paul D. Ryan",
                        "John McCain");
                return problemFortySeven;
            case 48:
                Problem problemFortyEight = new Problem("48. There are four amendments to the" +
                        " Constitution about who can vote. Describe one of them.",
                        "Citizens eighteen and older can vote",
                        "Residents eighteen and older can vote");
                return problemFortyEight;
            case 49:
                Problem problemFortyNine = new Problem("49. What is one responsibility that is" +
                        " only for United States citizens?*",
                        "serve on a jury",
                        "joining the military");
                return problemFortyNine;
            case 50:
                Problem problemFifty = new Problem("50. Name one right only for United States" +
                        " citizens.",
                        "run for federal office",
                        "freedom of speech");
                return problemFifty;
            case 51:
                Problem problemFiftyOne = new Problem("51. What are two rights of everyone living" +
                        " in the United States?",
                        "freedom of speech and freedom of religion",
                        "joining the military and freedom of religion");
                return problemFiftyOne;
            case 52:
                Problem problemFiftyTwo = new Problem("52. What do we show loyalty to when we say" +
                        " the Pledge of Allegiance?",
                        "the United States",
                        "the world");
                return problemFiftyTwo;
            case 53:
                Problem problemFiftyThree = new Problem("53. What is one promise you make when" +
                        " you become a United States citizen?",
                        "Give up loyalty to other countries",
                        "Give up loyalty to all countries");
                return problemFiftyThree;
            case 54:
                Problem problemFiftyFour = new Problem("54. How old do citizens have to be to" +
                        " vote for President?*",
                        "eighteen and older",
                        "twenty one and older");
                return problemFiftyFour;
            case 55:
                Problem problemFiftyFive = new Problem("55. What are two ways that Americans can" +
                        " participate in their democracy?",
                        "vote and run for office",
                        "vote in school elections and purchase american made products");
                return problemFiftyFive;
            case 56:
                Problem problemFiftySix = new Problem("56. When is the last day you can send in" +
                        " federal income tax forms?*",
                        "April 15",
                        "March 15");
                return problemFiftySix;
            case 57:
                Problem problemFiftySeven = new Problem("57. When must all men register for the" +
                        " Selective Service?",
                        "at age eighteen",
                        "at age twentyOne");
                return problemFiftySeven;
            case 58:
                Problem problemFiftyEight = new Problem("58. What is one reason colonists came" +
                        " to America?",
                        "religious freedom",
                        "to fight native americans");
                return problemFiftyEight;
            case 59:
                Problem problemFiftyNine = new Problem("59. Who lived in America before the" +
                        " Europeans arrived?",
                        "Native Americans",
                        "African Americans");
                return problemFiftyNine;
            case 60:
                Problem problemSixty = new Problem("60. What group of people was taken to America" +
                        " and sold as slaves?",
                        "Africans",
                        "Europeans");
                return problemSixty;
            case 61:
                Problem problemSixtyOne = new Problem("61. Why did the colonists fight" +
                        " the British?",
                        "because of high taxes",
                        "because they wanted to invade the British");
                return problemSixtyOne;
            case 62:
                Problem problemSixtyTwo = new Problem("62. Who wrote the Declaration of" +
                        " Independence?",
                        "Thomas Jefferson",
                        "Abraham Lincoln");
                return problemSixtyTwo;
            case 63:
                Problem problemSixtyThree = new Problem("63. When was the Declaration of" +
                        " Independence adopted?",
                        "July 4, 1776",
                        "June 4, 1776");
                return problemSixtyThree;
            case 64:
                Problem problemSixtyFour = new Problem("64. There were 13 original states." +
                        " Name three.",
                        "New Hampshire, Massachusetts, Rhode Island",
                        "Virginia, Rhode Island, Iowa");
                return problemSixtyFour;
            case 65:
                Problem problemSixtyFive = new Problem("65. What happened at the Constitutional" +
                        " Convention?",
                        "The Constitution was written",
                        "The colonies claimed independence");
                return problemSixtyFive;
            case 66:
                Problem problemSixtySix = new Problem("66. When was the Constitution written?",
                        "1787",
                        "1776");
                return problemSixtySix;
            case 67:
                Problem problemSixtySeven = new Problem("67. The Federalist Papers supported the" +
                        " passage of the U.S. Constitution. Name one of the writers.",
                        "Alexander Hamilton",
                        "Thomas Jefferson");
                return problemSixtySeven;
            case 68:
                Problem problemSixtyEight = new Problem("68. What is one thing Benjamin Franklin" +
                        " is famous for?",
                        "U.S. diplomat",
                        "Second President of The United States");
                return problemSixtyEight;
            case 69:
                Problem problemSixtyNine = new Problem("69. Who is the “Father of Our Country”?",
                        "George Washington",
                        "Thomas Jefferson");
                return problemSixtyNine;
            case 70:
                Problem problemSeventy = new Problem("70. Who was the first President?*",
                        "George Washington",
                        "Benjamin Franklin");
                return problemSeventy;
            case 71:
                Problem problemSeventyOne = new Problem("71. What territory did the United States" +
                        " buy from France in 1803?",
                        "The Louisiana Territory",
                        "The Alaska Territory");
                return problemSeventyOne;
            case 72:
                Problem problemSeventyTwo = new Problem("72. Name one war fought by the" +
                        " United States in the 1800s.",
                        "Mexican-American War",
                        "World War I");
                return problemSeventyTwo;
            case 73:
                Problem problemSeventyThree = new Problem("73. Name the U.S. war between the" +
                        " North and the South.",
                        "The Civil War",
                        "The American Revolution");
                return problemSeventyThree;
            case 74:
                Problem problemSeventyFour = new Problem("74. Name one problem that led to the" +
                        " Civil War.",
                        "Slavery",
                        "Taxation without representation in Great Britain");
                return problemSeventyFour;
            case 75:
                Problem problemSeventyFive = new Problem("75. What was one important thing that" +
                        " Abraham Lincoln did?*",
                        "Freed the slaves",
                        "Initiated the civil rights movement");
                return problemSeventyFive;
            case 76:
                Problem problemSeventySix = new Problem("76. What did the Emancipation" +
                        " Proclamation do?",
                        "freed the slaves",
                        "");
                return problemSeventySix;
            case 77:
                Problem problemSeventySeven = new Problem("77. What did Susan B. Anthony do?",
                        "Fought for civil rights",
                        "The wife of Thomas Jefferson");
                return problemSeventySeven;
            case 78:
                Problem problemSeventyEight = new Problem("78. Name one war fought by the" +
                        " United States in the 1900s.*",
                        "World War I",
                        "Mexican-American War");
                return problemSeventyEight;
            case 79:
                Problem problemSeventyNine = new Problem("79. Who was President during" +
                        " World War I?",
                        "Woodrow Wilson",
                        "Franklin Roosevelt");
                return problemSeventyNine;
            case 80:
                Problem problemEighty = new Problem("80. Who was President during the " +
                        "Great Depression and World War II?",
                        "Franklin Roosevelt",
                        "Theodore Roosevelt");
                return problemEighty;
            case 81:
                Problem problemEightyOne = new Problem("81. Who did the United States fight in" +
                        " World War II?",
                        "Japan, Germany, and Italy",
                        "Russia, North Korea, and China");
                return problemEightyOne;
            case 82:
                Problem problemEightyTwo = new Problem("82. Before he was President, Eisenhower" +
                        " was a general. What war was he in?",
                        "World War II",
                        "Vietnam");
                return problemEightyTwo;
            case 83:
                Problem problemEightyThree = new Problem("83. During the Cold War, what was the" +
                        " main concern of the United States?",
                        "Communism",
                        "Anarchism");
                return problemEightyThree;
            case 84:
                Problem problemEightyFour = new Problem("84. What movement tried to end racial" +
                        " discrimination?",
                        "civil rights movement",
                        "gay rights movement");
                return problemEightyFour;
            case 85:
                Problem problemEightyFive = new Problem("85. What did Martin Luther King, Jr. do?*",
                        "fought for civil rights",
                        "fought to end slavery");
                return problemEightyFive;
            case 86:
                Problem problemEightySix = new Problem("86. What major event happened on" +
                        " September 11, 2001, in the United States? ",
                        "Terrorists attacked the United States.",
                        "The Russians conducted a cyber attack");
                return problemEightySix;
            case 87:
                Problem problemEightySeven = new Problem("87. Name one American Indian tribe in" +
                        " the United States.",
                        "Navajo tribe",
                        "Tarascan tribe");
                return problemEightySeven;
            case 88:
                Problem problemEightyEight = new Problem("88. Name one of the two longest rivers" +
                        " in the United States.",
                        "Missouri River",
                        "Rio Grande");
                return problemEightyEight;
            case 89:
                Problem problemEightyNine = new Problem("89. What ocean is on the West Coast of" +
                        " the United States?",
                        "Pacific Ocean",
                        "Atlantic Ocean");
                return problemEightyNine;
            case 90:
                Problem problemNinety = new Problem("90. What ocean is on the East Coast of " +
                        "the United States?",
                        "Atlantic Ocean",
                        "Pacific Ocean");
                return problemNinety;
            case 91:
                Problem problemNinetyOne = new Problem("91. Name one U.S. territory.",
                        "Puerto Rico",
                        "Hawaii");
                return problemNinetyOne;
            case 92:
                Problem problemNinetyTwo = new Problem("92. Name one state that borders Canada.",
                        "Washington",
                        "Oregon");
                return problemNinetyTwo;
            case 93:
                Problem problemNinetyThree = new Problem("93. Name one state that borders Mexico.",
                        "Texas",
                        "Louisiana");
                return problemNinetyThree;
            case 94:
                Problem problemNinetyFour = new Problem("94. What is the capital of the" +
                        " United States?*",
                        "Washington, D.C.",
                        "Washington State");
                return problemNinetyFour;
            case 95:
                Problem problemNinetyFive = new Problem("95. Where is the Statue of Liberty?*",
                        "New York Harbor",
                        "New Jersey");
                return problemNinetyFive;
            case 96:
                Problem problemNinetySix = new Problem("96. Why does the flag have 13 stripes?",
                        "because there were 13 original colonies",
                        "because there were 13 founding fathers");
                return problemNinetySix;
            case 97:
                Problem problemNinetySeven = new Problem("97. Why does the flag have 50 stars?*",
                        "because there are 50 states",
                        "because there were 50 battles for independence");
                return problemNinetySeven;
            case 98:
                Problem problemNinetyEight = new Problem("98. What is the name of the national" +
                        " anthem?",
                        "The Star-Spangled Banner",
                        "The Pledge of Allegiance");
                return problemNinetyEight;
            case 99:
                Problem problemNinetyNine = new Problem("99. When do we celebrate" +
                        " Independence Day?*",
                        "July 4",
                        "June 4");
                return problemNinetyNine;
            case 100:
                Problem problemOneHundred = new Problem("100. Name two national U.S. holidays.",
                        "Martin Luther King, Jr. Day and Presidents’ Day",
                        "Christmas Day and Easter");
                return problemOneHundred;
            default:
                Problem defaultProblem = new Problem("", "", "");
                return defaultProblem;
        }
    }
}
