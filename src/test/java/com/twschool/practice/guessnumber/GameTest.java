package com.twschool.practice.guessnumber;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {
    GameAnswer answer = new GameAnswer("1,2,3,4");

    @Test
    public void should_return_4A0B_with_user_input_1234_given_answer_1234(){
        Game game = new Game(answer);

        String result = game.guess("1,2,3,4");

        assertThat(result, is("4A0B"));
    }

    @Test
    public void should_return_SUCCESS_with_user_input_1234_given_answer_1234(){
        Game game = new Game(answer);

        game.guess("1,2,3,4");
        GameStatus status = game.getStatus();

        assertThat(status, is(GameStatus.SUCCESS));
    }

    @Test
    public void should_return_CONTINUE_with_user_input_1256_given_answer_1234(){
        Game game = new Game(answer);

        game.guess("1,2,5,6");
        GameStatus status = game.getStatus();

        assertThat(status, is(GameStatus.CONTINUE));
    }

    @Test
    public void should_return_FAILED_with_user_input_wrong_6_times_given_answer_1234(){
        Game game = new Game(answer);

        game.guess("1,2,5,6");
        game.guess("1,2,3,6");
        game.guess("1,2,4,6");
        game.guess("8,2,5,6");
        game.guess("3,2,5,6");
        game.guess("5,2,9,6");
        GameStatus status = game.getStatus();

        assertThat(status, is(GameStatus.FAILED));
    }
}
