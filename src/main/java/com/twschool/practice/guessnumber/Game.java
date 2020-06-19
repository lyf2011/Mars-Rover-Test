package com.twschool.practice.guessnumber;

public class Game {
    private GameAnswer answer;
    private GameStatus status = GameStatus.CONTINUE;

    public Game(GameAnswer answer) {
        this.answer = answer;
    }

    public String guess(String userInput) {
        String result = answer.check(userInput);
        if ("4A0B".equals(result)){
            status = GameStatus.SUCCESS;
        }
        return result;
    }

    public GameStatus getStatus() {
        return status;
    }
}
