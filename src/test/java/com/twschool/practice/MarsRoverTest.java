package com.twschool.practice;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_0_0_W_given_0_0_N_and_L() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.W));
    }

    @Test
    public void should_return_0_0_E_given_0_0_N_and_R() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.E));
    }

    @Test
    public void should_return_0_1_N_given_0_0_N_and_M() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(1));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.N));
    }

    @Test
    public void should_return_0_0_S_given_0_0_W_and_L() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.S));
    }

    @Test
    public void should_return_0_0_N_given_0_0_W_and_R() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.N));
    }

    @Test
    public void should_return_negative_1_0_W_given_0_0_W_and_M() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getPosition().getX(), is(-1));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.W));
    }

    @Test
    public void should_return_0_0_E_given_0_0_S_and_L() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.E));
    }

    @Test
    public void should_return_0_0_W_given_0_0_S_and_R() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.W));
    }

    @Test
    public void should_return_0_negative_1_S_given_0_0_S_and_M() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(-1));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.S));
    }

    @Test
    public void should_return_0_0_N_given_0_0_E_and_L() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.N));
    }

    @Test
    public void should_return_0_0_S_given_0_0_E_and_R() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.S));
    }

    @Test
    public void should_return_1_0_E_given_0_0_E_and_M() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getPosition().getX(), is(1));
        assertThat(marsRover.getPosition().getY(), is(0));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.E));
    }

    @Test
    public void should_return_0_1_S_given_0_0_N_and_MMLLM() {
        //given
        MarsRoverPostion position = new MarsRoverPostion(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(position);

        //when
        marsRover.execute(Arrays.asList("M", "M", "L", "L", "M"));

        //then
        assertThat(marsRover.getPosition().getX(), is(0));
        assertThat(marsRover.getPosition().getY(), is(1));
        assertThat(marsRover.getPosition().getDirection(), is(Direction.S));
    }
}
