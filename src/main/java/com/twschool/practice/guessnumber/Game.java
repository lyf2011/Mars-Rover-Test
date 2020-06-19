package com.twschool.practice.guessnumber;

public class Game {
    private GameAnswer answer;

    public Game(GameAnswer answer) {
        this.answer = answer;
    }

    public String guess(String userInput) {
        return answer.check(userInput);
    }
}
