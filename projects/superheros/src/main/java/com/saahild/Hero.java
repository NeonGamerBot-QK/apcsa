package com.saahild;

public class Hero extends Person {

  /*
   * Name of the hero
   */
  private final String name = "SuperIdol";
  /**
   * If the next attack is a heal
   */
  private boolean isNextAttackHeal = false;
  /**
   * If the hero can use super attack
   */
  private boolean canUseSuperAttack = true;

  public Hero() {
    super(100, 10);
  }

  public String getName() {
    return name;
  }

  /**
   * Attack the villian
   * @param villian
   */
  public void shockAttack(Person villian) {
    villian.takeDamage(getStrength() * 2);
    checkForHeal();
  }

  /**
   * Heal the hero
   */
  public void healingPotion() {
    setHealth(getHealth() + 10);
    canUseSuperAttack = true;
  }

  /**
   * Set the next attack to heal
   */
  public void healNextAttack() {
    isNextAttackHeal = true;
  }

  /**
   * Check if the next attack is a heal
   */
  private void checkForHeal() {
    if (isNextAttackHeal) {
      healingPotion();
      isNextAttackHeal = false;
    }
  }

  /**
   * Super attack the villian
   * @param villian
   */
  public void superAttack(Person villian) {
    if (!canUseSuperAttack) return;
    villian.takeDamage(getStrength() * 3);
    checkForHeal();
    canUseSuperAttack = false;
  }
}
