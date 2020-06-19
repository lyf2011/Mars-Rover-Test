package com.twschool.practice.guessnumber;

public class Game {
    private GameAnswer answer;
    private GameStatus status;

    public Game(GameAnswer answer) {
        this.answer = answer;
    }

    public String guess(String userInput) {
        return answer.check(userInput);
    }

    public GameStatus getStatus() {
        return GameStatus.SUCCESS;
    }
}
