package com.twschool.practice.guessnumber;

public class Game {
    private static final int MAX_TRY_TIMES = 6;
    private GameAnswer answer;
    private GameStatus status = GameStatus.CONTINUE;
    private int leftTimes = MAX_TRY_TIMES;

    public Game(GameAnswer answer) {
        this.answer = answer;
    }

    public String guess(String userInput) {
        leftTimes--;
        String result = answer.check(userInput);
        if ("4A0B".equals(result)){
            status = GameStatus.SUCCESS;
        } else if(leftTimes == 0){
            status = GameStatus.FAILED;
        }
        return result;
    }

    public int getLeftTimes() {
        return leftTimes;
    }

    public GameStatus getStatus() {
        return status;
    }
}
