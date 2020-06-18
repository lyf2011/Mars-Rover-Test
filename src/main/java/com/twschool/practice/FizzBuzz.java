package com.twschool.practice;

public class FizzBuzz {
    public String say(Integer number){

        if (String.valueOf(number).contains("5")){
            return "BuzzWhizz";
        }

        if (String.valueOf(number).contains("3")){
            return "fizz";
        }

        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "fizzBuzzWhizz";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzBuzz";
        }

        if (number % 3 == 0 && number % 7 == 0) {
            return "fizzWhizz";
        }

        if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
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
