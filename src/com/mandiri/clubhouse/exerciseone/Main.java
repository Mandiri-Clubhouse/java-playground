package com.mandiri.clubhouse.exerciseone;

public class Main {

    /**
     * entry point, biasanya digunakan oleh bahasa yang mendukung OOP dan compiled language
     * */

    public static void main(String[] args) {
        Car nissan = new Car("Nissan GTR Nismo", 10, Type.CONVENTIONAL);
        nissan.startCar();
        nissan.engineType();
    }
}
