package com.twschool.practice;

public class FizzBuzz {
    public String say(Integer number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzBuzz";
        }

        if(number % 3 == 0){
           return "fizz";
        }

        if(number % 5 == 0){
            return "Buzz";
        }

        if(number % 7 == 0){
            return "Whizz";
        }

        return String.valueOf(number);
    }
}
