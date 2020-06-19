package com.twschool.practice.guessnumber;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {
    @Test
    public void should_return_4A0B_with_user_input_1234_given_answer_1234(){
        GameAnswer answer = new GameAnswer("1,2,3,4");
        Game game = new Game(answer);

        String result = game.guess("1,2,3,4");

        assertThat(result, is("4A0B"));
    }
}
