package com.twschool.practice.guessnumber;

import java.util.ArrayList;
import java.util.HashSet;

public class Generater {
    private int numberCount;
    private String numberStrings = "";
    private HashSet<Integer> numbers = new HashSet<>();

    public Generater(int numberCount) {
        this.numberCount = numberCount;
    }

    public String createNumberStrings() {
        String temStr = "";
        while (numbers.size() < numberCount) {
            int currentNumber = generateInt();
            if(numbers.add(currentNumber)){
                temStr += currentNumber + ",";
            };
        }
        numberStrings = temStr.substring(0,temStr.length()-1);
        return numberStrings;
    }

    private int generateInt(){
        int random= (int)(Math.random()*10);
        return random;
    }
}
