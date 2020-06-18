package com.twschool.practice;

public class FizzBuzz {
    public String say(Integer number){
        if(number % 3 == 0){
           return "fizz";
        }

        return String.valueOf(number);
    }
}
