package com.twschool.practice;

public class MarsRoverPostion {
    private  int x;
    private  int y;
    private String direction;

    public MarsRoverPostion(int X, int Y, String direction) {
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

    public String getDirection() {
        return direction;
    }

    void turnRight() {
        switch(direction){
            case "N":
                direction = "E";
                break;
            case "W":
                direction = "N";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
        }
    }

    void turnLeft() {
        switch(direction){
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
        }
    }

    void move() {
        switch(direction){
            case "N":
                y++;
                break;
            case "W":
                x--;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
        }
    }
}
