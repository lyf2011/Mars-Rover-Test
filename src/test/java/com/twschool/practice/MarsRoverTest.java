package com.twschool.practice;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_0_0_W_given_0_0_N_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("W"));
    }

    @Test
    public void should_return_0_0_E_given_0_0_N_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("E"));
    }

    @Test
    public void should_return_0_1_N_given_0_0_N_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "N";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(1));
        assertThat(marsRover.getDirection(), is("N"));
    }

    @Test
    public void should_return_0_0_S_given_0_0_W_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "W";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("S"));
    }

    @Test
    public void should_return_0_0_N_given_0_0_W_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "W";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("N"));
    }

    @Test
    public void should_return_negative_1_0_W_given_0_0_W_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "W";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(-1));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("W"));
    }

    @Test
    public void should_return_0_0_E_given_0_0_S_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("E"));
    }

    @Test
    public void should_return_0_0_W_given_0_0_S_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("W"));
    }

    @Test
    public void should_return_0_negative_1_S_given_0_0_S_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "S";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(-1));
        assertThat(marsRover.getDirection(), is("S"));
    }

    @Test
    public void should_return_0_0_N_given_0_0_E_and_L() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "E";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("L"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("N"));
    }

    @Test
    public void should_return_0_0_S_given_0_0_E_and_R() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "E";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("R"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(0));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("S"));
    }

    @Test
    public void should_return_1_0_E_given_0_0_E_and_M() {
        //given
        Coordinate coordinate = new Coordinate(0, 0);
        String direction = "E";
        MarsRover marsRover = new MarsRover(coordinate, direction);

        //when
        marsRover.execute(Arrays.asList("M"));

        //then
        assertThat(marsRover.getCoordinate().getCoordinateX(), is(1));
        assertThat(marsRover.getCoordinate().getCoordinateY(), is(0));
        assertThat(marsRover.getDirection(), is("E"));
    }
}
