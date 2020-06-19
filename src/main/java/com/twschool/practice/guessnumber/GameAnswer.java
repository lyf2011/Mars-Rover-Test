package com.twschool.practice.guessnumber;

import java.util.Arrays;
import java.util.List;

public class GameAnswer {


    private List<String> answerNumbers;

    public GameAnswer(String answerNumbers) {
        this.answerNumbers = Arrays.asList(answerNumbers.split(","));
    }

    public String check(String userInputString) {
        List<String> userInput = Arrays.asList(userInputString.split(","));
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
