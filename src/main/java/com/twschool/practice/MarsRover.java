package com.twschool.practice;

import java.util.List;

public class MarsRover {
    private MarsRoverPostion position;

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
                position.turnLeft();
            }
            if (command == "R") {
                position.turnRight();
            }
            if (command == "M") {
                position.move();
            }
        }
    }
}
