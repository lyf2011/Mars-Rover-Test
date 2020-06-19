package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private  Coordinate coordinate;
    private  String direction;
    private MarsRoverPostion position;

    public MarsRover(Coordinate coordinate, String direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public MarsRover(MarsRoverPostion position) {
        this.position = position;
    }

    public MarsRoverPostion getPosition() {
        return position;
    }

    public void execute(List<String> commands) {
        for (int i = 0; i < commands.size(); i++) {
            String command = commands.get(i);
            if (command == "L") {
                turnLeft();
            }
            if (command == "R") {
                turnRight();
            }
            if (command == "M") {
                move();
            }
        }
    }

    private void move() {
        switch(position.direction){
            case "N":
                position.y++;
                break;
            case "W":
                position.x--;
                break;
            case "S":
                position.y--;
                break;
            case "E":
                position.x++;
                break;
        }
    }

    private void turnRight() {
        switch(position.direction){
            case "N":
                position.direction = "E";
                break;
            case "W":
                position.direction = "N";
                break;
            case "S":
                position.direction = "W";
                break;
            case "E":
                position.direction = "S";
                break;
        }
    }

    private void turnLeft() {
        switch(position.direction){
            case "N":
                position.direction = "W";
                break;
            case "W":
                position.direction = "S";
                break;
            case "S":
                position.direction = "E";
                break;
            case "E":
                position.direction = "N";
                break;
        }
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getDirection() {
        return direction;
    }
}
