package com.mandiri.clubhouse.exerciseOne;

/**
 * interface digunakan untuk mendifinisikan method abstrak
 * kelas yang mengimplement interface wajib meng override method yang telah di definisikan pada interface
 * */

interface Engine {
    String isRaceEngine(boolean state);
    void runPedals();
}
