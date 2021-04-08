package com.mandiri.clubhouse;

import com.mandiri.clubhouse.exerciseOne.Car;
import com.mandiri.clubhouse.exerciseOne.Type;

public class Main {

    /**
     * entry point, biasanya digunakan oleh bahasa yang mendukung OOP dan compiled language
     * */

    public static void main(String[] args) {
        Car carOne = new Car("Nissan GTR Nismo", 6, Type.ELECTRIC);
        System.out.println(carOne.isRaceEngine(false));
        carOne.checkType();

        /**
         * class yang mewarisi class abstrack dapat memanggil method
         * tanpa mendelkarasikan method tersebut di class induk
         * */

        carOne.turbo();
    }
}
