package com.saahild.classes;

public class Animal {

    private boolean isAlive;
    protected int legs;

    public Animal() {
        isAlive = true;
    }

    public void die() {
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public String toString() {
        return "Animal{" + "isAlive=" + isAlive + ", legs=" + legs + '}';
    }
}
