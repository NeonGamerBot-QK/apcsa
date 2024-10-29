package com.saahild;

public class Hero extends Person {
    private final String name = "SuperIdol";
    public Hero() {
        super(100, 10);
    }
    public String getName() {
        return name;
    }
    public void shockAttack(Person villian) {
        villian.takeDamage(getStrength() * 1.5);
    }
}
