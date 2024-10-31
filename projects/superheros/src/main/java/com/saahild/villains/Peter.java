package com.saahild.villains;

import com.saahild.Person;

public class Peter extends Person {
  private final String name = "Peter the rager";

    public Peter(boolean isRaging) {
        super(25, 30);
        if(isRaging) {
            setStrength(getStrength() * 2);
        }
    }
    public void lastStand() {
        setHealth(1);
        setStrength(getStrength() * 2);
    }
    public void moreStrength() {
        setStrength(getStrength() + 1);
    }
    public String getName() {
        return name;
    }
}
