package com.mandiri.clubhouse.exercisefour;

public class Robot {

    private Position position;
    private Directions directions;

    public Robot(Position position, Directions directions) {
        this.position = position;
        this.directions = directions;
    }

    public void move(String commands) {
        Command command = Command.valueOf(commands);
        switch (command) {
            case A:
                forward();
                break;
            case L:
                turnLeft();
                break;
            case R:
                turnRight();
        }
    }

    private void turnRight() {
        switch (this.directions) {
            case NORTH:
                this.directions = Directions.EAST;
                break;
            case SOUTH:
                this.directions = Directions.WEST;
                break;
            case EAST:
                this.directions = Directions.SOUTH;
                break;
            case WEST:
                this.directions = Directions.NORTH;
                break;
        }
    }

    private void turnLeft() {
        switch (this.directions) {
            case WEST:
                this.directions = Directions.SOUTH;
                break;
            case EAST:
                this.directions = Directions.NORTH;
                break;
            case SOUTH:
                this.directions = Directions.EAST;
                break;
            case NORTH:
                this.directions = Directions.WEST;
                break;
        }
    }

    private void forward() {
        switch (this.directions) {
            case NORTH:
                this.position = position.getTop();
                break;
            case SOUTH:
                this.position = position.getBottom();
                break;
            case EAST:
                this.position = position.getRight();
                break;
            case WEST:
                this.position = position.getLeft();
                break;
        }
    }

    public void commands(String commands) {
        String[] commandsArray = commands.split("");
        for (String command: commandsArray) {
            move(command);
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return position +" -> " + directions;
    }
}
