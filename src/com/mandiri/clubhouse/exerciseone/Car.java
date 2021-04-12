package com.mandiri.clubhouse.exerciseone;

/**
 * contoh inheritance
 * */

public class Car extends SpecialKit implements Kit {

    private String name;
    private Integer fuel;
    private Type type;

    public Car(String name, Integer fuel, Type type) {
        this.name = name;
        this.fuel = fuel;
        this.type = type;
    }

    public void startCar() {
        if (fuel > 0) {
            System.out.println("Engine Start");
        } else {
            System.out.println("Engine stop, your fuel is " + fuel);
        }
    }

    @Override
    protected void engineType() {
        if (type.equals(Type.ELECTRIC)) {
            System.out.println("Electric engine with battery : " +fuel);
        } else {
            System.out.println("Conventional engine with fuel :" +fuel);
        }
    }

    @Override
    public void turnCompass(Boolean state) {
        if (state) {
            System.out.println("Turn on compass");
        } else {
            System.out.println("Compass off");
        }
    }

    @Override
    public void turnOnLights(Boolean state) {
        if (state) {
            System.out.println("Lights on");
        } else {
            System.out.println("lights off");
        }
    }
}
