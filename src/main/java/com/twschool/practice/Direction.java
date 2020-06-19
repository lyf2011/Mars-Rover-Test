package com.twschool.practice;

public enum Direction {
    N {
        @Override
        public Direction turnLeft() {
            return W;
        }

        @Override
        public Direction turnRight() {
            return E;
        }
    }, W {
        @Override
        public Direction turnLeft() {
            return S;
        }

        @Override
        public Direction turnRight() {
            return N;
        }
    }, S {
        @Override
        public Direction turnLeft() {
            return E;
        }

        @Override
        public Direction turnRight() {
            return W;
        }
    }, E {
        @Override
        public Direction turnLeft() {
            return N;
        }

        @Override
        public Direction turnRight() {
            return S;
        }
    };
    public abstract Direction turnLeft();
    public abstract Direction turnRight();
}
