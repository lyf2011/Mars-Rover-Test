package com.twschool.practice.guessnumber;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameAnswerTest {
    GameAnswer answer = new GameAnswer("1,2,3,4");
    @Test
    public void should_return_4A0B_given_user_input_1234(){
        String userInput = "1,2,3,4";

        String result = answer.check(userInput);

        assertThat(result, is("4A0B"));
    }

    @Test
    public void should_return_1A3B_given_user_input_1342(){
        String userInput = "1,3,4,2";

        String result = answer.check(userInput);

        assertThat(result, is("1A3B"));
    }

    @Test
    public void should_return_1A1B_given_user_input_1562(){
        String userInput = "1,5,6,2";

        String result = answer.check(userInput);

        assertThat(result, is("1A1B"));
    }

    @Test
    public void should_return_0A4B_given_user_input_4321(){
        String userInput = "4,3,2,1";

        String result = answer.check(userInput);

        assertThat(result, is("0A4B"));
    }

    @Test
    public void should_return_0A3B_given_user_input_5321(){
        String userInput = "5,3,2,1";

        String result = answer.check(userInput);

        assertThat(result, is("0A3B"));
    }

    @Test
    public void should_return_0A0B_given_user_input_5678(){
        String userInput = "5,6,7,8";

        String result = answer.check(userInput);

        assertThat(result, is("0A0B"));
    }
}