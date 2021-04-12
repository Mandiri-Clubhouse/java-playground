package com.mandiri.clubhouse.excercisethree;

public class Main {
    public static void main(String[] args) {
        Hero gundala = new Hero("Gundala", 300, 30);
        Hero saitama = new Hero("Saitama", 300, 50);
        printSout(gundala, saitama);
        gundala.attack(saitama);
        printSout(gundala, saitama);
        gundala.attack(saitama);
        printSout(gundala, saitama);
        saitama.attack(gundala);
        printSout(gundala, saitama);
    }

    private static void printSout(Hero gundala, Hero saitama) {
        System.out.println(gundala);
        System.out.println(saitama);
    }
}
