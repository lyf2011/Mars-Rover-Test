package com.twschool.practice;

public class FizzBuzz {
    public String say(Integer number){
        if(number % 3 == 0){
           return "fizz";
        }

        if(number % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
