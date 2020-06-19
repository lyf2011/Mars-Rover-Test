package com.twschool.practice.guessnumber;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneraterTest {
    @Test
    public void should_return_4_given_number_count_is_4(){
        //given
        int numberCount = 4;
        //when
        Generater generater = new Generater(numberCount);
        String numberStrings = generater.createNumerStrings();
        int numbersLength = numberStrings.split(",").length;
        //then
        assertThat(numbersLength, is(4));
    }
}
