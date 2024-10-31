package com.saahild.villains;

import com.saahild.Hero;
import com.saahild.Person;

public class Raya extends Person {
    /**
     * Is the attack damaging
     */
    private boolean isDamaging = false;
  private final String name = "Raya the healer";

    public Raya() {
        super(110, 1);
    }
    /**
     * Heal the hero
     */
    public void heal() {
        setHealth(getHealth() + 1);
    }
    /**
     * Heal the teamate
     * @param villain
     */
    public void healTeamate(Person villain) {
        villain.setHealth(villain.getHealth() + 5);
        heal();
    }
    /**
     * Enable one time damadge
     */
    public void enableOneTimeDamadge() {
        isDamaging = true;
    }
    /**
     * Get the name of the villain
     * @return
     */
public String getName() {
    return name;
}
/**
 * Attack the hero
 * @param person
 */
    public void attackHero(Hero person) {
        if(isDamaging) {
            isDamaging = false;
            person.takeDamage(getStrength());
        } else {
            setHealth(0);
        }
    }
}
