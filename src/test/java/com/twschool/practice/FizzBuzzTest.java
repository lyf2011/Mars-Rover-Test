package com.twschool.practice;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_1_given_number_1(){
        //given

        //when
        String result = fizzBuzz.say(1);

        //then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_3_given_number_3(){
        //given

        //when
        String result = fizzBuzz.say(3);

        //then
        assertThat(result, is("fizz"));
    }
}
