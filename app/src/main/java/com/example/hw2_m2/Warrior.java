package com.example.hw2_m2;

import java.io.Serializable;

public class Warrior implements Serializable {
    private String name;
    private int damage;
    private int health;

    public Warrior(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getWeapon() {
        return health;
    }

    public String gethealth() {
        return null;
    }
}
