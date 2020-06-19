package com.twschool.practice.guessnumber;

import java.util.*;

public class GameAnswer {


    private List<String> answerNumbers;

    public GameAnswer(String answerNumbers) {
        this.answerNumbers = Arrays.asList(answerNumbers.split(","));
    }

    public String check(String userInputString) {
        List<String> userInput = Arrays.asList(userInputString.split(","));

        List<String> listWithoutDup = new ArrayList<String>(new HashSet<String>(userInput));

        if (listWithoutDup.size() < userInput.size() || userInput.size()< 4) {
            return "Wrong Input，Input again";
        }

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < answerNumbers.size(); i++) {
            if (answerNumbers.get(i).equals(userInput.get(i))){
                countA++;
            } else if(answerNumbers.contains(userInput.get(i))){
                countB++;
            }
        }
        return countA + "A" + countB + "B";
    }
}
