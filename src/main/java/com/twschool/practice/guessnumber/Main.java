package com.twschool.practice.guessnumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("猜数游戏开始，请输入4个不同的0-9的数字，用英文逗号（,）隔开，你有6次机会...");

        Generater generater = new Generater(4);
        String answerStrings = generater.createNumberStrings();
        GameAnswer answer = new GameAnswer(answerStrings);
        Game game = new Game(answer);

        while(game.getStatus() == GameStatus.CONTINUE){
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            String result = game.guess(userInput);
            System.out.println(result + "--------还有"+ game.getLeftTimes()+ "次机会");
        }
        if (game.getStatus() == GameStatus.SUCCESS){
            System.out.println("恭喜你，猜对了！");
        } else {
            System.out.println("很抱歉，没机会了，你失败了！");
            System.out.println("正确答案是：" + answerStrings);
        }

    }
}
