package com.mandiri.clubhouse.excercisethree;

public class Hero {
    private String name;
    private Integer hp;
    private Integer damage;

    public Hero(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name+"{"+
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }

    public void attack(Hero anotherHero) {
        anotherHero.hp -= this.damage;
        System.out.println(this.name +" attack "+anotherHero.name);
    }
}
