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
}
