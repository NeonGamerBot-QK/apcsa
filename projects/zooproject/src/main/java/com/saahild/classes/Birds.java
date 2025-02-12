package com.saahild.classes;
public class Birds extends Animal {
    private boolean canFly;
    public Birds(boolean canFly) {
        super();
        this.canFly = canFly;
    }
    public void fly() {
        if (canFly) {
            System.out.println("Flying");
        } else {
            System.out.println("Can't fly");
        }
    }
    public void chirp() {
        System.out.println("Chirping");
    }
    public boolean  canFly() {
        return canFly;
    }
    
}
