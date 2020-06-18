package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private  Coordinate coordinate;
    private  String direction;

    public MarsRover(Coordinate coordinate, String direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public void execute(List<String> commands) {
        for (int i = 0; i < commands.size(); i++) {
            String command = commands.get(0);
            if (command == "L") {
                switch(this.direction){
                    case "N":
                        this.direction = "W";
                        break;
                    case "W":
                        this.direction = "S";
                        break;
                    case "S":
                        this.direction = "E";
                        break;
                    case "E":
                        this.direction = "N";
                        break;
                }
            }
        }
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getDirection() {
        return direction;
    }
}
