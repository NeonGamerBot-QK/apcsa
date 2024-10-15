package com.saahild.bedroom.components;

public class Bed {

  private Boolean isMade;
  private Boolean isBlanketOnTop;
  private Boolean isBeingSatOn;

  public Bed() {
    isMade = true;
    isBlanketOnTop = true;
    isBeingSatOn = true;
  }

  public Bed(Boolean pisMade, Boolean pisBlanketOnTop, Boolean pisBeingSatOn) {
    isMade = pisMade;
    isBlanketOnTop = pisBlanketOnTop;
    isBeingSatOn = pisBeingSatOn;
  }

  public Boolean isMade() {
    return isMade;
  }

  public void make() {
    isMade = true;
  }

  public void unmake() {
    isMade = false;
  }

  public Boolean isBlanketOnTop() {
    return isBlanketOnTop;
  }

  public void putBlanket() {
    isBlanketOnTop = true;
  }

  public void removeBlanket() {
    isBlanketOnTop = false;
  }

  public Boolean isBeingSatOn() {
    return isBeingSatOn;
  }

  public void sitOn() {
    isBeingSatOn = true;
  }

  public void getUp() {
    isBeingSatOn = false;
  }
}
