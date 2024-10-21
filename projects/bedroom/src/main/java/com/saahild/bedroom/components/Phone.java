package com.saahild.bedroom.components;

public class Phone {

  private Boolean isOn;
  private Boolean isCharging;
  private int battery;

  public Phone(Boolean pon, Boolean pcharge, int pbat) {
    isOn = pon;
    isCharging = pcharge;
    battery = pbat;
  }

  public Boolean isOn() {
    return isOn;
  }

  public void turnOn() {
    isOn = true;
  }

  public void turnOff() {
    isOn = false;
  }

  public Boolean isCharging() {
    return isCharging;
  }

  public void startCharging() {
    isCharging = true;
  }

  public void stopCharging() {
    isCharging = false;
  }

  public int getBattery() {
    return battery;
  }

  /**
   *
   * @param deg THe amount by which the battery is to be increased
   */
  public void increaseBattery(int deg) {
    battery += deg;
  }

  public void increaseBattery() {
    increaseBattery(5);
  }

  public void decreaseBattery(int deg) {
    battery -= deg;
  }

  public void decreaseBattery() {
    decreaseBattery(5);
  }
}
