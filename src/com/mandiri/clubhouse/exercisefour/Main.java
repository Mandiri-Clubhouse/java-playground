package com.mandiri.clubhouse.exercisefour;

public class Main {
    public static void main(String[] args) {
        Position initialPosition = new Position(2,3);
        Directions initialDirection = Directions.EAST;

        Robot robot = new Robot(initialPosition, initialDirection);
        robot.commands("AARARARRARAAAAA");
    }
}
