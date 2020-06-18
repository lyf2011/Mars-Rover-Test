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
    public void should_return_fizz_given_number_3(){
        //given

        //when
        String result = fizzBuzz.say(3);

        //then
        assertThat(result, is("fizz"));
    }

    @Test
    public void should_return_Buzz_given_number_5(){
        //given

        //when
        String result = fizzBuzz.say(5);

        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_Whizz_given_number_7(){
        //given

        //when
        String result = fizzBuzz.say(7);

        //then
        assertThat(result, is("Whizz"));
    }

    @Test
    public void should_return_fizzBuzz_given_number_15(){
        //given

        //when
        String result = fizzBuzz.say(15);

        //then
        assertThat(result, is("fizzBuzz"));
    }

    @Test
    public void should_return_fizzWhizz_given_number_21(){
        //given

        //when
        String result = fizzBuzz.say(21);

        //then
        assertThat(result, is("fizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_given_number_35(){
        //given

        //when
        String result = fizzBuzz.say(35);

        //then
        assertThat(result, is("BuzzWhizz"));
    }
}
