package com.saahild.villains;

import com.saahild.Person;

public class Peter extends Person {

  private final String name = "Peter the rager";

  /**
   * Constructor for the Peter class
   * @param isRaging
   */
  public Peter(boolean isRaging) {
    super(25, 30);
    if (isRaging) {
      setStrength(getStrength() * 2);
    }
  }

  /**
   * Rage
   *
   */

  public void lastStand() {
    setHealth(1);
    setStrength(getStrength() * 2);
  }

  /**
   * +1 to strength
   */
  public void moreStrength() {
    setStrength(getStrength() + 1);
  }

  /**
   * Get the name of the villain
   * @return name of the villain
   */
  public String getName() {
    return name;
  }
}
