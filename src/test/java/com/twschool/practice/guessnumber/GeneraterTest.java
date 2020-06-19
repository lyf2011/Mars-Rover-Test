package com.twschool.practice.guessnumber;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneraterTest {
    @Test
    public void should_return_4_given_number_count_is_4(){
        //given
        int numberCount = 4;
        //when
        Generater generater = new Generater(numberCount);
        String numberStrings = generater.createNumberStrings();
        int numbersLength = numberStrings.split(",").length;
        //then
        assertThat(numbersLength, is(4));
    }

    @Test
    public void should_return_5_given_number_count_is_5(){
        //given
        int numberCount = 5;
        //when
        Generater generater = new Generater(numberCount);
        String numberStrings = generater.createNumberStrings();
        int numbersLength = numberStrings.split(",").length;
        //then
        assertThat(numbersLength, is(5));
    }

    @Test
    public void should_return_8_when_need_no_repeat_number_given_number_count_is_8(){
        //given
        int numberCount = 8;
        //when
        Generater generater = new Generater(numberCount);
        String numberStrings = generater.createNumberStrings();
        List<String> numbers = Arrays.asList(numberStrings.split(","));
        List<String> listWithoutDup = new ArrayList<String>(new HashSet<String>(numbers));
        int afterRemoveDupNumerlength = listWithoutDup.size();
        //then
        assertThat(afterRemoveDupNumerlength, is(8));
    }
}
