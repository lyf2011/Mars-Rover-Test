package com.twschool.practice;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DirectionTest {
    @Test
    public void should_return_W_when_Current_is_N_given_command_L(){
        //given
        Direction direction = Direction.N;
        //when
        Direction newDirection = direction.turnLeft();
        //then
        assertThat(newDirection, is(Direction.W));
    }

    @Test
    public void should_return_S_when_Current_is_W_given_command_L(){
        //given
        Direction direction = Direction.W;
        //when
        Direction newDirection = direction.turnLeft();
        //then
        assertThat(newDirection, is(Direction.S));
    }

    @Test
    public void should_return_E_when_Current_is_S_given_command_L(){
        //given
        Direction direction = Direction.S;
        //when
        Direction newDirection = direction.turnLeft();
        //then
        assertThat(newDirection, is(Direction.E));
    }

    @Test
    public void should_return_N_when_Current_is_E_given_command_L(){
        //given
        Direction direction = Direction.E;
        //when
        Direction newDirection = direction.turnLeft();
        //then
        assertThat(newDirection, is(Direction.N));
    }

    @Test
    public void should_return_E_when_Current_is_N_given_command_R(){
        //given
        Direction direction = Direction.N;
        //when
        Direction newDirection = direction.turnRight();
        //then
        assertThat(newDirection, is(Direction.E));
    }

    @Test
    public void should_return_N_when_Current_is_W_given_command_R(){
        //given
        Direction direction = Direction.W;
        //when
        Direction newDirection = direction.turnRight();
        //then
        assertThat(newDirection, is(Direction.N));
    }

    @Test
    public void should_return_W_when_Current_is_S_given_command_R(){
        //given
        Direction direction = Direction.S;
        //when
        Direction newDirection = direction.turnRight();
        //then
        assertThat(newDirection, is(Direction.W));
    }

    @Test
    public void should_return_S_when_Current_is_E_given_command_R(){
        //given
        Direction direction = Direction.E;
        //when
        Direction newDirection = direction.turnRight();
        //then
        assertThat(newDirection, is(Direction.S));
    }

}