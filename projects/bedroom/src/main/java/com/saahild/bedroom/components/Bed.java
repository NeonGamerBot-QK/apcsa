package com.saahild.bedroom.components;

public class Bed {

  /**
   * Bed class
   */
  private Boolean isMade;
  private Boolean isBlanketOnTop;
  private Boolean isBeingSatOn;

  /**
   * Bed constructor, sets default values for the bed to be all true (made,blanket on top, being sat on)
   */
  public Bed() {
    isMade = true;
    isBlanketOnTop = true;
    isBeingSatOn = true;
  }

  /**
   *
   * @param pisMade Paramater: is Made
   * @param pisBlanketOnTop Paramater: is Blanket On Top
   * @param pisBeingSatOn Paramater: is Being Sat On
   */
  public Bed(Boolean pisMade, Boolean pisBlanketOnTop, Boolean pisBeingSatOn) {
    isMade = pisMade;
    isBlanketOnTop = pisBlanketOnTop;
    isBeingSatOn = pisBeingSatOn;
  }
/**
 * Is the bed made :P
 * @return
 */
  public Boolean isMade() {
    return isMade;
  }
/**
 * \make the bd
 */
  public void make() {
    isMade = true;
  }
/**
 * unmake the bed
 */
  public void unmake() {
    isMade = false;
  }
/**
 * is the blanky on the top
 * @return {Boolean}
 */
  public Boolean isBlanketOnTop() {
    return isBlanketOnTop;
  }
/**
 * put the blanket on top
 */
  public void putBlanket() {
    isBlanketOnTop = true;
  }
/**
 * removes the blanket
 */
  public void removeBlanket() {
    isBlanketOnTop = false;
  }
/**
 * is the bed being sat on
 * @return
 */
  public Boolean isBeingSatOn() {
    return isBeingSatOn;
  }
/**
 * is being sat on
 */
  public void sitOn() {
    isBeingSatOn = true;
  }
/**
 * get up from the bed
 */
  public void getUp() {
    isBeingSatOn = false;
  }
  @Override
  public String toString() {
    return "Bed{" +
            "isMade=" + isMade +
            ", isBlanketOnTop=" + isBlanketOnTop +
            ", isBeingSatOn=" + isBeingSatOn +
            '}';
  }
}
