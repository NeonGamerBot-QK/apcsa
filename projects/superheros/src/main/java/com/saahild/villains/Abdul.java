package com.saahild.villains;

import com.saahild.Hero;
import com.saahild.Person;

public class Abdul extends Person {

  private boolean isSacraficing = false;
  private final String name = "Abdul the Destroyer";

  public Abdul() {
    super(70, 5);
  }

  public void slashHero(Hero person) {
    person.takeDamage(getStrength());
    if (isSacraficing) {
      isSacraficing = false;
      setHealth(getHealth() + 2);
      setStrength(getStrength() - 10);
    }
  }

  public void sacrificeNextAttack() {
    if (getHealth() < 20) return;
    isSacraficing = true;
    setHealth(getHealth() - 20);
    setStrength(getStrength() + 10);
  }

  public String getName() {
    return name;
  }

  public void heal() {
    setHealth(getHealth() + 1);
  }
}
