package com.mandiri.clubhouse.exerciseOne;

/**
 * contoh polymor
 * */

public class Car extends SpecialKit implements Engine {

    private Type type;

    public Car(String name, int speed, Type type) {
        this.type = type;
    }

    public void checkType() {
        if (type.equals(Type.JEEP)) {
            System.out.println("Jeep Car, Lets Ride");
        } else if(type.equals(Type.ELECTRIC)) {
            System.out.println("Electric Car, Modern Car");
        } else {
            System.out.println("Sedan Car, Public Car");
        }
    }

    @Override
    public String isRaceEngine(boolean state) {
        if (state) {
            return "vroom..vrommm";
        } else {
            return "bzzzz..";
        }
    }

    @Override
    public void runPedals() {
        System.out.println("running car");
    }
}
