package com.twschool.practice;

public class MarsRoverPostion {
    private  int x;
    private  int y;
    private Direction direction;

    public MarsRoverPostion(int X, int Y, Direction direction) {
        x = X;
        y = Y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    void turnRight() {
        switch(direction){
            case N:
                direction = Direction.E;
                break;
            case W:
                direction = Direction.N;
                break;
            case S:
                direction = Direction.W;
                break;
            case E:
                direction = Direction.S;
                break;
        }
    }

    void turnLeft() {
        switch(direction){
            case N:
                direction = Direction.W;
                break;
            case W:
                direction = Direction.S;
                break;
            case S:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.N;
                break;
        }
    }

    void move() {
        switch(direction){
            case N:
                y++;
                break;
            case W:
                x--;
                break;
            case S:
                y--;
                break;
            case E:
                x++;
                break;
        }
    }
}
