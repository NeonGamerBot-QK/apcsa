package com.saahild;

public class Person {

  private int health;
  private int strength;

  /**
   * Constructor for the Person class
   * @param health Health
   * @param strength Strength
   */
  public Person(int health, int strength) {
    this.health = health;
    this.strength = strength;
  }

  /**
   * Get the health of the person
   * @return
   */
  public int getHealth() {
    return health;
  }

  /**
   * Get the strength of the person
   * @return
   */
  public int getStrength() {
    return strength;
  }

  /**
   * Set the health of the person
   * @param health
   */
  public void setHealth(int health) {
    this.health = health;
  }

  /**
   * Set the strength of the person
   * @param strength
   */
  public void setStrength(int strength) {
    this.strength = strength;
  }

  /**
   * Take damage from the person
   * @param damage
   */
  public void takeDamage(int damage) {
    health -= damage;
  }

  /**
   * Attack the person
   * @param person
   */
  protected void attack(Person person) {
    person.takeDamage(strength);
  }

  /**
   * Heal the person
   * @param health
   */
  public void heal(int health) {
    this.health += health;
  }

  @Override
  public String toString() {
    return "Health: " + health + ", Strength: " + strength;
  }
/**
 * Check if the person is alive
 * @return Boolean
 */
  public Boolean isAlive() {
    return health > 0;
  }
}
