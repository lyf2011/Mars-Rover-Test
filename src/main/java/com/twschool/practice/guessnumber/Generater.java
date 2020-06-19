package com.twschool.practice.guessnumber;

import java.util.Arrays;

public class Generater {
    private int numberCount;
    private String numberStrings = "";

    public Generater(int numberCount) {
        this.numberCount = numberCount;
    }

    public String createNumerStrings() {
        String temStr = "";
        for (int i = 0; i <numberCount ; i++) {
            temStr += generateInt() + ",";
        }
        numberStrings = temStr.substring(0,temStr.length()-1);
        return numberStrings;
    }

    private int generateInt(){
        int random= (int)(Math.random()*10);
        return random;
    }
}
